package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.condicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICondicionRepository extends JpaRepository<condicion,Integer> {
}
