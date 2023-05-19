package escalafon.com.prueba.controllers;

import escalafon.com.prueba.models.facultad;
import escalafon.com.prueba.models.persona;
import escalafon.com.prueba.models.personaSimple;
import escalafon.com.prueba.repositories.IPersonasRepository;
import escalafon.com.prueba.service.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/personas")
public class PersonasRestController {

    private PersonasService personasService;

    @Autowired
    public PersonasRestController(PersonasService personasService) {
        this.personasService = personasService;
    }

    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<persona> getPersonas(){
        return personasService.listarPersonas();
    }

    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void CrearPersona(@RequestBody personaSimple person){
        personasService.guardarPersona(person);
    }
}
