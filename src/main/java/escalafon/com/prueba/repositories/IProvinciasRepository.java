package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinciasRepository extends JpaRepository<provincia,Integer> {
}
