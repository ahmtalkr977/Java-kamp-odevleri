package javaGame2;

public class PuzzleCustomerManager implements CustomerManager{

	@Override
	public void add(Customer customer) {
		System.out.println("Added to Database for Puzzle : "+customer.getFirstName()+customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Updated to Database for Puzzle : "+customer.getFirstName()+customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted from Database for Puzzle : "+customer.getFirstName()+customer.getLastName());
		
	}

}
