/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import mx.com.pepoker.sga.sga.domain.Persona;
import mx.com.pepoker.sga.sga.servicio.PersonaService;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author eduardo
 */
public class PersonaServiceTest {
    
    private PersonaService personaService;
    
    @Before
    public void setUp() throws Exception{
        EJBContainer contenedor = EJBContainer.createEJBContainer();
        personaService = (PersonaService)contenedor.getContext().lookup("java:global/classes/PersonaServiceImpl!mx.com.pepoker.sga.sga.servicio.PersonaService");
    }
    
    @Test
    public void testEJBPersonaService(){
        System.out.println("Iniciando test EJB PersonaServices");
        assertTrue((personaService != null));
        assertEquals(2,personaService.listarPersonas().size());
        
        System.out.println("El numero de personas es igual a: "+ personaService.listarPersonas().size());
        
        this.desplegarPersonas(personaService.listarPersonas());
        
        System.out.println("Fin test EJB PersonaServices");
                
    }
    
    public void desplegarPersonas(List<Persona> personas){
        personas.stream().forEach((persona) -> {
            System.out.println(persona);
        });
    }
}
