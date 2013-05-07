package br.com.celta;

import br.com.celta.business.EstadoBC;
import br.com.celta.domain.Estado;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;
import javax.inject.Inject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * PersistenceTest.class
 *
 * @author Ranlive Hrysyk
 */
@RunWith(DemoiselleRunner.class)
public class PersistenceTest {

    private static final long serialVersionUID = 1L;
    @Inject
    private EstadoBC estadoBC;

    @Test
    public void testPersistence() {
        Assert.assertNotNull(estadoBC);

        Estado estado = new Estado(1, "Estado Teste", "ET");
//        Municipio municipio = new Municipio(1, "Municipio Teste");

        estadoBC.insert(estado);
        Assert.assertNotNull(estadoBC.load(1));
    }
}