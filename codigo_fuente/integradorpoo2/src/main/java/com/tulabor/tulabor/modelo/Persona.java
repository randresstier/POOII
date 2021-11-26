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
import javax.persistence.Table;

/**
 *
 * @author richard
 */
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    @Id
    @Column(name="idPersona")
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idPersona;
    @Column(name = "nombre", nullable = false, length = 50 )
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 50 )
    private String apellido;
    @Column(name = "edad", nullable = false)
    private int edad;
    @Column(name = "correo", nullable = false, length = 50 )
    private String correo;
    
    @Column(name = "documento", nullable = false, length = 50 )
    private String documento;
    
    @Column(name = "tipoDocumento", nullable = false, length = 50 )
    private String tipoDocumento;
    
    @Column(name = "nacionalidad", nullable = false, length = 50 )
    private String nacionalidad;
    
    @Column(name = "telefono", nullable = false, length = 50 )
    private String telefono;
    
    @Column(name = "estado", nullable = false, length = 50 )
    private String estado;
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String correo, String documento, String tipoDocumento, String nacionalidad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.estado = "ACTIVO";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        if (!Objects.equals(this.tipoDocumento, other.tipoDocumento)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", correo=" + correo + ", documento=" + documento + ", tipoDocumento=" + tipoDocumento + ", nacionalidad=" + nacionalidad + ", telefono=" + telefono + ", estado=" + estado + '}';
    }
    
    
    
}



