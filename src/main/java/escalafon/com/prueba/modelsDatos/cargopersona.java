package escalafon.com.prueba.modelsDatos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cargopersona")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
