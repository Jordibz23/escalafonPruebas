package escalafon.com.prueba.service;

import escalafon.com.prueba.models.categoria;
import escalafon.com.prueba.repositories.ICategoriasRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CategoriasImpl implements ICategoriasRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<categoria> getCategorias() {
        String sql = "FROM categoria";
        return entityManager.createQuery(sql).getResultList();
    }
}
