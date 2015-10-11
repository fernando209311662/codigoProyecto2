package DAO;

import Modelo.Profesor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

public class DAOProfesor 
{
    private Session session;
    private Transaction trans;
    private List<Profesor> listaProfesores;
    
    public void Registrar(Profesor profesor) throws Exception 
    {
        try 
        {
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.save(profesor);
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
    
    public void Eliminar(Profesor profesor) throws Exception
    {
        try 
        {
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.delete(profesor);
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

    public void Modificar(Profesor profesor) throws Exception {
        try 
        {
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.update(profesor);
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

    public List<Profesor> Listar() throws Exception 
    {
        try 
        {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria cri = session.createCriteria(Profesor.class);
            cri.addOrder(Order.asc("apellidos"));
            listaProfesores = cri.list();
        }
        catch (Exception ex)
        {
            throw ex;
        }
        return listaProfesores;
    }
}
