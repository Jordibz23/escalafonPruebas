package escalafon.com.prueba.service;

import escalafon.com.prueba.models.escuela;
import escalafon.com.prueba.repositories.IEscuelaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class EscuelaImpl implements IEscuelaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<escuela> getEscuelas() {
        String sql = "FROM escuela";
        return entityManager.createQuery(sql).getResultList();
    }
}
