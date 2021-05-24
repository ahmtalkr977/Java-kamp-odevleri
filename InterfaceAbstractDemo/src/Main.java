
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.save(new Customer(1,"Ahmet","Alkur",2001,"16546518911"));

	}

}
