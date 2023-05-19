package escalafon.com.prueba.service;

import escalafon.com.prueba.models.persona;
import escalafon.com.prueba.repositories.IPersonasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonasService {

    private IPersonasRepository personasRepository;

    public PersonasService(IPersonasRepository personasRepository) {
        this.personasRepository = personasRepository;
    }

    public List<persona> listarPersonas(){
        return personasRepository.findAll();
    }
}
