package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "estadopersona")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class estadopersona {
    @Column(name = "idEstadoPersona")
    @Id
    private int idEstadoPersona;
    @Column(name = "estadoPersona")
    private String estadoPersona;
    @Column(name = "estado")
    private int estado;
}
