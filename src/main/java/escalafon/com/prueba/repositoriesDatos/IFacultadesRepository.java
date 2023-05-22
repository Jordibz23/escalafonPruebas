package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.facultad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IFacultadesRepository extends JpaRepository<facultad,Integer> {

}
