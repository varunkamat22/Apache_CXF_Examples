package contractfirst;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="CustomerInfoService",serviceName="CustomerInfoService")
public interface CustomerDetails {
	
	@WebMethod
	public Customer[] getCustomers(@WebParam(name="customername") String name);
	
}
