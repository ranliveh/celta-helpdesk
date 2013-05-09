package br.com.celta.business;

import br.com.celta.domain.Municipio;
import br.com.celta.persistence.MunicipioDAO;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

/**
 * MunicipioBC.class
 *
 * @author Ranlive Hrysyk
 */
@BusinessController
public class MunicipioBC extends DelegateCrud<Municipio, Integer, MunicipioDAO> {

    private static final long serialVersionUID = 1L;
}