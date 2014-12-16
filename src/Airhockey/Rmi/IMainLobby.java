package Airhockey.Rmi;

import java.util.ArrayList;

/**
 *
 * @author Roel
 */
public interface IMainLobby {

    void addWaitingGame(String description, String hostIP, String username);

    ArrayList<SerializableGame> getBusyGames();

    SerializableChatBox getChatBox();

    ArrayList<SerializableGame> getWaitingGames();

    SerializableGame joinGame(int id, String username);

    void startGame(SerializableGame game);

}
