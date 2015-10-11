package DAO;

import org.hibernate.Query;
import org.hibernate.Session;

public class DAOUsuarios 
{
    private Session sesion;
    
    public Object verificaDatos(Object usuario)
    {
        Object user=null;
        try 
        {
            sesion=HibernateUtil.getSessionFactory().openSession();
            String hql="";
            Query query=sesion.createQuery(hql);
            
            if(!query.list().isEmpty())
                user=(Object)query.list().get(0);
        } 
        catch (Exception e) 
        {
            throw e;
        }
        return user;
    }
}
