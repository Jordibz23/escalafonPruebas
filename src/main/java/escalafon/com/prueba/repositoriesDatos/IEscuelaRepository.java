package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEscuelaRepository extends JpaRepository<escuela,Integer> {

}
