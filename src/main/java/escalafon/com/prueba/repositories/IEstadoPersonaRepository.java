package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.estadopersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoPersonaRepository extends JpaRepository<estadopersona,Integer> {
}
