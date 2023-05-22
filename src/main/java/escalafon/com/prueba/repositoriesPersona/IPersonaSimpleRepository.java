package escalafon.com.prueba.repositoriesPersona;

import escalafon.com.prueba.modelsPersona.personaSimple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaSimpleRepository extends JpaRepository<personaSimple,String> {

    personaSimple findFirstByOrderByCodigoDesc();
}
