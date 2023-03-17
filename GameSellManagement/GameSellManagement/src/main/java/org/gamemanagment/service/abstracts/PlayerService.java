package org.gamemanagment.service.abstracts;

import org.gamemanagment.model.Player;

import java.util.ArrayList;

public interface PlayerService {
    void registerPlayer(Player player) throws Exception;
    void deletePlayer(int id);
    void updatePlayer(Player player);
    void showAllPlayers();
    ArrayList<Player> getPlayers();
}