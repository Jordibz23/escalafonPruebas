package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IPersonasRepository extends JpaRepository<persona,String> {

    @Query("SELECT p FROM persona p WHERE p.carper.id = :idCargoPersona")
    List<persona> findByCargoPersona(int idCargoPersona);
}
