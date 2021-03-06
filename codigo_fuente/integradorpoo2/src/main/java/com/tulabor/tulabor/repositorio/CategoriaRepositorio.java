/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.repositorio;

import com.tulabor.tulabor.modelo.Categoria;
import com.tulabor.tulabor.modelo.DataService;
import com.tulabor.tulabor.modelo.IDataService;
import java.util.List;

/**
 *
 * @author richard
 */
public class CategoriaRepositorio {
        
    private final IDataService dao;
    
    public CategoriaRepositorio(DataService dao) {
        this.dao=dao;
    }
      
    public void crear(Categoria categoria) {

        this.dao.iniciarTransaccion();
        this.dao.insertar(categoria);
        this.dao.confirmarTransaccion();
    }
    
    public List<Categoria> listar() {
        var object = this.dao.buscarTodos(Categoria.class);
        System.out.println("CATEGORIAS");
        System.out.println(object);
        return object;
    }
    
    public Categoria getCategoria(long categoria) {
        var object = this.dao.buscar(Categoria.class, categoria);
        System.out.println("CATEGORIA");
        System.out.println(object);
        return object;
    }
}
