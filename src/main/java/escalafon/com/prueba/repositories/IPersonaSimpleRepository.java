package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.personaSimple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaSimpleRepository extends JpaRepository<personaSimple,String> {

    personaSimple findFirstByOrderByCodigoDesc();
}
