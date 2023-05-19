package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRolesRepository extends JpaRepository<roles,Integer> {

    Optional<roles> findByName(String name);
}

