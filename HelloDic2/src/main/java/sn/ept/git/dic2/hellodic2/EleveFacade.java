package sn.ept.git.dic2.hellodic2;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class EleveFacade extends AbstractFacade<Eleve>{

    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public EleveFacade() {
        super(Eleve.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
