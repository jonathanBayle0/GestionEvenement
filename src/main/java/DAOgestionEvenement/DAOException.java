package DAOgestionEvenement;

/**
 * Exception sp�cifique aux probl�mes d'acc�s aux donn�es via un DAO.
 * @author Marie et Jonathan
 */
public class DAOException extends java.lang.Exception {

    private static final long serialVersionUID = 309200220164832142L;

    public DAOException() {
        super();
    }

    public DAOException(String message) {
        super(message);
    }
}
