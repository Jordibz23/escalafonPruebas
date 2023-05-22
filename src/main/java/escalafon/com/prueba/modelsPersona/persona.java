package escalafon.com.prueba.modelsPersona;
import escalafon.com.prueba.modelsDatos.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "persona")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class persona {

    @Column(name = "codigo")
    @Id
    private String codigo;
    @Column(name = "apellidoPat")
    private String apellidoPat;
    @Column(name = "apellidoMat")
    private String apellidoMat;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "DNI")
    private String DNI;
    @Column(name = "edad")
    private int edad;
    @OneToOne
    @JoinColumn(name = "idFacultad")
    private facultad fac;
    @OneToOne
    @JoinColumn(name = "idCargoPersona")
    private cargopersona carper;
    @OneToOne
    @JoinColumn(name = "idCondicion")
    private condicion condi;
    @OneToOne
    @JoinColumn(name = "idEstadoPersona")
    private estadopersona estper;
    @OneToOne
    @JoinColumn(name = "idDepartamento")
    private departamento depar;
    @OneToOne
    @JoinColumn(name = "idRegimen")
    private regimenpensiones regimpensiones;
    @OneToOne
    @JoinColumn(name = "idCategoria")
    private categoria cate;
    @OneToOne
    @JoinColumn(name = "idDedicacion")
    private dedicacion dedi;
    @OneToOne
    @JoinColumn(name = "idEstadoCivil")
    private estadocivil estacivil;
    @OneToOne
    @JoinColumn(name = "idHijos")
    private hijos hijos;
    @Column(name = "profesion")
    private String profesion;
    @Column(name = "fechIngreso")
    private Date fechIngreso;
    @Column(name = "fechNaci")
    private Date fechNaci;
    @Column(name = "domicilio")
    private String domicilio;
    @Column(name = "gmail")
    private String gmail;
    @Column(name = "celular")
    private int celular;
    @Column(name = "estado")
    private int estado;
}
