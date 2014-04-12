/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entity.Containerinventory;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kasha and Jeff
 */
@Stateless
public class ContainerinventoryFacade extends AbstractFacade<Containerinventory> {
    @PersistenceContext(unitName = "RukertContainerTrackerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContainerinventoryFacade() {
        super(Containerinventory.class);
    }
    
}
