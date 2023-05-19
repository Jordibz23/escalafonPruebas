package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "condicion")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class condicion {

    @Column(name = "idCondicion")
    @Id
    private int idCondicion;
    @Column(name ="tipoCondicion")
    private String tipoCondicion;
    @Column(name = "estado")
    private int estado;
}
