package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "estadocivil")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class estadocivil {

    @Column(name = "idestadoCivil")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idestadoCivil;
    @Column(name = "nombreEstado")
    private String nombreEstado;
    @Column(name = "estado")
    private int estado;
}
