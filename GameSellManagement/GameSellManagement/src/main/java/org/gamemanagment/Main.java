package org.gamemanagment;

 import org.gamemanagment.model.Campaign;
import org.gamemanagment.model.Game;
import org.gamemanagment.model.Player;
import org.gamemanagment.service.concretes.*;

public class Main {
    public static void main(String[] args){
        PlayerManager playerManager=new PlayerManager(new ValidationWithFile());
        Player player=new Player(1,"Beytullah","Topbaş","12345678901","01.01.2000","12.12.2023","123","asdasdasd@gmail.com",null,null);
        Player player1=new Player(2,"Batuhan","Yirtici","01987654321","02.02.2000","13.13.2023","1234","asdasd@gmail.com","by","picture.jpg");
        Player player2=new Player(3,"Beytullah","asdasd","12345678901","01.01.2000","12.12.2023","123","asdasdasd@gmail.com",null,null);
        playerManager.registerPlayer(player);
        playerManager.showAllPlayers();
        playerManager.registerPlayer(player1);
        playerManager.showAllPlayers();
        playerManager.registerPlayer(player2);//var olmayan kullanıcı eklenmeye çalışıyoruz
        System.out.println("********************");
        playerManager.showAllPlayers();
        System.out.println("---------------------------------------");
//        playerManager.deletePlayer(1);
        playerManager.showAllPlayers();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        player1.setUserName("bty");
        playerManager.updatePlayer(player1);
        playerManager.showAllPlayers();
        // player manager testi bitti.
        GameManager gameManager=new GameManager();
        Game game=new Game(1,"Valorant",1300,"Kanser eden bir oyun","FPS","Jett.png");
        gameManager.addGame(game);
        gameManager.show();
        System.out.println("********************************");
//        gameManager.deleteGame(1);
        gameManager.show();
        //game manager testi bitti.
        CampaignManager campaignManager=new CampaignManager();
        Campaign campaign=new Campaign(1,"Black Friday",10);
        campaignManager.saveCampaign(campaign);
        campaignManager.showAllCampaigns();
        System.out.println("/////////////////////////////");
        campaign.setDiscountRate(60);
        campaign.setCampaignName("New year");
        campaignManager.updateCampaign(campaign);
        campaignManager.showAllCampaigns();
        System.out.println("-----------------------------");
//        campaignManager.deleteCampaign(1);
        campaignManager.showAllCampaigns();
        //campaign manager testi bitti.
        SaleManager saleManager=new SaleManager(playerManager,campaignManager,gameManager);
        saleManager.doSale(player,1);
        playerManager.showAllPlayers();
        System.out.println("++++++++");
        saleManager.doSale(player1,1,1);
        playerManager.showAllPlayers();
    }
}