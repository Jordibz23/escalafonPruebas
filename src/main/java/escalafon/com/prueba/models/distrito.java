package escalafon.com.prueba.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "distrito")
@Getter
@Setter
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
