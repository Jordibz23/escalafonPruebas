package escalafon.com.prueba.repositoriesPersona;

import escalafon.com.prueba.modelsPersona.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IPersonasRepository extends JpaRepository<persona,String> {

    List<persona> findByCarperIdcargopersona(int idCargoPersona);
}
