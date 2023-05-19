package escalafon.com.prueba.models;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "regimenpensiones")
@Getter
@Setter
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
