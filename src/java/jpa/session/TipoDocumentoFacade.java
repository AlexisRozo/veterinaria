/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.TipoDocumento;

/**
 *
 * @author jorge isaacs
 */
@Stateless
public class TipoDocumentoFacade extends AbstractFacade<TipoDocumento> {
    @PersistenceContext(unitName = "veterinariaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoDocumentoFacade() {
        super(TipoDocumento.class);
    }
    
}
