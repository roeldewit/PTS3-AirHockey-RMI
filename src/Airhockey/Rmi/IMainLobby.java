package Airhockey.Rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Roel
 */
public interface IMainLobby extends Remote{

    void addWaitingGame(String description, String hostIP, String username) throws RemoteException;

    ArrayList<SerializableGame> getBusyGames() throws RemoteException;

    SerializableChatBox1 getChatBox() throws RemoteException;

    ArrayList<SerializableGame> getWaitingGames() throws RemoteException;

    SerializableGame joinGame(int id, String username) throws RemoteException;

    void startGame(SerializableGame game) throws RemoteException;
    
    void WriteLine(String text, String username) throws RemoteException;

}
