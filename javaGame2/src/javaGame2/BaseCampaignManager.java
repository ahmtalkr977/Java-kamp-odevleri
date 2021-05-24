package javaGame2;

public abstract  class BaseCampaignManager implements CampaignManager {
	public abstract void add(Campaign campaign);
	
	public  abstract void update(Campaign campaign);
	
	public abstract void delete(Campaign campaign);
}
