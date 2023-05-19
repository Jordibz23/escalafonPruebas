package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEscuelaRepository extends JpaRepository<escuela,Integer> {

}
