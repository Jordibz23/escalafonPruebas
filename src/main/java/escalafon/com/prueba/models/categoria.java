package escalafon.com.prueba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class categoria {
    @Column(name = "idCategoria")
    @Id
    private int idCategoria;
    @Column(name = "nombCategoria")
    private String nombCategoria;
    @Column(name = "estado")
    private int estado;
}
