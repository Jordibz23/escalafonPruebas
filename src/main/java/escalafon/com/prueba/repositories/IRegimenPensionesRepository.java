package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.regimenpensiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegimenPensionesRepository extends JpaRepository<regimenpensiones,Integer> {
}
