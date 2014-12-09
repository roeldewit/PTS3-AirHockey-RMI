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
public class SerializableChatBox implements Serializable {
        
    public static final long serialVersionUID = 44L;
    
    private ArrayList<SerializableChatBoxLine> lines;

    public SerializableChatBox() {
        lines = new ArrayList<>();
    }
    
    public void writeline(String text, String Player){
        lines.add(new SerializableChatBoxLine(Player, text));
    }
}