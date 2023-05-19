package escalafon.com.prueba.controllers;

import escalafon.com.prueba.models.categoria;
import escalafon.com.prueba.models.escuela;
import escalafon.com.prueba.models.facultad;
import escalafon.com.prueba.repositories.ICategoriasRepository;
import escalafon.com.prueba.repositories.IEscuelaRepository;
import escalafon.com.prueba.repositories.IFacultadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/datos")
public class DatosRestController {

    @Autowired
    private IFacultadesRepository facrepo;

    @Autowired
    private IEscuelaRepository escrepo;

    @Autowired
    private ICategoriasRepository catrepo;

    @GetMapping(value = "facultades", headers = "Accept=application/json")
    public List<facultad> getFacultades(){
        return facrepo.getFacultades();
    }

    @GetMapping(value = "escuelas", headers = "Accept=application/json")
    public List<escuela> getEscuelas(){
        return escrepo.getEscuelas();
    }

    @GetMapping(value = "categorias", headers = "Accept=application/json")
    public List<categoria> getCategorias(){
        return catrepo.getCategorias();
    }

}
