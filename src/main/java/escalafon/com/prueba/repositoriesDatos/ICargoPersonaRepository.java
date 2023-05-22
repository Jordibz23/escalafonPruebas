package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.cargopersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICargoPersonaRepository extends JpaRepository<cargopersona,Integer> {
}
