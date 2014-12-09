/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airhockey.Rmi;

import java.io.Serializable;

/**
 *
 * @author stijn
 */
public class Location extends  GameData implements Serializable {

    public String type;

    public float x;
    public float y;

    public static final long serialVersionUID = 43L;

    public Location(String locationId, float x, float y) {
        this.type = locationId;
        this.x = x;
        this.y = y;
    }

}
