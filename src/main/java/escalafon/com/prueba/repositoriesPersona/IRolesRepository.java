package escalafon.com.prueba.repositoriesPersona;

import escalafon.com.prueba.modelsPersona.roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRolesRepository extends JpaRepository<roles,Integer> {

    Optional<roles> findByName(String name);
}

