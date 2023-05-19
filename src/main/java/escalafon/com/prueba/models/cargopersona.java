package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cargopersona")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class cargopersona {

    @Column(name = "idcargopersona")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcargopersona;
    @Column(name = "cargoPersona")
    private String cargoPersona;
    @Column(name = "estado")
    private int estado;

}
