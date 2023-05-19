package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "distrito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class distrito {
    @Column(name = "idDistrito")
    @Id
    private int idDistrito;
    @Column(name = "nombDistrito")
    private String nombDistrito;
    @OneToOne
    @JoinColumn(name = "idProvincia")
    private provincia Provincia;
    @Column(name = "estado")
    private int estado;
}
