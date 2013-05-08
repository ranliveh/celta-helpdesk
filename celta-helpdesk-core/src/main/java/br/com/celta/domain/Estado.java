package br.com.celta.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    // *********************** PROPERTIES *********************************** //
    public static final String PROPERTY_NOME = "nome";
    public static final String PROPERTY_SIGLA = "sigla";
    // ********************************************************************** //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "\"EstadoPK\"", nullable = false, updatable = false, unique = true)
    private Integer estadoPK;
    @Column(name = "\"Nome\"", nullable = false, length = 30)
    private String nome;
    @Column(name = "\"Sigla\"", nullable = false, length = 2)
    private String sigla;

    public Estado() {
    }

    public Estado(String nome, String sigla) {
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
