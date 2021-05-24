package javaGame2;

public class RaceSaleManager  extends BaseSaleManager{
	
	@Override
	public void sale(Customer customer,Game game,Campaign campaign) {
		
		double discountedPrice = game.getPrice()-(game.getPrice() * campaign.getDiscountRate() / 100);
		System.out.println(customer.getFirstName()+"  "+customer.getLastName()+" bought the "+game.getGameName()+"Price: "+discountedPrice);
	}

}
