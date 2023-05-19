package escalafon.com.prueba.service;

import escalafon.com.prueba.models.persona;
import escalafon.com.prueba.models.personaSimple;
import escalafon.com.prueba.repositories.IPersonaSimpleRepository;
import escalafon.com.prueba.repositories.IPersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonasService {

    private IPersonasRepository personasRepository;
    private IPersonaSimpleRepository personaSimpleRepository;

    @Autowired
    public PersonasService(IPersonasRepository personasRepository, IPersonaSimpleRepository personaSimpleRepository) {
        this.personasRepository = personasRepository;
        this.personaSimpleRepository = personaSimpleRepository;
    }




    public List<persona> listarPersonas(){
        return personasRepository.findAll();
    }

    public void guardarPersona(personaSimple personSimple){
        personaSimpleRepository.save(personSimple);
    }
}
