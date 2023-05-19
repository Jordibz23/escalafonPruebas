package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDistritoRepository extends JpaRepository<distrito,Integer> {
}
