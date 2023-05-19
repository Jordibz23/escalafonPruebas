package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.condicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICondicionRepository extends JpaRepository<condicion,Integer> {
}
