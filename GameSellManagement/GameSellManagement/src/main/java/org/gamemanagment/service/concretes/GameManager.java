package org.gamemanagment.service.concretes;

import org.gamemanagment.database.GamesData;
import org.gamemanagment.model.Game;
import org.gamemanagment.service.abstracts.GameService;

import java.util.ArrayList;

public class GameManager implements GameService {
    @Override
    public void addGame(Game game) {
        GamesData.addGames(game);
        System.out.println(game.getName() + " Sisteme eklendi");
    }

    @Override
    public void deleteGame(int gameId) {
        ArrayList<Game> tempGames = GamesData.getGames();
        for (int i = 0; i < tempGames.size(); i++) {
            Game tempGame = tempGames.get(i);
            if (tempGame.getId() == gameId) {
                tempGames.remove(i);
                System.out.println(tempGame.getName()+" silindi");
                break;
            }
        }
        GamesData.setGames(tempGames);
    }
    @Override
    public void show() {
        System.out.println(GamesData.getGames());
    }
    @Override
    public ArrayList<Game> getGames() {
        return GamesData.getGames();
    }
}