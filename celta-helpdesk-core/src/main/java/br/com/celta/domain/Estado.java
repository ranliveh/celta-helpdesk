package br.com.celta.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Estado.class
 *
 * @author Ranlive Hrysyk
 */
@Entity
@Table(name = "\"Estado\"")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "\"EstadoPK\"", nullable = false, insertable = false, updatable = false, unique = true)
    private Integer estadoPK;
    @Column(name = "\"Nome\"", nullable = false)
    private String nome;
    @Column(name = "\"Sigla\"", nullable = false)
    private String sigla;

    public Estado() {
    }

    public Estado(Integer estadoPK, String nome, String sigla) {
        this.estadoPK = estadoPK;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Integer getEstadoPK() {
        return estadoPK;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
