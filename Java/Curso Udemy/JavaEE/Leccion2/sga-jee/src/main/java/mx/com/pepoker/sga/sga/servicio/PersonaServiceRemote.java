/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.pepoker.sga.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.pepoker.sga.sga.domain.Persona;

/**
 *
 * @author eduardo
 */

@Remote
public interface PersonaServiceRemote {
    List<Persona> listarPersonas();
    
    Persona encontrarPersonaPorId(Persona persona);
    
    Persona encontrarPersonaPorEmail(Persona persona);
    
    void registrarPersona(Persona persona);
    
    void modificarPersona(Persona persona);
    
    void eliminarPersona(Persona persona);
    
}
