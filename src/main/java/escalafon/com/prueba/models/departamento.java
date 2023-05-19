package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "departamento")
@Getter
@Setter
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
