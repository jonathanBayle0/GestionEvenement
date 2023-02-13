package DAOgestionEvenement;
import donnees.Salle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO_JPA_Salle extends DAO<Salle> {
    @Override
    public Salle find(int id) throws DAOException {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            /*
            EntityManager em = emf.createEntityManager();
            TypedQuery<Sport> query = em.createNamedQuery("Sport.findByCodeSport", Sport.class);
            query.setParameter("CodeSport", id);
            Sport sport = query.getSingleResult();
            return sport;*/
        }catch (Exception e) {
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
        return null;
    }

    @Override
    public void create(Salle data) throws DAOException {

    }

    @Override
    public void update(Salle data) throws DAOException {

    }

    @Override
    public void delete(Salle data) throws DAOException {

    }

    public DAO_JPA_Salle() throws DAOException{
        super();
    }

}
