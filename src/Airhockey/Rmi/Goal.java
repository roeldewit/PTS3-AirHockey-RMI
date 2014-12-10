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
public class Goal extends GameData implements Serializable{

    public static final long serialVersionUID = 100L;
    
    public int madeBy;

    public int against;
    
    public int round;

    public Goal(int madeBy, int against, int round) {
        this.madeBy = madeBy;
        this.against = against;
        this.round = round;
    }
}
