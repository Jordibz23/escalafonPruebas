package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.hijos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHijosRepository extends JpaRepository<hijos,Integer> {
}
