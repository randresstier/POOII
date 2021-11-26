/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.repositorio;

import com.tulabor.tulabor.modelo.Empresa;
import com.tulabor.tulabor.modelo.IDataService;
import com.tulabor.tulabor.modelo.Persona;
import java.util.List;

/**
 *
 * @author richard
 */
public class PersonaRepositorio {
    private final IDataService dao;

    public PersonaRepositorio(IDataService dao) {
        this.dao = dao;
    }
    
    public void crear(Persona persona) {
        dao.iniciarTransaccion();
        dao.insertar(persona);
        dao.confirmarTransaccion();
    }

    public List<Persona> listar() {
        var object = dao.buscarTodos(Persona.class);
        return object;
    }
    
    public Persona getPersona(long persona) {
        var object = this.dao.buscar(Persona.class, persona);
        System.out.println("Persona");
        System.out.println(object);
        return object;
    }
}
