package br.com.celta.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    // *********************** PROPERTIES *********************************** //
    public static final String PROPERTY_ID = "municipioID";
    public static final String PROPERTY_IBGE = "codigoIBGE";
    public static final String PROPERTY_DESCRICAO= "descricao";
    // ********************************************************************** //
    @Id
    @Column(name = "\"MunipioID\"", nullable = false, updatable = false, unique = true)
    private Integer municipioID;
    @Column(name = "\"IBGE\"", nullable = false, length = 7)
    private String codigoIBGE;
    @Column(name = "\"Descricao\"", nullable = false, length = 50)
    private String descricao;
    @OneToOne(mappedBy = "estadoID")
    @Column(name = "\"MunicipioEstadoFK\"", nullable = false)
    private Estado estadoFK;

    public Municipio() {
    }

    public Municipio(Integer municipioID, String codigoIBGE, String descricao, Estado estadoFK) {
        this.municipioID = municipioID;
        this.codigoIBGE = codigoIBGE;
        this.descricao = descricao;
        this.estadoFK = estadoFK;
    }

    public Integer getMunicipioID() {
        return municipioID;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public String getDescricao() {
        return descricao;
    }

    public Estado getEstado() {
        return estadoFK;
    }
}