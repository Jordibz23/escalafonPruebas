package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.cargopersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICargoPersonaRepository extends JpaRepository<cargopersona,Integer> {
}
