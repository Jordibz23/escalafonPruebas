package escalafon.com.prueba.controllers;

import escalafon.com.prueba.models.categoria;
import escalafon.com.prueba.models.escuela;
import escalafon.com.prueba.models.facultad;
import escalafon.com.prueba.service.CategoriasService;
import escalafon.com.prueba.service.EscuelaService;
import escalafon.com.prueba.service.FacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/datos")
public class DatosRestController {

    private CategoriasService categoriasService;
    private EscuelaService escuelaService;
    private FacultadService facultadService;

    public DatosRestController(CategoriasService categoriasService, EscuelaService escuelaService, FacultadService facultadService) {
        this.categoriasService = categoriasService;
        this.escuelaService = escuelaService;
        this.facultadService = facultadService;
    }

    @Autowired


    @GetMapping(value = "facultades", headers = "Accept=application/json")
    public List<facultad> getFacultades(){
        return facultadService.listarFacultades();
    }

    @GetMapping(value = "escuelas", headers = "Accept=application/json")
    public List<escuela> getEscuelas(){
        return escuelaService.listarEscuelas();
    }

    @GetMapping(value = "categorias", headers = "Accept=application/json")
    public List<categoria> getCategorias(){
        return categoriasService.listarCategorias();
    }

}
