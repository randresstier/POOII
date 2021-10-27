package edu.unam.jte.modelo;

public class Revision {
    private int id;
    private int calificacion;
    private String comentario;
    private String consejo;
    private Curso curso;

    public Revision() {
    }

    public Revision(int calificacion, String comentario, String consejo, Curso curso) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.consejo = consejo;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getConsejo() {
        return consejo;
    }

    public void setConsejo(String consejo) {
        this.consejo = consejo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + calificacion;
        result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
        result = prime * result + ((consejo == null) ? 0 : consejo.hashCode());
        result = prime * result + ((curso == null) ? 0 : curso.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Revision other = (Revision) obj;
        if (calificacion != other.calificacion)
            return false;
        if (comentario == null) {
            if (other.comentario != null)
                return false;
        } else if (!comentario.equals(other.comentario))
            return false;
        if (consejo == null) {
            if (other.consejo != null)
                return false;
        } else if (!consejo.equals(other.consejo))
            return false;
        if (curso == null) {
            if (other.curso != null)
                return false;
        } else if (!curso.equals(other.curso))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Revision [calificacion=" + calificacion + ", comentario=" + comentario + ", consejo=" + consejo
                + ", curso=" + curso + ", id=" + id + "]";
    }

    

}