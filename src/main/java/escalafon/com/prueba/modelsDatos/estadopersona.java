package escalafon.com.prueba.modelsDatos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estadopersona")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class estadopersona {
    @Column(name = "idEstadoPersona")
    @Id
    private int idEstadoPersona;
    @Column(name = "estadoPersona")
    private String estadoPersona;
    @Column(name = "estado")
    private int estado;
}
