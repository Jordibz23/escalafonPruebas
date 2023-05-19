package escalafon.com.prueba.models;

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
public class personaSimple {
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
    @Column(name = "idFacultad")
    private int idFacultad;
    @Column(name = "idCargoPersona")
    private int idCargoPersona;
    @Column(name = "idCondicion")
    private int idCondicion;
    @Column(name = "idEstadoPersona")
    private int idEstadoPersona;
    @Column(name = "idDepartamento")
    private int idDepartamento;
    @Column(name = "idRegimen")
    private int idRegimen;
    @Column(name = "idCategoria")
    private int idCategoria;
    @Column(name = "idDedicacion")
    private int idDedicacion;
    @Column(name = "idEstadoCivil")
    private int idEstadoCivil;
    @Column(name = "idHijos")
    private int idHijos;
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
