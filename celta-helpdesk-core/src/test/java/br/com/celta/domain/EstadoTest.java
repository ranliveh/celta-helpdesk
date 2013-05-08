package br.com.celta.domain;

import br.com.celta.business.EstadoBC;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;
import javax.inject.Inject;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * EstadoTest.class
 *
 * @author Ranlive Hrysyk
 */
@RunWith(DemoiselleRunner.class)
public class EstadoTest {

    private static final long serialVersionUID = 1L;
    @Inject
    private EstadoBC estadoBC;

    @Test
    public void notNullBC() {
        Assert.assertNotNull(estadoBC);
    }

    @Test
    public void inserirComSucesso() {
        Estado estado = new Estado("Estado Teste", "ET");
        estadoBC.insert(estado);
        Assert.assertTrue(estadoBC.findAll().contains(estado));
    }
}