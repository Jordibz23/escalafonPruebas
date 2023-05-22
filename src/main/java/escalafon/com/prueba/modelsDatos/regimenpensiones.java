package escalafon.com.prueba.modelsDatos;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "regimenpensiones")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class regimenpensiones {
    @Column(name = "idRegimen")
    @Id
    private int idRegimen;

    @Column(name = "nombRegimen")
    private String nombRegimen;

    @Column(name = "estado")
    private int estado;
}
