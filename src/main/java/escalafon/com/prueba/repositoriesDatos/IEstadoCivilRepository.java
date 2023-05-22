package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.estadocivil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoCivilRepository extends JpaRepository<estadocivil,Integer> {
}
