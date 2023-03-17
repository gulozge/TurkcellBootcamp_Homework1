package org.gamemanagment.service.concretes;

import org.gamemanagment.database.PlayersData;
import org.gamemanagment.model.Player;
import org.gamemanagment.service.abstracts.PlayerService;
import org.gamemanagment.service.abstracts.Validate;

import java.util.ArrayList;

public class PlayerManager implements PlayerService {
    private final Validate validation;
    public PlayerManager(Validate validation) {
        this.validation = validation;
    }
    @Override
    public void registerPlayer(Player player)  {
        if (validation.validate(player)){
            System.out.println(player.getName()+" Sisteme başarılı bir şekilde kayıt oldu");
            PlayersData.addMembers(player);
        }else {
            System.err.println("Kullanıcı doğrulanamadı !!!!!");
        }
    }
    @Override
    public void deletePlayer(int playerId) {
        ArrayList<Player> temp = PlayersData.getMembers();
        for (int i = 0; i < temp.size(); i++) {
            Player player1 = temp.get(i);
            if (player1.getId() == playerId) {
                temp.remove(i);
                break;
            }
        }
        System.out.println(playerId+" numaralı kullanıcı silindi");
        PlayersData.setMembers(temp);
    }
    @Override
    public void updatePlayer(Player player) {
        ArrayList<Player> temp = PlayersData.getMembers();

        for (int i = 0; i < temp.size(); i++) {
            Player player1 = temp.get(i);
            if (player1.getId() == player.getId()) {
                temp.remove(i);
                temp.add(i, player);
                break;
            }
        }
        System.out.println("Bilgiler güncellendi");
        PlayersData.setMembers(temp);
    }
    @Override
    public void showAllPlayers() {
        System.out.println(PlayersData.getMembers());
    }
    @Override
    public ArrayList<Player> getPlayers(){
        return PlayersData.getMembers();
    }
}