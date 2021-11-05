/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.repositorio;

import com.tulabor.tulabor.modelo.DataService;
import com.tulabor.tulabor.modelo.Empresa;
import com.tulabor.tulabor.modelo.IDataService;
import com.tulabor.tulabor.modelo.Publicacion;
import java.util.List;

/**
 *
 * @author richard
 */
public class PublicacionRepositorio {
    
    private final IDataService dao;
    
    public PublicacionRepositorio(DataService dao) {
        this.dao=dao;
    }
      
    public void crear(Publicacion publicacion) {

        dao.iniciarTransaccion();
        dao.insertar(publicacion);
        dao.confirmarTransaccion();
        
    }
    
    public List<Publicacion> listar() {
        var object = dao.buscarTodos(Publicacion.class);
        return object;
    }
}
