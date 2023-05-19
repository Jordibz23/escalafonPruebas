package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "escuela")
@Getter
@Setter
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
