/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author richard
 */
@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;  
    @Id
    @Column(name="idCategoria")
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idEmpresa;
    @Column(name = "nombre", nullable = false, length = 50 )
    private String nombre;
    @Column(name = "estado", nullable = false, length = 50 )
    private String estado;
    @Column(name = "CantidadEmpleados", nullable = false)
    private String CantidadEmpleados;
    @Column(name = "correo", nullable = false, length = 50 )
    private String correo;

    public Empresa(String nombre, String CantidadEmpleados, String correo, String descripcion, Categoria categoria) {
        this.nombre = nombre;
        this.estado = "ACTIVO";
        this.CantidadEmpleados = CantidadEmpleados;
        this.correo = correo;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }
    @Column(name = "descripcion", nullable = false, length = 250 )
    private String descripcion;
    
    @ManyToOne
    private Categoria categoria;

    public Empresa(){
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
  
    
    public Long getId() {
        return idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCantidadEmpleados() {
        return CantidadEmpleados;
    }

    public void setCantidadEmpleados(String CantidadEmpleados) {
        this.CantidadEmpleados = CantidadEmpleados;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idEmpresa);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.estado);
        hash = 67 * hash + Objects.hashCode(this.CantidadEmpleados);
        hash = 67 * hash + Objects.hashCode(this.correo);
        hash = 67 * hash + Objects.hashCode(this.descripcion);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.idEmpresa, other.idEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.CantidadEmpleados, other.CantidadEmpleados)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empresa{" + "idEmpresa=" + idEmpresa + ", nombre=" + nombre + ", estado=" + estado + ", CantidadEmpleados=" + CantidadEmpleados + ", correo=" + correo + ", descripcion=" + descripcion + ", categoria=" + categoria + '}';
    }
    
    
  
}