/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.pepoker.sga.sga.cliente;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mx.com.pepoker.sga.sga.domain.Persona;
import mx.com.pepoker.sga.sga.servicio.PersonaServiceRemote;

/**
 *
 * @author eduardo
 */
public class ClientePersonaService {
    
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        try{
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote)jndi.lookup("java:global/sga-jee/PersonaServiceImpl!mx.com.pepoker.sga.sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaService.listarPersonas();
            
            for(Persona persona: personas){
                System.out.println(persona);
                        
            }
            
        }catch(NamingException e){
            e.printStackTrace();
        }
    }
}
