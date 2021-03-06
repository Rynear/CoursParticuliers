/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entity.Eleve;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Felix
 */
@Stateless
public class EleveFacade extends AbstractFacade<Eleve> implements EleveFacadeLocal {

    @PersistenceContext(unitName = "CoursParticuliersPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EleveFacade() {
        super(Eleve.class);
    }
    
}
