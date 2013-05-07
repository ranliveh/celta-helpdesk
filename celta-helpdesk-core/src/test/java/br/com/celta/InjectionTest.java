package br.com.celta;

import br.com.celta.business.EstadoBC;
import br.com.celta.business.MunicipioBC;
import br.com.celta.domain.Estado;
import br.com.celta.domain.Municipio;
import br.com.celta.persistence.EstadoDAO;
import br.com.celta.persistence.MunicipioDAO;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;
import javax.inject.Inject;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * InjectionTest.class
 *
 * @author Ranlive Hrysyk
 */
@RunWith(DemoiselleRunner.class)
public class InjectionTest {

    private static final long serialVersionUID = 1L;
    @Inject
    private Estado estado;
    @Inject
    private Municipio municipio;

    @Test
    public void testInjectionDomain() {
        Assert.assertNotNull(estado);
        Assert.assertNotNull(municipio);
    }
}
