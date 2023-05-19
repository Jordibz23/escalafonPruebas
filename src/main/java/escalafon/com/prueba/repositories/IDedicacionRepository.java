package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.dedicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDedicacionRepository extends JpaRepository<dedicacion,Integer> {
}
