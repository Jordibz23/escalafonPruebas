package escalafon.com.prueba.repositoriesDatos;

import escalafon.com.prueba.modelsDatos.departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepastamentosRepository extends JpaRepository<departamento,Integer> {
}
