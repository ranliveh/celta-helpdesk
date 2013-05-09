package br.com.celta.domain.generics;

import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;
import br.gov.frameworkdemoiselle.template.Crud;
import javax.inject.Inject;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * GenericBeanTest.class
 *
 * @author Ranlive Hrysyk
 */
@RunWith(DemoiselleRunner.class)
public abstract class GenericBeanTest<T, I, C extends Crud<T, I>> {

    private static final long serialVersionUID = 1L;
    @Inject
    private C delegateBC;
    private T bean;

    protected GenericBeanTest(T bean) {
        this.bean = bean;
    }

    @Test
    public void notNullBC() {
        Assert.assertNotNull(delegateBC);
    }

    @Test
    public void inserirComSucesso() {
        delegateBC.insert(bean);
        Assert.assertTrue(delegateBC.findAll().contains(bean));
    }
}