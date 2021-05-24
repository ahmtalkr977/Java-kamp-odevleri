package javaGame2;

public abstract class BaseCustomerManager  implements CustomerManager{

	@Override
	public abstract void add(Customer customer);

	@Override
	public  abstract void update(Customer customer) ;

	@Override
	public abstract  void delete(Customer customer) ;

}
