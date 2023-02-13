package DAOgestionEvenement;

import donnees.Salle;
import donnees.Soiree;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO_JPA_Soiree extends DAO<Soiree> {
    @Override
    public Soiree find(int id) throws DAOException {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            Soiree soiree = em.find(Soiree.class, id);
            return soiree;
        }catch (Exception e) {
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    @Override
    public void create(Soiree data) throws DAOException {
        EntityTransaction trans = null;
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            trans = em.getTransaction();
            trans.begin();
            Soiree soiree = new Soiree(data.getId(),data.getNom(), data.getDateDebut(),data.getDateFin(), data.getSalId(), data.getPrix());
            em.persist(soiree);
            trans.commit();

        }catch (Exception e) {
            if (trans != null) trans.rollback();
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    @Override
    public void update(Soiree data) throws DAOException {
        EntityTransaction trans = null;
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            trans = em.getTransaction();
            trans.begin();
            //Salle salle = new Salle(data.getId(),data.getNom(), data.getAdresse(),data.getCapacite(), data.getNomGestionnaire(), data.getPrenomGestionnaire(), data.getAssociation());
            em.merge(data);
            trans.commit();
        }catch (Exception e) {
            if (trans != null) trans.rollback();
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    @Override
    public void delete(Soiree data) throws DAOException {
        EntityTransaction trans = null;
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            trans = em.getTransaction();
            trans.begin();
            //Salle salle = new Salle(data.getId(),data.getNom(), data.getAdresse(),data.getCapacite(), data.getNomGestionnaire(), data.getPrenomGestionnaire(), data.getAssociation());
            em.remove(data);
            trans.commit();

        }catch (Exception e) {
            if (trans != null) trans.rollback();
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    public DAO_JPA_Soiree() throws DAOException{
        super();
    }
}
