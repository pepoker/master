/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.HolaMundoEJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author eduardo
 */
public class HolaMundoEJBTest {
    
    private static EJBContainer contenedor;
    private static Context contexto;
    private static HolaMundoEJB holaMundoEJB;
    
    public HolaMundoEJBTest() {
    }
    
    @Before
    public void iniciarContenedores() throws NamingException{
        System.out.println("Iniciando contenedor");
        contenedor = EJBContainer.createEJBContainer();
        contexto = contenedor.getContext();
        holaMundoEJB = (HolaMundoEJB)contexto.lookup("java:global/classes/HolaMundoEJB!beans.HolaMundoEJB");
    }
    
    @Test
    public void testAddNumbers(){
        int a=2;
        int b= 3;
        assertEquals("El resultado no es correcto", a+b, holaMundoEJB.sumar(a, b));
        System.err.println("Termino");
                
    }
}
