package edu.calvin.cs262.lab06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Player object. Stores player data in a String
 *
 * @author deitel
 * @author Kristofer Brink
 * @version fall, 2016
 */
public class Player {
    private String id, name, email;
    public Player(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public String getId() {
        return id;
    }

    public String getName() { return name; }

    public String getEmail() { return email; }
}
