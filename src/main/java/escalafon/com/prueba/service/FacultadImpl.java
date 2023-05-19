package escalafon.com.prueba.service;

import escalafon.com.prueba.models.facultad;
import escalafon.com.prueba.repositories.IFacultadesRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.PersistenceContext;
import jakarta.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class FacultadImpl implements IFacultadesRepository {
   @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<facultad> getFacultades() {
        String sql = "FROM facultad";
        return entityManager.createQuery(sql).getResultList();
    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public void registrar(facultad fac) {

    }

    @Override
    public facultad verificar(facultad fac) {
        return null;
    }

    @Override
    public Optional<facultad> findOneByEmail(String email) {
        return Optional.empty();
    }
}
