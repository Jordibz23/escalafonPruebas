package escalafon.com.prueba.service;

import escalafon.com.prueba.models.persona;
import escalafon.com.prueba.repositories.IPersonasRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PersonasImpl implements IPersonasRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<persona> getPersonas() {
        String sql = "FROM persona";
        return entityManager.createQuery(sql).getResultList();
    }
}
