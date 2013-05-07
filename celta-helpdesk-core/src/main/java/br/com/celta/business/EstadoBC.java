package br.com.celta.business;

import br.com.celta.domain.Estado;
import br.com.celta.persistence.EstadoDAO;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

/**
 * EstadoBC.class
 *
 * @author Ranlive Hrysyk
 */
@BusinessController
public class EstadoBC extends DelegateCrud<Estado, Integer, EstadoDAO> {

    private static final long serialVersionUID = 1L;
}