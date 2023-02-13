package DAOgestionEvenement;
import donnees.Salle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DAO_JPA_Salle extends DAO<Salle> {
    @Override
    public Salle find(int id) throws DAOException {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            Salle salle = em.find(Salle.class, id);
            return salle;
        }catch (Exception e) {
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    @Override
    public void create(Salle data) throws DAOException {
        EntityTransaction trans = null;
        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
		    trans = em.getTransaction();
            trans.begin();
            Salle salle = new Salle(data.getId(),data.getNom(), data.getAdresse(),data.getCapacite(), data.getNomGestionnaire(), data.getPrenomGestionnaire(), data.getAssociation());
            em.persist(salle);
            trans.commit();

        }catch (Exception e) {
            if (trans != null) trans.rollback();
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    @Override
    public void update(Salle data) throws DAOException {
        EntityTransaction trans = null;
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            trans = em.getTransaction();
            trans.begin();
            //Traitement
            em.merge(data);
            trans.commit();
        }catch (Exception e) {
            if (trans != null) trans.rollback();
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    @Override
    public void delete(Salle data) throws DAOException {
        EntityTransaction trans = null;
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            trans = em.getTransaction();
            trans.begin();
            //Traitement
            em.remove(data);
            trans.commit();

        }catch (Exception e) {
            if (trans != null) trans.rollback();
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    public DAO_JPA_Salle() throws DAOException{
        super();
    }

}
