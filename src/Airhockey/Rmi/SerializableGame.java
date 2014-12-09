/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airhockey.Rmi;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author stijn
 */
public class SerializableGame implements Serializable {

    public static final long serialVersionUID = 88L;

    public int id;

    public boolean busy;

    public String description;
    
    public String hostIP;

    public ArrayList<String> usernames;

    public SerializableGame() {
        usernames = new ArrayList<>();
    }
}
