package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.hijos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHijosRepository extends JpaRepository<hijos,Integer> {
}
