package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.regimenpensiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegimenPensionesRepository extends JpaRepository<regimenpensiones,Integer> {
}
