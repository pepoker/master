/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.pepoker.sga.sga.servicio;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.pepoker.sga.eis.PersonaDao;
import mx.com.pepoker.sga.sga.domain.Persona;

/**
 *
 * @author eduardo
 */
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{
    
    @EJB
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersonas(){
        return personaDao.findAllPersonas();
    }
    

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }

    
}
