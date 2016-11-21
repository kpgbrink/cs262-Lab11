package edu.calvin.cs262;

/**
 * A Player class (POJO) for the player relation
 *
 * @author kvlinden
 * @version summer, 2016
 */
public class Player {

    private int id;
    private String emailaddress, name;

    Player() { /* a default constructor, required by Gson */  }

    /**
     * Initialize player
     * @param id
     * @param emailaddress
     * @param name
     */
    Player(int id, String emailaddress, String name) {
        this.id = id;
        this.emailaddress = emailaddress;
        this.name = name;
    }

    /**
     * Returns id
     * @return int id
     */
    public int getId() {
        return id;
    }

    /**
     * Get email address
     * @return String
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /**
     * Returns name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setsId to id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * setEmailAddress
     * @param emailaddress
     */
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    /**
     * setName
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
