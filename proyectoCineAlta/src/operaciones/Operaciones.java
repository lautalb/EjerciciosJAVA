/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import Entidades.Persona;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author lauta
 */
public class Operaciones {
    public void AltaDePersona(Persona user)
    {   //instanciamos la sesion que vamos a utilizar, con la clase conexion, usando el metodo get session factory.
        SessionFactory miSesion = Conexion.getSessionFactory();
        
        Session session;
        //abrimos la sesion
        session=miSesion.openSession();
        
        Transaction tx = session.beginTransaction();
        
        //grabamos en la base de datos los datos que en este caso le pasamos el objeto persona
        session.save(user);
        tx.commit();
        //cerramos la session
        session.close();
        //mostramos un mensaje para verificar
        JOptionPane.showMessageDialog(null, "Los datos fueron guardados correctamente");
        
    }
    
    public List<Persona> Listar()
    {   List<Persona> lista=null;
        SessionFactory miSesion = Conexion.getSessionFactory();
        
        Session session;
        //abrimos la sesion
        session=miSesion.openSession();
        Transaction tx = session.beginTransaction();
        lista=session.createQuery("from Persona").list();
        
        return lista;
    }
}
