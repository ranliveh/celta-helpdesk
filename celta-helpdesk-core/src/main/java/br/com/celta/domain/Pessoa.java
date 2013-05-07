package br.com.celta.domain;

import java.io.Serializable;
import javax.persistence.Column;

/**
 * Pessoa.class 
 *
 * @author Ranlive Hrysyk
 */
public class Pessoa implements Serializable{

    private static final long serialVersionUID = 1L;
    @Column(name = "\"Nome\"", nullable = false, length = 120)
    private String nome;
    @Column(name = "\"Logradouro\"", length = 100)
    private String logradouro;
    @Column(name = "\"Numero\"", length = 6)
    private String numero;
    @Column(name = "\"Bairro\"", length = 30)
    private String bairro;
    @Column(name = "\"CEP\"", length = 9)
    private String cep;

    public Pessoa() {
    }
}
