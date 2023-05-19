package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departamento")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class departamento {
    @Column(name = "idDepartamento")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartamento;
    @Column(name = "nombDepatarmento")
    private String nombDepatarmento;
    @Column(name = "estado")
    private int estado;
}
