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
    public static final String PROPERTY_ID = "estadoID";
    public static final String PROPERTY_IBGE = "codigoIBGE";
    public static final String PROPERTY_SIGLA = "sigla";
    public static final String PROPERTY_DESCRICAO = "descricao";    
    // ********************************************************************** //
    @Id
    @Column(name = "\"EstadoID\"", nullable = false, updatable = false, unique = true)
    private Integer estadoID;
    @Column(name = "\"IBGE\"", nullable = false, length = 2)
    private String codigoIBGE;
    @Column(name = "\"Sigla\"", nullable = false, length = 2)
    private String sigla;
    @Column(name = "\"Descricao\"", nullable = false, length = 30)
    private String descricao;

    public Estado() {
    }

    public Estado(Integer estadoID, String codigoIBGE, String sigla, String descricao) {
        this.estadoID = estadoID;
        this.codigoIBGE = codigoIBGE;
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public Integer getEstadoID() {
        return estadoID;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }
}
