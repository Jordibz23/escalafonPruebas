package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="facultad")
@ToString @EqualsAndHashCode
public class facultad {

    @Getter @Setter @Column(name = "idFacultad")
    @Id
    private int idFacultad;

    @Getter @Setter @Column(name = "nombFacultad")
    private String nombFacultad;

    @Getter @Setter @Column(name = "estado")
    private int estado;
}
