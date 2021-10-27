/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.modelo;

import java.util.List;

/**
 *
 * @author richard
 */
public interface IDataService {

    public void iniciarTransaccion();

    public void insertar(Object o);

    public<T extends Object> List<T> buscarTodos(Class<T> clase);

    public <T extends Object> T buscar(Class<T> clase, Object id);

    public void modificar(Object o);

    public void descartarTransaccion();

    public void eliminar(Object o);

    public void confirmarTransaccion();



}
