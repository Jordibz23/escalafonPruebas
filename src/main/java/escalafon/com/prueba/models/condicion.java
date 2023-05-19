package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "condicion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class condicion {

    @Column(name = "idCondicion")
    @Id
    private int idCondicion;
    @Column(name ="tipoCondicion")
    private String tipoCondicion;
    @Column(name = "estado")
    private int estado;
}
