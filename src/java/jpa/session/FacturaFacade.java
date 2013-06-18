/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.Factura;

/**
 *
 * @author jorge isaacs
 */
@Stateless
public class FacturaFacade extends AbstractFacade<Factura> {
    @PersistenceContext(unitName = "veterinariaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacturaFacade() {
        super(Factura.class);
    }
    
}
