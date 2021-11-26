/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.controladores;

import com.tulabor.tulabor.modelo.Categoria;
import com.tulabor.tulabor.modelo.DataService;
import com.tulabor.tulabor.modelo.Empresa;
import com.tulabor.tulabor.modelo.Persona;
import com.tulabor.tulabor.paginas.ModeloCategorias;
import com.tulabor.tulabor.paginas.ModeloEmpresas;
import com.tulabor.tulabor.paginas.ModeloPersonas;
import com.tulabor.tulabor.repositorio.EmpresaRepositorio;
import com.tulabor.tulabor.repositorio.PersonaRepositorio;
import io.javalin.http.Context;
import java.sql.SQLException;
import java.util.Collections;

/**
 *
 * @author richard
 */
public class PersonaControlador {
    private final PersonaRepositorio usuarioRepositorio;

    public PersonaControlador(DataService dao) {
        this.usuarioRepositorio  = new PersonaRepositorio(dao);
    }
    
    
    public void listar(Context ctx) throws SQLException {
        var modelo = new ModeloPersonas();
        modelo.personas=this.usuarioRepositorio.listar();
        ctx.render("usuarios.jte", Collections.singletonMap("modelo", modelo));        
    }

    public void nuevo(Context ctx) throws SQLException {
        //var modelo=new ModeloCategorias();
        //modelo.categorias=this.categoriaRepositorio.listar();
        ctx.render("crearUsuario.jte", Collections.singletonMap("modelo", ""));        
    }
    
    public void crear(Context ctx) throws SQLException {
        try {
            
            //String nombre, Integer CantidadEmpleados, String correo, String descripcion
            System.out.println("creando usuario");
            System.out.println(ctx.formParamMap());
            System.out.println(ctx.formParam("nombre"));
            System.out.println(ctx.formParam("apellido"));
            System.out.println(ctx.formParam("edad"));
            System.out.println(ctx.formParam("tipodocumento"));
            System.out.println(ctx.formParam("documento"));
            System.out.println(ctx.formParam("telefono"));
            System.out.println(ctx.formParam("correo"));
            System.out.println(ctx.formParam("nacionalidad"));

            var object = new Persona(ctx.formParam("nombre"),ctx.formParam("apellido"),Integer.parseInt(ctx.formParam("edad")),ctx.formParam("correo"),ctx.formParam("documento"),ctx.formParam("tipoDocumento"),ctx.formParam("nacionalidad"),ctx.formParam("telefono"));
            System.out.println(object);
            this.usuarioRepositorio.crear(object);
            //this.empresaRepositorio.listar();
            ctx.redirect("/admin/usuarios");             
        } catch (Exception e) {
            System.out.println("****************");
            System.out.println("Exception "+e.toString());
            System.out.println("****************");
        }
        
    }
}