package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICategoriasRepository extends JpaRepository<categoria,Integer> {

}
