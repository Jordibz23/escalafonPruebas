package escalafon.com.prueba.service;

import escalafon.com.prueba.models.categoria;
import escalafon.com.prueba.repositories.ICategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriasService {

    private ICategoriasRepository categoriasRepository;

    @Autowired
    public CategoriasService(ICategoriasRepository categoriasRepository) {
        this.categoriasRepository = categoriasRepository;
    }
    public List<categoria> listarCategorias(){
        return categoriasRepository.findAll();
    }
}
