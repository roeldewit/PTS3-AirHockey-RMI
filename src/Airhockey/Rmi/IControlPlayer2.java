/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Airhockey.Rmi;

import java.rmi.RemoteException;

/**
 *
 * @author stijn
 */
public interface IControlPlayer2 extends IGameController{

    void movePlayer2BatDown() throws RemoteException;

    void movePlayer2BatUp() throws RemoteException;
    
    void stopPlayer2Bat() throws RemoteException;
    
}
