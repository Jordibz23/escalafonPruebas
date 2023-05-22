package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDistritoRepository extends JpaRepository<distrito,Integer> {
}
