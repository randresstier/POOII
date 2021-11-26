/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.controladores;

import com.tulabor.tulabor.modelo.Categoria;
import com.tulabor.tulabor.modelo.DataService;
import com.tulabor.tulabor.modelo.Empresa;
import com.tulabor.tulabor.paginas.ModeloCategoria;
import com.tulabor.tulabor.paginas.ModeloCategorias;
import com.tulabor.tulabor.paginas.ModeloEmpresas;
import com.tulabor.tulabor.repositorio.CategoriaRepositorio;
import com.tulabor.tulabor.repositorio.EmpresaRepositorio;
import io.javalin.http.Context;
import java.sql.SQLException;
import java.util.Collections;

/**
 *
 * @author richard
 */
public class EmpresaControlador {
    private final EmpresaRepositorio empresaRepositorio;
    private final CategoriaRepositorio  categoriaRepositorio;

    public EmpresaControlador(DataService dao) {
        this.empresaRepositorio  = new EmpresaRepositorio(dao);
        this.categoriaRepositorio  = new CategoriaRepositorio(dao);
    }

    public void listar(Context ctx) throws SQLException {
        var modelo = new ModeloEmpresas();
        modelo.empresas=this.empresaRepositorio.listar();
        ctx.render("empresas.jte", Collections.singletonMap("modelo", modelo));        
    }

    public void nuevo(Context ctx) throws SQLException {
        var modelo=new ModeloCategorias();
        modelo.categorias=this.categoriaRepositorio.listar();
        ctx.render("crearEmpresa.jte", Collections.singletonMap("modelo", modelo));        
    }
    
    public void crear(Context ctx) throws SQLException {
        //String nombre, Integer CantidadEmpleados, String correo, String descripcion
        System.out.println("creando empresa");
        System.out.println(ctx.formParamMap());
        System.out.println(ctx.formParam("empleados"));
        System.out.println(ctx.formParam("correo"));
        System.out.println(ctx.formParam("descripcion"));
        System.out.println(ctx.formParam("categoria"));
        
        Categoria categoria =this.categoriaRepositorio.getCategoria(Long.parseLong(ctx.formParam("categoria")));
        
        var object = new Empresa(ctx.formParam("empresa"),ctx.formParam("empleados"),ctx.formParam("correo"),ctx.formParam("descripcion"),categoria);
        System.out.println(object);
        this.empresaRepositorio.crear(object);
        //this.empresaRepositorio.listar();
        ctx.redirect("/admin/empresas");        
    }
}


