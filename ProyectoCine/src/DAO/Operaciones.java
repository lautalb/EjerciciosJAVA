/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.CentroComercial;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author alumno
 */
public class Operaciones {
    
    public void Alta(Object obj){
        SessionFactory miSesion = Conexion.getSessionFactory();
        
        Session session;
        //abrimos la sesion
        session=miSesion.openSession();
        
        Transaction tx = session.beginTransaction();
        
        //grabamos en la base de datos los datos que en este caso le pasamos el objeto persona
        session.save(obj);
        tx.commit();
        //cerramos la session
        session.close();
        //mostramos un mensaje para verificar
        JOptionPane.showMessageDialog(null, "Los datos fueron guardados correctamente");
        
    }
    
    
    public List<Object> Listar(String dato)
    {   List<Object> lista=null;
        SessionFactory miSesion = Conexion.getSessionFactory();
        
        Session session;
        //abrimos la sesion
        session=miSesion.openSession();
        Transaction tx = session.beginTransaction();
        
        lista=session.createQuery("from "+dato).list();
        
        return lista;
    }
    
    public void Baja()
    {
        
    }
    
}
