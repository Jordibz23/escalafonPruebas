package escalafon.com.prueba.modelsDatos;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="facultad")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString @EqualsAndHashCode
public class facultad {

    @Column(name = "idFacultad")
    @Id
    private int idFacultad;

    @Column(name = "nombFacultad")
    private String nombFacultad;

    @Column(name = "estado")
    private int estado;
}
