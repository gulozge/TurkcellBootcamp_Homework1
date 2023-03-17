package org.gamemanagment.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Player extends User{
    private ArrayList<Game> games;


    public Player() {
    }

    public Player(int id, String name, String surName, String nationalIdentity, String birthDate, String memberDate, String password, String eMail, String userName, String picture) {
        super(id, name, surName, nationalIdentity, birthDate, memberDate, password, eMail, userName, picture);
        games=new ArrayList<>();
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    public void add(Game game){
        games.add(game);
    }

    @Override
    public String toString() {
        return "Player{" +super.toString()+
                "games=" + games +
                '}';
    }
}