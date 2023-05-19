package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.estadocivil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoCivilRepository extends JpaRepository<estadocivil,Integer> {
}
