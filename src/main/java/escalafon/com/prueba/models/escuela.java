package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "escuela")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class escuela {
    @Column(name = "idEscuela")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEscuela;
    @Column(name = "nombEscuela")
    private String nombEscuela;
    @OneToOne
    @JoinColumn(name = "idFacultad")
    private facultad fac;
    @Column(name = "estado")
    private int estado;
}
