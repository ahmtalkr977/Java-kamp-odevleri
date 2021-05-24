package javaGame2;

public class Campaign  implements Entity{
	 private int id;
	 private String campaignTitle;
	 private int campaignDuration;
	 private int discountRate;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignTitle, int campaignDuration, int discountRate) {
		super();
		this.id = id;
		this.campaignTitle = campaignTitle;
		this.campaignDuration = campaignDuration;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignTitle() {
		return campaignTitle;
	}

	public void setCampaignTitle(String campaignTitle) {
		this.campaignTitle = campaignTitle;
	}

	public int getCampaignDuration() {
		return campaignDuration;
	}

	public void setCampaignDuration(int campaignDuration) {
		this.campaignDuration = campaignDuration;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

}
