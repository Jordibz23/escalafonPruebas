package escalafon.com.prueba.modelsDatos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estadocivil")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
