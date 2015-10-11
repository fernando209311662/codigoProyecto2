package Beans;

import DAO.DAOProfesor;
import Modelo.Profesor;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BeanAltaProfesor {

    public BeanAltaProfesor() {
    }
    
    private Profesor profesor=new Profesor();
    private List<Profesor> listaProfesores=new ArrayList<Profesor>();
    private DAOProfesor daoProfesor;

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(List<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }
    
    //Métodos de Lógica
    
    public String registrar() throws Exception
    {
        try 
        {
            daoProfesor=new DAOProfesor();
            daoProfesor.Registrar(profesor);
            return "index";
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    
}
