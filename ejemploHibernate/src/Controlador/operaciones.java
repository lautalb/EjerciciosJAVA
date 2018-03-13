/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
//importamos de la carpeta Modelo "Persona" para poder utilizarlo en los metodos de esta clase.
import Modelo.Persona;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author lauta
 */
public class operaciones {
    
    public void altaUsuarios(Persona user)
    {   //instanciamos la sesion                           //el NewHibernateUtil tiene que ser el mismo nombre de la carpeta Controlador "NewHibernateUtil.java"
        SessionFactory Misesion = NewHibernateUtil.getSessionFactory();
        
        Session session;
        
        //generamos la apertura de la sesion
        session = Misesion.openSession();
        //abrimos la transaction
        Transaction tx= session.beginTransaction();
        //grabamos en la base de datos la Persona osea todos los datos con el save.
        session.save(user);
        tx.commit();
        //cerramos la sesion una vez echo el commit
        session.close();
        //mostramos un mensaje
        JOptionPane.showMessageDialog(null, "Los datos fueron guardados correctamente");
        
        
    }
    
    public void bajaUsuarios(Persona user)
    {   //instanciamos la sesion                           //el NewHibernateUtil tiene que ser el mismo nombre de la carpeta Controlador "NewHibernateUtil.java"
        SessionFactory Misesion = NewHibernateUtil.getSessionFactory();
        
        Session session;
        
        //generamos la apertura de la sesion
        session = Misesion.openSession();
        //abrimos la transaction
        Transaction tx= session.beginTransaction();
        //grabamos en la base de datos la Persona osea todos los datos con el save.
        session.delete(user);
        tx.commit();
        //cerramos la sesion una vez echo el commit
        session.close();
        //mostramos un mensaje
        JOptionPane.showMessageDialog(null, "Los datos fueron eliminados correctamente");
        
        
    }
    
}
