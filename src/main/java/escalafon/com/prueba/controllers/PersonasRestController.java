package escalafon.com.prueba.controllers;

import escalafon.com.prueba.modelsPersona.persona;
import escalafon.com.prueba.modelsPersona.personaSimple;
import escalafon.com.prueba.service.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
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

    @GetMapping(value = "listarCargopersona", headers = "Accept=application/json")
    public List<persona> getPersonas(@RequestParam String id){
        return personasService.listarPorCargoPersona(Integer.parseInt(id));
    }

    @PostMapping(value = "crear", headers = "Accept=application/json")
    public ResponseEntity<String>  CrearPersona(@RequestBody personaSimple person){
        try {
            personasService.guardarPersona(person);
            return new ResponseEntity<>("Registro de admin exitoso", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Ocurrio un error", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping(value = "ultimoCodigo", headers = "Accept=application/json")
    public String traerCodigo(){
        return personasService.traerCodigo();
    }

}
