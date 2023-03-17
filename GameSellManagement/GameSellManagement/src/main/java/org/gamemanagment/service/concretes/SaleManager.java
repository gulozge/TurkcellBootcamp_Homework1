package org.gamemanagment.service.concretes;

import org.gamemanagment.model.Campaign;
import org.gamemanagment.model.Game;
import org.gamemanagment.model.Player;
import org.gamemanagment.service.abstracts.CampaignService;
import org.gamemanagment.service.abstracts.GameService;
import org.gamemanagment.service.abstracts.PlayerService;

import java.util.ArrayList;

public class SaleManager {
    private final PlayerService playerService;
    private final CampaignService campaignService;
    private final GameService gameService;

    public SaleManager(PlayerService playerService, CampaignService campaignService, GameService gameService) {
        this.playerService = playerService;
        this.campaignService = campaignService;
        this.gameService = gameService;
    }

    public void doSale(Player player,int gameId){
        ArrayList<Game> games= gameService.getGames();
        for (Game game : games) {
            if (gameId==game.getId()){
                player.add(game);
                System.out.println(game.getPrice()+" TL tutarında ödeme alındı");
                break;
            }
        }
        playerService.updatePlayer(player);
        System.out.println("Oyun başarılı bir şekilde satıldı");
    }
    public void doSale(Player player,int gameId,int campaignId){
        ArrayList<Game> games= gameService.getGames();
        ArrayList<Campaign> campaigns= campaignService.getCampaigns();
        Campaign campaign=null;
        Game game = null;
        for (Campaign campaign1 : campaigns) {
            if (campaignId==campaign1.getId()){
                campaign=campaign1;
                break;
            }
        }
        for (Game game1 : games) {
            if (gameId==game1.getId()){
                game=game1;
                break;
            }
        }
        System.out.println((game.getPrice()*campaign.getDiscountRate()/100)+" TL tutarında ödeme alındı");
        System.out.println(campaign.getCampaignName()+" Kampanyası uygulandı");
        player.add(game);
        playerService.updatePlayer(player);
        System.out.println("Oyun başarılı bir şekilde satıldı");
    }
}