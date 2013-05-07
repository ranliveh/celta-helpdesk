package br.com.celta.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
    @Id
    @Column(name = "\"MunipioPK\"", nullable = false, insertable = false, updatable = false, unique = true)
    private Integer municipioPK;
    @Column(name = "\"Nome\"", nullable = false)
    private String nome;
//    @OneToOne
//    @Column(name = "\"EstadoFK\"", nullable = false)
//    private Estado estadoFK;

    public Municipio() {
    }

    public Municipio(Integer municipioPK, String nome) {
        this.municipioPK = municipioPK;
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
//        return estadoFK;
//    }
}