package escalafon.com.prueba.controllers;

import escalafon.com.prueba.modelsDatos.*;
import escalafon.com.prueba.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/datos")
public class DatosRestController {

    private DatosService datosService;

    @Autowired
    public DatosRestController(DatosService datosService) {
        this.datosService = datosService;
    }


    @GetMapping(value = "facultades", headers = "Accept=application/json")
    public List<facultad> getFacultades(){
        return datosService.listarFacultades();
    }

    @GetMapping(value = "nombrefacultad/{id:.+}", headers = "Accept=application/json")
    public Optional<facultad> getNombreFacultad(@PathVariable int id){
        return datosService.buscarNombreFacultad(id);
    }

    @GetMapping(value = "cargopersona", headers = "Accept=application/json")
    public List<cargopersona> getCargoPersona(){return datosService.listarCargoPersona();}

    @GetMapping(value = "condicion", headers = "Accept=application/json")
    public List<condicion> getCondicion(){
        return datosService.listarCondicion();
    }

    @GetMapping(value = "dedicacion", headers = "Accept=application/json")
    public List<dedicacion> getDedicacion(){
        return datosService.listarDedicacion();
    }

    @GetMapping(value = "departamento", headers = "Accept=application/json")
    public List<departamento> getDepartamento(){
        return datosService.listarDepartamentos();
    }

    @GetMapping(value = "distrito", headers = "Accept=application/json")
    public List<distrito> getDistrito(){
        return datosService.listarDistritos();
    }

    @GetMapping(value = "estadocivil", headers = "Accept=application/json")
    public List<estadocivil> getEstadoCivil(){
        return datosService.listarEstadocivil();
    }

    @GetMapping(value = "estadopersona", headers = "Accept=application/json")
    public List<estadopersona> getEstadoPersona(){
        return datosService.listarEstadopersona();
    }

    @GetMapping(value = "hijos", headers = "Accept=application/json")
    public List<hijos> getHijos(){
        return datosService.listarHijos();
    }

    @GetMapping(value = "provincia", headers = "Accept=application/json")
    public List<provincia> getProvincias(){
        return datosService.listarProvincia();
    }

    @GetMapping(value = "escuelas", headers = "Accept=application/json")
    public List<escuela> getEscuelas(){
        return datosService.listarEscuelas();
    }

    @GetMapping(value = "categorias", headers = "Accept=application/json")
    public List<categoria> getCategorias(){
        return datosService.listarCategorias();
    }

    @GetMapping(value = "regimenpensiones", headers = "Accept=application/json")
    public List<regimenpensiones> getRegimenPensiones(){
        return datosService.listarRegimenPensiones();
    }

}
