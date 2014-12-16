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
    
    public ArrayList<SerializableChatBoxLine> lines;

    public SerializableChatBox() {
        lines = new ArrayList<>();
    }
    
    public SerializableChatBoxLine writeline(String text, String Player){
        SerializableChatBoxLine serializableChatBoxLine = new SerializableChatBoxLine(Player, text);
        lines.add(serializableChatBoxLine);
        return serializableChatBoxLine;
    }
    
    public SerializableChatBox getSerializableChatBoxWithTenLastLines(){
        SerializableChatBox serializableChatBox = new SerializableChatBox();
        serializableChatBox.lines = new ArrayList<>(this.lines.subList(this.lines.size() - 21, this.lines.size() - 1));
        return  serializableChatBox;
    }
}
