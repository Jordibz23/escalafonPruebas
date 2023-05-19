package escalafon.com.prueba.repositories;

import escalafon.com.prueba.models.facultad;

import java.util.List;
import java.util.Optional;

public interface IFacultadesRepository{
    List<facultad> getFacultades();

    void eliminar(Long id);

    void registrar(facultad fac);

    facultad verificar(facultad fac);

    Optional<facultad> findOneByEmail(String email);
}
