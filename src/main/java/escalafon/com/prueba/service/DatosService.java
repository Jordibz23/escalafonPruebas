package escalafon.com.prueba.service;

import escalafon.com.prueba.modelsDatos.*;
import escalafon.com.prueba.repositoriesDatos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatosService {

    private ICargoPersonaRepository cargoPersonaRepository;
    private ICategoriasRepository categoriasRepository;
    private ICondicionRepository condicionRepository;
    private IDedicacionRepository dedicacionRepository;
    private IDepastamentosRepository depastamentosRepository;
    private IDistritoRepository distritoRepository;
    private IEscuelaRepository escuelaRepository;
    private IEstadoCivilRepository estadoCivilRepository;
    private IEstadoPersonaRepository estadoPersonaRepository;
    private IFacultadesRepository facultadesRepository;
    private IHijosRepository hijosRepository;
    private IProvinciasRepository provinciasRepository;
    private IRegimenPensionesRepository regimenPensionesRepository;

    @Autowired
    public DatosService(ICargoPersonaRepository cargoPersonaRepository, ICategoriasRepository categoriasRepository, ICondicionRepository condicionRepository, IDedicacionRepository dedicacionRepository, IDepastamentosRepository depastamentosRepository, IDistritoRepository distritoRepository, IEscuelaRepository escuelaRepository, IEstadoCivilRepository estadoCivilRepository, IEstadoPersonaRepository estadoPersonaRepository, IFacultadesRepository facultadesRepository, IHijosRepository hijosRepository, IProvinciasRepository provinciasRepository, IRegimenPensionesRepository regimenPensionesRepository) {
        this.cargoPersonaRepository = cargoPersonaRepository;
        this.categoriasRepository = categoriasRepository;
        this.condicionRepository = condicionRepository;
        this.dedicacionRepository = dedicacionRepository;
        this.depastamentosRepository = depastamentosRepository;
        this.distritoRepository = distritoRepository;
        this.escuelaRepository = escuelaRepository;
        this.estadoCivilRepository = estadoCivilRepository;
        this.estadoPersonaRepository = estadoPersonaRepository;
        this.facultadesRepository = facultadesRepository;
        this.hijosRepository = hijosRepository;
        this.provinciasRepository = provinciasRepository;
        this.regimenPensionesRepository = regimenPensionesRepository;
    }



    public List<cargopersona> listarCargoPersona(){return cargoPersonaRepository.findAll();}
    public List<categoria> listarCategorias(){
        return categoriasRepository.findAll();
    }
    public List<condicion> listarCondicion(){return condicionRepository.findAll();}
    public List<dedicacion> listarDedicacion(){return dedicacionRepository.findAll();}
    public List<departamento> listarDepartamentos(){return depastamentosRepository.findAll();}
    public List<distrito> listarDistritos(){return distritoRepository.findAll();}
    public List<escuela> listarEscuelas(){
        return escuelaRepository.findAll();
    }
    public List<estadocivil> listarEstadocivil(){return estadoCivilRepository.findAll();}
    public List<estadopersona> listarEstadopersona(){return estadoPersonaRepository.findAll();}
    public List<facultad> listarFacultades(){
        return facultadesRepository.findAll();
    }
    public Optional<facultad> buscarNombreFacultad(int id){return facultadesRepository.findById(id);}
    public List<hijos> listarHijos(){return hijosRepository.findAll();};
    public List<provincia> listarProvincia(){return provinciasRepository.findAll();}
    public List<regimenpensiones> listarRegimenPensiones(){return regimenPensionesRepository.findAll();}

}
