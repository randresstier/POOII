/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author richard
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idUsuario")
    private Long idUsuario;
    
    private String pass;
    @Column(name = "pass", nullable = false, length = 250 )
    private String rol;
    @Column(name = "rol", nullable = false, length = 50 )
    private String estado;
    @Column(name = "estado", nullable = false, length = 50 )

    
    public Long getIdUsuario() {
        return idUsuario;
    }




    
}
