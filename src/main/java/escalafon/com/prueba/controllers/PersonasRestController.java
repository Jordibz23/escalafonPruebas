package escalafon.com.prueba.controllers;

import escalafon.com.prueba.models.facultad;
import escalafon.com.prueba.models.persona;
import escalafon.com.prueba.repositories.IPersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/personas")
public class PersonasRestController {

    @Autowired
    private IPersonasRepository perrepo;

    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<persona> getPersonas(){
        return perrepo.getPersonas();
    }
}
