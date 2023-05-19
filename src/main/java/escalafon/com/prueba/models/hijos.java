package escalafon.com.prueba.models;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "hijos")
@Getter
@Setter
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
