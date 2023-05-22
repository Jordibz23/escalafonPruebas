package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.dedicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDedicacionRepository extends JpaRepository<dedicacion,Integer> {
}
