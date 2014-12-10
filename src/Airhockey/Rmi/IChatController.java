/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airhockey.Rmi;

/**
 *
 * @author pieper126
 */
public interface IChatController extends java.rmi.Remote{

    public void writeLine(String username, String Text);
    
}
