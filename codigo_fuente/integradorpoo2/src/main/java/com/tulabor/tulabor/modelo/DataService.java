/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tulabor.tulabor.modelo;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

/**
 *
 * Implementación Genérica de un repositorio usando un EntityManager. 
 * Se han agregado los siguientes métodos:
 * - iniciarTransaccion()
 * - confirmarTransaccion()
 * - descartarTransaccion()
 * 
 * Es posible agregar un método para manejar parámetros de búsqueda usando una clase basada en el patrón Utility-Builder
 */

public class DataService implements IDataService{
    
    private final EntityManager em;
        
    public DataService() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();        
    }
    
    @Override
    public void iniciarTransaccion() {
        em.getTransaction().begin();
    }
    
    @Override
    public void confirmarTransaccion() {
        em.getTransaction().commit();
    }

    @Override
    public void descartarTransaccion() {
        em.getTransaction().rollback();
    }
    
    @Override
    public void insertar(Object o) {
        em.persist(o);
    }
    
    @Override
    public void modificar(Object o){
        em.merge(o);
    }

    @Override
    public void eliminar(Object o){
        em.remove(o);
    }

    public void refrescar(Object o) {
        em.refresh(o);
    }
    
    // Metodo generico
    // Acepta cualquier tipo (T) que extienda de Object
    // Devuelve un objeto de tipo (T)    
    @Override
    public <T extends Object> T buscar(Class<T> clase, Object id) {
        return (T) em.find(clase, id);
    }    
    
    // Metodo generico
    // Acepta cualquier tipo (T) que extienda de Object
    // Devuelve una lista de ese tipo (T)
    @Override
    public <T extends Object> List<T> buscarTodos (Class<T> clase) {
        // obtengo un CriteriaBuilder
        CriteriaBuilder cb = em.getCriteriaBuilder();
        // creo un CriteriaQuery
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        // defino el FROM
        Root<T> origen = consulta.from(clase);
        // defino el select (opcional)
        consulta.select(origen);
        // ejecuto y obtengo el resultado
        return em.createQuery(consulta).getResultList();      
    }

    // el parametro de orden a pasar se obtiene del metamodelo generado por EclipseLink
    public <T extends Object, P extends Object> List<T> buscarTodosOrdenadosPor (Class<T> clase, SingularAttribute<T, P> orden) {
        // obtengo un CriteriaBuilder
        CriteriaBuilder cb = em.getCriteriaBuilder();
        // creo un CriteriaQuery
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        // Defino el FROM
        Root<T> origen = consulta.from(clase); 
        // defino el select (opcional)
        consulta.select(origen);
        // ordenado de forma ascendente (cb.asc() ) 
        // el atributo de origen definido en orden
        consulta.orderBy(cb.asc(origen.get(orden)));
        // ejecuto y obtengo el resultado
        return em.createQuery(consulta).getResultList();
    }


}
