package escalafon.com.prueba.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "dedicacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class dedicacion {
    @Column(name = "idDedicacion")
    @Id
    private int idDedicacion;

    @Column(name = "tiempoDedicacion")
    private String tiempoDedicacion;

    @Column(name = "estado")
    private int estado;
}
