package EJB;

import DAO.DAOAlumno;
import Modelo.Alumno;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class BeanAltaAlumno {

    private Alumno alumno=new Alumno();
    private List<Alumno> listaAlumnos=new ArrayList<Alumno>();
    private DAOAlumno daoAlumno;
    
    public BeanAltaAlumno() {
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    //métodos de lógica
    public String registrar() throws Exception
    {
        try 
        {
            daoAlumno=new DAOAlumno();
            daoAlumno.Registrar(alumno);
            return "index";
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
}
