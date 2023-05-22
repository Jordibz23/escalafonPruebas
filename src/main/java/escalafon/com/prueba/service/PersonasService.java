package escalafon.com.prueba.service;

import escalafon.com.prueba.models.persona;
import escalafon.com.prueba.models.personaSimple;
import escalafon.com.prueba.repositories.IPersonaSimpleRepository;
import escalafon.com.prueba.repositories.IPersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonasService {

    private IPersonasRepository personasRepository;
    private IPersonaSimpleRepository personaSimpleRepository;

    @Autowired
    public PersonasService(IPersonasRepository personasRepository, IPersonaSimpleRepository personaSimpleRepository) {
        this.personasRepository = personasRepository;
        this.personaSimpleRepository = personaSimpleRepository;
    }

    public List<persona> listarPersonas(){
        return personasRepository.findAll();
    }

    public void guardarPersona(personaSimple personSimple){
        personaSimpleRepository.save(personSimple);
    }

    public List<persona> listarPorCargoPersona(int idcargopersona){return personasRepository.findByCarperIdcargopersona(idcargopersona);}

    public String traerCodigo(){
        personaSimple ultimoRegistro = personaSimpleRepository.findFirstByOrderByCodigoDesc();
        if (ultimoRegistro!=null){
            return incrementarCodigo(ultimoRegistro.getCodigo());
        }
        return "C00001";
    }

    private String incrementarCodigo(String codigo) {
        String codigoNumerico = codigo.substring(1); // Obtener solo la parte numérica del código (excluyendo la letra "C")
        int numero = Integer.parseInt(codigoNumerico); // Convertir la parte numérica a entero
        numero++; // Incrementar en uno el número
        String nuevoCodigoNumerico = String.format("%05d", numero); // Convertir el número incrementado a una cadena de longitud 5 con ceros a la izquierda
        return "{\"codigo\":\"C" + nuevoCodigoNumerico+"\"}"; // Concatenar la letra "C" con el número incrementado y devolver el nuevo código
    }
}
