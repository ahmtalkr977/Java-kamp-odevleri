package javaGame2;

public class RaceCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	public RaceCustomerManager(CustomerCheckService customerCheckService ) {
		super();
		this.customerCheckService =customerCheckService;
		
	}
	
	@Override
	public void add(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Added to Database for Race : " +customer.getFirstName()+""+customer.getLastName());
			
		}else {
			System.out.println("Not a valid person");
		}
	}
	@Override
	public void update(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Updated to Database for Race : " +customer.getFirstName()+""+customer.getLastName());
			
		}else {
			System.out.println("Not a valid person");
		}
	}@Override
	public void delete(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Deleted from Database for Race: " +customer.getFirstName()+""+customer.getLastName());
			
		}else {
			System.out.println("Not a valid person");
		}
	}

}
