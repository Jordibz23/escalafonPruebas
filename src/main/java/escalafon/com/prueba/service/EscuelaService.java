package escalafon.com.prueba.service;


import escalafon.com.prueba.models.escuela;
import escalafon.com.prueba.repositories.IEscuelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EscuelaService{

    private IEscuelaRepository escuelaRepository;

    @Autowired
    public EscuelaService(IEscuelaRepository escuelaRepository) {
        this.escuelaRepository = escuelaRepository;
    }

    public List<escuela> listarEscuelas(){
        return escuelaRepository.findAll();
    }
}
