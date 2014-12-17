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
public interface IControlPlayer1 extends IGameController {

    void movePlayer1BatDown() throws RemoteException;

    void movePlayer1BatUp() throws RemoteException;

    void stopPlayer1Bat() throws RemoteException;
}
