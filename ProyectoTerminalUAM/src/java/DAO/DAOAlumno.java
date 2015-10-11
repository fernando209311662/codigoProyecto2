
package DAO;

import Modelo.Alumno;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

public class DAOAlumno 
{
    
    private Session session;
    private Transaction trans;
    private List<Alumno> listaAlumnos;
    
    public void Registrar(Alumno alumno) throws Exception 
    {
        try 
        {
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.save(alumno);
            trans.commit();
        }
        catch (Exception ex) 
        {
            trans.rollback();
            throw ex;
        }
        finally
        {
            if(session==null)
            {
                session.close();
            }
        }
    }
    
    public void Eliminar(Alumno alumno) throws Exception
    {
        try 
        {
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.delete(alumno);
            trans.commit();
        }
        catch (Exception ex) 
        {
            trans.rollback();
            throw ex;
        }
        finally 
        {
            session.close();
        }
    }

    public void Modificar(Alumno alumno) throws Exception {
        try 
        {
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.update(alumno);
            trans.commit();
        } 
        catch (Exception ex)
        {
            trans.rollback();
            throw ex;
        } 
        finally 
        {
            session.close();
        }
    }

    public List<Alumno> Listar() throws Exception 
    {
        try 
        {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria cri = session.createCriteria(Alumno.class);
            cri.addOrder(Order.asc("apellidos"));
            listaAlumnos = cri.list();
        }
        catch (Exception ex)
        {
            throw ex;
        }
        return listaAlumnos;
    }
}
