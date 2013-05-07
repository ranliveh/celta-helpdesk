package br.com.celta.persistence;

import br.com.celta.domain.Estado;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

/**
 * EstadoDAO.class
 *
 * @author Ranlive Hrysyk
 */
@PersistenceController
public class EstadoDAO extends JPACrud<Estado, Integer> {

    private static final long serialVersionUID = 1L;
}