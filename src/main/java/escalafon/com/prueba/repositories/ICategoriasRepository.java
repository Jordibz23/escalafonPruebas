package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICategoriasRepository extends JpaRepository<categoria,Integer> {

}
