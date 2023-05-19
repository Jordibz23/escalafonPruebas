package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonasRepository extends JpaRepository<persona,String> {

}
