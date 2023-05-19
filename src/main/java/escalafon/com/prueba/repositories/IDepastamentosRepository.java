package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepastamentosRepository extends JpaRepository<departamento,Integer> {
}
