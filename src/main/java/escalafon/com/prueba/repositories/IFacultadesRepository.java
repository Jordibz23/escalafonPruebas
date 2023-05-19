package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.facultad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IFacultadesRepository extends JpaRepository<facultad,Integer> {

}
