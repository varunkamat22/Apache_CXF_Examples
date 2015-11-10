package contractfirst;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="CustomerInfoService",serviceName="CustomerInfoService",portName="CustomerInfoServicePort")
public interface CustomerDetails {
	
	@WebMethod
	public Customer[] getCustomers(@WebParam(name="customername") String name);
	
	@WebMethod 
	public boolean saveCustomer(@WebParam(name="customerdetail") Customer customer);
}
