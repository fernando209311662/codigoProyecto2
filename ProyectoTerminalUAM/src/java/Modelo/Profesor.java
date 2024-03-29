package Modelo;
// Generated 10/10/2015 03:27:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Profesor generated by hbm2java
 */
public class Profesor  implements java.io.Serializable {


     private int numeroEmpleado;
     private String nombre;
     private String cotrasena;
     private Set grupos = new HashSet(0);

    public Profesor() {
    }

	
    public Profesor(int numeroEmpleado, String nombre) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
    }
    public Profesor(int numeroEmpleado, String nombre, String cotrasena, Set grupos) {
       this.numeroEmpleado = numeroEmpleado;
       this.nombre = nombre;
       this.cotrasena = cotrasena;
       this.grupos = grupos;
    }
   
    public int getNumeroEmpleado() {
        return this.numeroEmpleado;
    }
    
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCotrasena() {
        return this.cotrasena;
    }
    
    public void setCotrasena(String cotrasena) {
        this.cotrasena = cotrasena;
    }
    public Set getGrupos() {
        return this.grupos;
    }
    
    public void setGrupos(Set grupos) {
        this.grupos = grupos;
    }




}


