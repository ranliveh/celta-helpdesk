package br.com.celta.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Municipio.class
 *
 * @author Ranlive Hrysyk
 */
@Entity
@Table(name = "\"Municipio\"")
public class Municipio implements Serializable {

    private static final long serialVersionUID = 1L;
    // *********************** PROPERTIES *********************************** //
    public static final String PROPERTY_NOME = "nome";
    // ********************************************************************** //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "\"MunipioPK\"", nullable = false, updatable = false, unique = true)
    private Integer municipioPK;
    @Column(name = "\"Nome\"", nullable = false, length = 30)
    private String nome;
//    @OneToOne
//    @Column(name = "\"EstadoFK\"", nullable = false)
//    private Estado estadoFK;

    public Municipio() {
    }

    public Municipio(String nome) {
        this.nome = nome;
    }

//    public Municipio(Integer municipioPK, String nome, Estado estadoFK) {
//        this.municipioPK = municipioPK;
//        this.nome = nome;
//        this.estadoFK = estadoFK;
//    }
    public Integer getMunicipioPK() {
        return municipioPK;
    }

    public String getNome() {
        return nome;
    }
    //    public Estado getEstadoFK() {
    //    }
    //    }
}