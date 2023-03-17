package org.gamemanagment.database;

import org.gamemanagment.model.Campaign;

import java.util.ArrayList;

public class CampaignsData {
    private static ArrayList<Campaign> campaigns=new ArrayList<>();
    public static ArrayList<Campaign> getCampaigns() {
        return campaigns;
    }
    public static void setCampaigns(ArrayList<Campaign> campaigns) {
        CampaignsData.campaigns = campaigns;
    }
    public static void add(Campaign campaign){
        campaigns.add(campaign);
    }
}