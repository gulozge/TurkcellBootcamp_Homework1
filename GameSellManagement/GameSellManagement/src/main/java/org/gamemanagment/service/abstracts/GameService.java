package org.gamemanagment.service.abstracts;

import org.gamemanagment.model.Game;

import java.util.ArrayList;

public interface GameService {

    void addGame(Game game);
    void deleteGame(int id);
    void show();
    ArrayList<Game> getGames();
}