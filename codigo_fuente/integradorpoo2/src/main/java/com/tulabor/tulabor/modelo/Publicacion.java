/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.modelo;

/**
 *
 * @author richard

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "publicaciones")
public class Publicacion implements Serializable {
    private static final long serialVersionUID = 1L;  
    @Id
    @Column(name="idPublicacion")
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idPublicacion;
    @Column(name = "titulo", nullable = false, length = 50 )
    private String titulo;
    @Column(name = "descripcion", nullable = false, length = 250 )
    private String descripcion;
    @Column(name = "estado", nullable = false, length = 50 )
    private String estado;
    /*    @Column(name = "fechaCreacion", nullable = false)
    private String fechaCreacion;*/
    @Column(name="fechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fechaCreacion;
    
    @Column(name = "fechaLimite", nullable = false)
    private String fechaLimite;
    @Column(name = "sueldo", nullable = false, length = 50 )
    private String sueldo;
    @Column(name = "modalidad", nullable = false, length = 50 )
    private String modalidad;
    
    @ManyToOne
    private Empresa empresa;
    
    @OneToOne
    private Categoria categoria;


    public Publicacion() {
    }

    public Publicacion(String titulo, String descripcion,String fechaLimite, String sueldo, String modalidad, Empresa empresa, Categoria categoria) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = "ACTIVO";
        this.fechaLimite = fechaLimite;
        this.sueldo = sueldo;
        this.modalidad = modalidad;
        this.empresa = empresa;
        this.categoria = categoria;
    }

    public Long getId() {
        return idPublicacion;
    }

    public void setIdPublicacion(Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.idPublicacion);
        hash = 17 * hash + Objects.hashCode(this.titulo);
        hash = 17 * hash + Objects.hashCode(this.descripcion);
        hash = 17 * hash + Objects.hashCode(this.estado);
        hash = 17 * hash + Objects.hashCode(this.fechaCreacion);
        hash = 17 * hash + Objects.hashCode(this.fechaLimite);
        hash = 17 * hash + Objects.hashCode(this.sueldo);
        hash = 17 * hash + Objects.hashCode(this.modalidad);
        hash = 17 * hash + Objects.hashCode(this.empresa);
        hash = 17 * hash + Objects.hashCode(this.categoria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacion, other.fechaCreacion)) {
            return false;
        }
        if (!Objects.equals(this.fechaLimite, other.fechaLimite)) {
            return false;
        }
        if (!Objects.equals(this.sueldo, other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.modalidad, other.modalidad)) {
            return false;
        }
        if (!Objects.equals(this.idPublicacion, other.idPublicacion)) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "idPublicacion=" + idPublicacion + ", titulo=" + titulo + ", descripcion=" + descripcion + ", estado=" + estado + ", fechaCreacion=" + fechaCreacion + ", fechaLimite=" + fechaLimite + ", sueldo=" + sueldo + ", modalidad=" + modalidad + ", empresa=" + empresa + ", categoria=" + categoria + '}';
    }

    

}