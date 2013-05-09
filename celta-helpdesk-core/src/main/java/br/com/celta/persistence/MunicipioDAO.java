package br.com.celta.persistence;

import br.com.celta.domain.Municipio;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

/**
 * MunicipioDAO.class
 *
 * @author Ranlive Hrysyk
 */
@PersistenceController
public class MunicipioDAO extends JPACrud<Municipio, Integer> {

    private static final long serialVersionUID = 1L;
}