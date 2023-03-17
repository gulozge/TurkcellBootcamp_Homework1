package org.gamemanagment.service.concretes;

import org.gamemanagment.database.CampaignsData;
import org.gamemanagment.model.Campaign;
import org.gamemanagment.service.abstracts.CampaignService;

import java.util.ArrayList;

public class CampaignManager implements CampaignService {
    @Override
    public void saveCampaign(Campaign campaign){
        CampaignsData.add(campaign);
        System.out.println("Kampanya sisteme eklendi");
    }
    @Override
    public void deleteCampaign(int campaignId){
        ArrayList<Campaign> tempCampaigns= CampaignsData.getCampaigns();
        for (int i=0;i< tempCampaigns.size();i++){
            Campaign campaign=tempCampaigns.get(i);
            if (campaign.getId()==campaignId){
                tempCampaigns.remove(i);
                break;
            }
        }
        CampaignsData.setCampaigns(tempCampaigns);
        System.out.println("Kampanya sistemden silindi");
    }
    @Override
    public void updateCampaign(Campaign campaign){
        ArrayList<Campaign> tempCampaigns= CampaignsData.getCampaigns();
        for (int i=0;i< tempCampaigns.size();i++){
            Campaign campaign1=tempCampaigns.get(i);
            if (campaign1.getId()== campaign.getId()){
                tempCampaigns.remove(i);
                tempCampaigns.add(i,campaign);
                break;
            }
        }
        System.out.println("Kampanya bilgileri güncellendi");
        CampaignsData.setCampaigns(tempCampaigns);
    }

    @Override
    public void showAllCampaigns() {
        System.out.println(CampaignsData.getCampaigns());
    }

    @Override
    public ArrayList<Campaign> getCampaigns(){
        return CampaignsData.getCampaigns();
    }
}