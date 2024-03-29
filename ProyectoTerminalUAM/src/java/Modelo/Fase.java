package Modelo;
// Generated 10/10/2015 03:27:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Fase generated by hbm2java
 */
public class Fase  implements java.io.Serializable {


     private int idFase;
     private String nombreFase;
     private Set faseAlumnoTareas = new HashSet(0);

    public Fase() {
    }

	
    public Fase(int idFase, String nombreFase) {
        this.idFase = idFase;
        this.nombreFase = nombreFase;
    }
    public Fase(int idFase, String nombreFase, Set faseAlumnoTareas) {
       this.idFase = idFase;
       this.nombreFase = nombreFase;
       this.faseAlumnoTareas = faseAlumnoTareas;
    }
   
    public int getIdFase() {
        return this.idFase;
    }
    
    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }
    public String getNombreFase() {
        return this.nombreFase;
    }
    
    public void setNombreFase(String nombreFase) {
        this.nombreFase = nombreFase;
    }
    public Set getFaseAlumnoTareas() {
        return this.faseAlumnoTareas;
    }
    
    public void setFaseAlumnoTareas(Set faseAlumnoTareas) {
        this.faseAlumnoTareas = faseAlumnoTareas;
    }




}


