import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters  implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try
		{
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
							customer.getFirstName().toUpperCase(),
							customer.getLastName().toUpperCase(),
							customer.getDateOfBirth()
							);
			
		}
		catch (RemoteException e) {
			e.printStackTrace();
			
		}
		return result;
	}

}
