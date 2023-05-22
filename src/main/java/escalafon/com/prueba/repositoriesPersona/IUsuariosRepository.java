package escalafon.com.prueba.repositoriesPersona;

import escalafon.com.prueba.modelsPersona.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUsuariosRepository extends JpaRepository<usuarios,Integer> {

    Optional<usuarios> findByEmail(String email);

    Boolean existsByEmail(String email);
}
