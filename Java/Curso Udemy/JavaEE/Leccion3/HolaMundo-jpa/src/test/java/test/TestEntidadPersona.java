/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.dominio.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author eduardo
 */
public class TestEntidadPersona {
    
    static EntityManager em = null;
    static EntityTransaction tx = null;
    static EntityManagerFactory emf = null;
    Logger log = LogManager.getRootLogger();
    
    public TestEntidadPersona() {
    }
    
    @Before
    public void setup(){
        emf = Persistence.createEntityManagerFactory("PersonaPU");
        
        em = emf.createEntityManager();
    }
    
    @Test
    public void testPersonaEntity(){
        log.debug("Iniciando test Persona Entity con JPA");
        
        assertTrue(em != null);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        Persona persona1 = new Persona("Oscar", "Gomez", "Lazarios","ogomez@mail.com", "6141111111");
        log.debug("Objeto a Persistir: " + persona1);
        
        em.persist(persona1);
        tx.commit();
        
        assertTrue(persona1.getIdPersona() != null);
        
        log.debug("objeto persistido: " + persona1);
        log.debug("Fin test Persona Entity con JPA");
    
    }
    
    @After
    public void tearDown(){
        if(em!= null){
            em.close();
        }
    }
    
}
