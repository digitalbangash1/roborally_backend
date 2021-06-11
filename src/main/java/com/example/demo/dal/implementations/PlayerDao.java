package com.example.demo.dal.implementations;

import com.example.demo.dal.interfaces.IPlayerDao;
import com.example.demo.model.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Primitive implementation of a player dao, using a HashMap.
 */
@Repository
public class PlayerDao implements IPlayerDao {
    //PlayerId, Player
    static final HashMap<Integer, Player> players = new HashMap<>();
    static private int playerIdCounter = 0;
    static String[] availablePlayerColors = new String[]{"red", "green", "yellow", "blue", "cyan", "orange"};
    static ArrayList<String> takenPlayerColors = new ArrayList<>();

    @Override
    public int addPlayer(int boardId, Player player) {
        playerIdCounter++;
        player.setPlayerId(playerIdCounter);

        String name = player.getName();
        if (name == null || name.trim().length() == 0) {
            player.setName("Player " + playerIdCounter);
        }

        for (String c : availablePlayerColors) {
            if (!takenPlayerColors.contains(c)) {
                takenPlayerColors.add(c);
                player.setColor(c);
                break;
            }
        }

        players.put(player.getPlayerId(), player);
        return player.getPlayerId();
    }

    @Override
    public Player getPlayer(int playerId) {
        return players.get(playerId);
    }
}
