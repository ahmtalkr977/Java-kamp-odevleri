package javaGame2;

public class RaceCampaignManager  extends BaseCampaignManager{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignTitle()+" has been added.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignTitle()+" has been updated.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignTitle()+ " has been deleted. ");
		
	}

}
