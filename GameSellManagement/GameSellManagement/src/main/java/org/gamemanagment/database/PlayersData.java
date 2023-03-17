package org.gamemanagment.database;

import org.gamemanagment.model.Player;

import java.util.ArrayList;

public class PlayersData {
    private  static ArrayList<Player> members=new ArrayList<>();

    public static ArrayList<Player> getMembers() {
        return members;
    }

    public static void setMembers(ArrayList<Player> members) {
        PlayersData.members = members;
    }

    public static void addMembers(Player player) {
        members.add(player);
    }
}