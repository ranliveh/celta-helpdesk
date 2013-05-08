package br.com.celta.domain;

import br.com.celta.business.MunicipioBC;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;
import javax.inject.Inject;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * MunicipioTest.class
 *
 * @author Ranlive Hrysyk
 */
@RunWith(DemoiselleRunner.class)
public class MunicipioTest {

    private static final long serialVersionUID = 1L;
    @Inject
    private MunicipioBC municipioBC;

    @Test
    public void notNullBC() {
        Assert.assertNotNull(municipioBC);
    }

    @Test
    public void inserirComSucesso() {
        Municipio municipio = new Municipio("Municipio Teste");
        municipioBC.insert(municipio);
        Assert.assertTrue(municipioBC.findAll().contains(municipio));
    }
}