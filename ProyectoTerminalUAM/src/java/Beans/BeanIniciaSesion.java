package Beans;

import DAO.DAOUsuarios;
import Modelo.Alumno;
import Modelo.Profesor;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BeanIniciaSesion {
    
    Object user=new Object();
    
    public BeanIniciaSesion() {
    }
    
    public Object tipoUsuario(Object usuario)
    {
        Alumno alumno=new Alumno();
        Profesor profesor=new Profesor();
        
        if(usuario instanceof Alumno)
        {
            alumno=(Alumno)usuario;
            return alumno;
        }
        else
        {
            profesor=(Profesor)usuario;
            return profesor;
        }
    }
    
}
