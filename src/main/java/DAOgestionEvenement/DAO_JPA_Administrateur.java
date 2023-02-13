package DAOgestionEvenement;

import donnees.Administrateur;
import donnees.Salle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO_JPA_Administrateur extends DAO<Administrateur> {

    /**
     * Construit le DAO pour la classe param�tr�e.
     *
     * @throws DAOException en cas de probl�me
     */
    public DAO_JPA_Administrateur() throws DAOException {
        super();
    }

    @Override
    public Administrateur find(int id) throws DAOException {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            Administrateur admin = em.find(Administrateur.class, id);
            return admin;
        }catch (Exception e) {
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    @Override
    public void create(Administrateur data) throws DAOException {
        EntityTransaction trans = null;
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            trans = em.getTransaction();
            trans.begin();
            Administrateur admin = new Administrateur(data.getPseudo(),data.getMotDePasse());
            em.persist(admin);
            trans.commit();

        }catch (Exception e) {
            if (trans != null) trans.rollback();
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }

    @Override
    public void update(Administrateur data) throws DAOException {
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
    public void delete(Administrateur data) throws DAOException {
        EntityTransaction trans = null;
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EvenementPU");
            EntityManager em = emf.createEntityManager();
            trans = em.getTransaction();
            trans.begin();
            //traitement
            em.remove(data);
            trans.commit();

        }catch (Exception e) {
            if (trans != null) trans.rollback();
            throw new DAOException("Probleme technique (" + e.getMessage() + ")");
        }
    }
}
