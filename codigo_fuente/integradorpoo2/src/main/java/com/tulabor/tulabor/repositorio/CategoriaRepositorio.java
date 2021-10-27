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
    public CategoriaRepositorio() {
        dao = new DataService();        
    }
      
    public void crear(Categoria categoria) {

        dao.iniciarTransaccion();
        dao.insertar(categoria);
        dao.confirmarTransaccion();
    }
    
    public List<Categoria> listar() {
        var Categorias = dao.buscarTodos(Categoria.class);
        System.out.println("CATEGORIAS");
        System.out.println(Categorias);
        return Categorias;
    }
}
