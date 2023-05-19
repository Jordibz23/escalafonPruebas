package escalafon.com.prueba.service;

import escalafon.com.prueba.models.facultad;
import escalafon.com.prueba.repositories.IFacultadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultadService{

    private IFacultadesRepository facultadesRepository;

    @Autowired
    public FacultadService(IFacultadesRepository facultadesRepository) {
        this.facultadesRepository = facultadesRepository;
    }

    public List<facultad> listarFacultades(){
        return facultadesRepository.findAll();
    }
}
