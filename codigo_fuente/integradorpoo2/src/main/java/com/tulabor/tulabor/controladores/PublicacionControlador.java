/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.controladores;

import com.tulabor.tulabor.modelo.DataService;
import com.tulabor.tulabor.modelo.Publicacion;
import com.tulabor.tulabor.paginas.ModeloCategorias;
import com.tulabor.tulabor.paginas.ModeloEmpresas;
import com.tulabor.tulabor.paginas.ModeloPublicaciones;
import com.tulabor.tulabor.repositorio.CategoriaRepositorio;
import com.tulabor.tulabor.repositorio.EmpresaRepositorio;
import com.tulabor.tulabor.repositorio.PublicacionRepositorio;
import io.javalin.http.Context;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Map;

/**
 *
 * @author richard
 */
public class PublicacionControlador {
    private final EmpresaRepositorio empresaRepositorio;
    private final CategoriaRepositorio  categoriaRepositorio;
    private final PublicacionRepositorio  publicacionRepositorio;

    public PublicacionControlador(DataService dao) {
        this.empresaRepositorio  = new EmpresaRepositorio(dao);
        this.categoriaRepositorio  = new CategoriaRepositorio(dao);
        this.publicacionRepositorio  = new PublicacionRepositorio(dao);
    }

    public void listar(Context ctx) throws SQLException {
        var modelo = new ModeloPublicaciones();
        modelo.publicaciones=this.publicacionRepositorio.listar();
        ctx.render("publicaciones.jte", Collections.singletonMap("modelo", modelo));        
    }

    public void nuevo(Context ctx) throws SQLException {
        var categoria=new ModeloCategorias();
        categoria.categorias=this.categoriaRepositorio.listar();
        System.out.println("CATEGORIAS");
        var empresa=new ModeloEmpresas();
        empresa.empresas=this.empresaRepositorio.listar();
        System.out.println("EMPRESAS");

        ctx.render("crearPublicacion.jte",  Map.of("categoria" , categoria, "empresa" , empresa));        
    }
    
    public void crear(Context ctx) throws SQLException {
        //String nombre, Integer CantidadEmpleados, String correo, String descripcion
        System.out.println("creando Publicacion");
        System.out.println(ctx.formParamMap());
        System.out.println(ctx.formParam("titulo"));
        System.out.println(ctx.formParam("descripcion"));
        System.out.println(ctx.formParam("fechaLimite"));
        System.out.println(ctx.formParam("sueldo"));
        System.out.println(ctx.formParam("modalidad"));
        System.out.println(ctx.formParam("empresa"));
        System.out.println(ctx.formParam("categoria"));
        
        var empresa=this.empresaRepositorio.getEmpresa(Long.parseLong(ctx.formParam("empresa")));
        var categoria =this.categoriaRepositorio.getCategoria(Long.parseLong(ctx.formParam("categoria")));

        Publicacion publicacion = new Publicacion(ctx.formParam("titulo"),ctx.formParam("descripcion"),ctx.formParam("fechaLimite"), ctx.formParam("sueldo"), ctx.formParam("modalidad"), empresa, categoria);
        this.publicacionRepositorio.crear(publicacion);
        
        //this.empresaRepositorio.listar();
        ctx.redirect("/publicaciones");        
    }
}


