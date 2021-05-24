package javaGame2;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new RaceCustomerManager(new MernisServiceAdapters());
		Customer customer = new Customer(1,"Ahmet","Alkur",2001,"26556136546");
		customerManager.add(customer);
		
		BaseGameManager gameManager= new RaceGameManager();
		Game game = new Game(1,"NFS","Race",160.00,"2015");
		gameManager.update(game);
		
		BaseCampaignManager campaignManager = new RaceCampaignManager();
		Campaign campaign = new Campaign(1,"Summer Discount",50,60);
		campaignManager.delete(campaign);
		
		BaseSaleManager saleManager= new RaceSaleManager();
		saleManager.sale(customer, game, campaign);
		
		

	}

}
