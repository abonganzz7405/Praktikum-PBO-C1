/**
 * File     : DAOManager.java
 * Deskripsi: Pengelola DAO dalam program
 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        this.personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
