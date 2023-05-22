package escalafon.com.prueba.modelsDatos;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hijos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class hijos {

    @Column(name = "idHijos")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHijos;

    @Column(name = "numeroHijos")
    private int numeroHijos;

    @Column(name = "estado")
    private int estado;
}
