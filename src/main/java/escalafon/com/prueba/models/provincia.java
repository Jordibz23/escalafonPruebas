package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "provincia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class provincia {
    @Column(name = "idProvincia")
    @Id
    private int idProvincia;
    @Column(name = "nombProvincia")
    private String nombProvincia;
    @OneToOne
    @JoinColumn(name = "idDepartamento")
    private departamento Departamento;
    @Column(name = "estado")
    private int estado;
}
