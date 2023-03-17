package org.gamemanagment.database;
import org.gamemanagment.model.Game;
import java.util.ArrayList;

public class GamesData {
    private static ArrayList<Game> games=new ArrayList<>();

    public static ArrayList<Game> getGames() {
        return games;
    }

    public static void setGames(ArrayList<Game> games) {
        GamesData.games = games;
    }
    public static void addGames(Game game){
        games.add(game);
    }
}