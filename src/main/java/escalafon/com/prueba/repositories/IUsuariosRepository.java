package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUsuariosRepository extends JpaRepository<usuarios,Integer> {

    Optional<usuarios> findByEmail(String email);

    Boolean existsByEmail(String email);
}
