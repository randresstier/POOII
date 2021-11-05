/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.repositorio;

import com.tulabor.tulabor.modelo.Categoria;
import com.tulabor.tulabor.modelo.DataService;
import com.tulabor.tulabor.modelo.Empresa;
import com.tulabor.tulabor.modelo.IDataService;
import java.util.List;

/**
 *
 * @author richard
 */
public class EmpresaRepositorio {
        
    private final IDataService dao;
    
    public EmpresaRepositorio(DataService dao) {
        this.dao=dao;
    }
      
    public void crear(Empresa empresa) {

        dao.iniciarTransaccion();
        dao.insertar(empresa);
        dao.confirmarTransaccion();
        
    }
    
    public List<Empresa> listar() {
        var object = dao.buscarTodos(Empresa.class);
        return object;
    }
    
     public Empresa getEmpresa(long empresa) {
        var object = this.dao.buscar(Empresa.class, empresa);
        System.out.println("Empresa");
        System.out.println(object);
        return object;
    }
}
