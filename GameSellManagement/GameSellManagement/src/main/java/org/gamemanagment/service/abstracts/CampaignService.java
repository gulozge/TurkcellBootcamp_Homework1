package org.gamemanagment.service.abstracts;

import org.gamemanagment.model.Campaign;

import java.util.ArrayList;

public interface CampaignService {
    void saveCampaign(Campaign campaign);
    void deleteCampaign(int id);
    void updateCampaign(Campaign campaign);
    void showAllCampaigns();
    ArrayList<Campaign> getCampaigns();
}
