package Modelo;
// Generated 10/10/2015 03:27:01 PM by Hibernate Tools 4.3.1



/**
 * FaseAlumnoTareaId generated by hbm2java
 */
public class FaseAlumnoTareaId  implements java.io.Serializable {


     private int idFase;
     private int idTarea;
     private int matricula;
     private String grupo;
     private String trimestreLec;

    public FaseAlumnoTareaId() {
    }

    public FaseAlumnoTareaId(int idFase, int idTarea, int matricula, String grupo, String trimestreLec) {
       this.idFase = idFase;
       this.idTarea = idTarea;
       this.matricula = matricula;
       this.grupo = grupo;
       this.trimestreLec = trimestreLec;
    }
   
    public int getIdFase() {
        return this.idFase;
    }
    
    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }
    public int getIdTarea() {
        return this.idTarea;
    }
    
    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }
    public int getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public String getTrimestreLec() {
        return this.trimestreLec;
    }
    
    public void setTrimestreLec(String trimestreLec) {
        this.trimestreLec = trimestreLec;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FaseAlumnoTareaId) ) return false;
		 FaseAlumnoTareaId castOther = ( FaseAlumnoTareaId ) other; 
         
		 return (this.getIdFase()==castOther.getIdFase())
 && (this.getIdTarea()==castOther.getIdTarea())
 && (this.getMatricula()==castOther.getMatricula())
 && ( (this.getGrupo()==castOther.getGrupo()) || ( this.getGrupo()!=null && castOther.getGrupo()!=null && this.getGrupo().equals(castOther.getGrupo()) ) )
 && ( (this.getTrimestreLec()==castOther.getTrimestreLec()) || ( this.getTrimestreLec()!=null && castOther.getTrimestreLec()!=null && this.getTrimestreLec().equals(castOther.getTrimestreLec()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdFase();
         result = 37 * result + this.getIdTarea();
         result = 37 * result + this.getMatricula();
         result = 37 * result + ( getGrupo() == null ? 0 : this.getGrupo().hashCode() );
         result = 37 * result + ( getTrimestreLec() == null ? 0 : this.getTrimestreLec().hashCode() );
         return result;
   }   


}


