package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.estadopersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoPersonaRepository extends JpaRepository<estadopersona,Integer> {
}
