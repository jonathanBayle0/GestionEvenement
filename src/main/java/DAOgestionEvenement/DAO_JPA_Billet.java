package DAOgestionEvenement;

import donnees.Billet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DAO_JPA_Billet extends DAO<Billet>{
    @Override
    public Billet find(int id) throws DAOException {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            Billet billet = em.find(Billet.class, id);
            return billet;
        }catch (Exception e) {
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    @Override
    public void create(Billet data) throws DAOException {
        EntityTransaction trans = null;
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            trans = em.getTransaction();
            trans.begin();
            Billet billet = new Billet(data.getId(),data.getCategorie(), data.getSoiId());
            em.persist(billet);
            trans.commit();

        }catch (Exception e) {
            if (trans != null) trans.rollback();
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    @Override
    public void update(Billet data) throws DAOException {
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
    public void delete(Billet data) throws DAOException {
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

    public DAO_JPA_Billet() throws DAOException{
        super();
    }
}
