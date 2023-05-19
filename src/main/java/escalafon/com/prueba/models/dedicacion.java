package escalafon.com.prueba.models;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "dedicacion")
@Getter
@Setter
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
