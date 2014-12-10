package Airhockey.Rmi;

import java.rmi.RemoteException;

/**
 *
 * @author Roel
 */
public interface IGameController extends java.rmi.Remote {
  
    public int getPlayerNumber(String username);

}
