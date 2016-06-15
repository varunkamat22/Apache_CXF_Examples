package contractfirst;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;

public class CustomerServiceImpl implements CustomerDetails{


	public Customer[] getCustomers(String name) {
		Customer customer = new Customer();
		customer.createdDate = new Date();
		customer.customerID = "1234";
		customer.name = "James";
		return new Customer[]{customer};
	}

	@WebMethod
	public boolean saveCustomer(
			@WebParam(name = "customerdetail") Customer customer) {
		System.out.println(customer.name);
		System.out.println(customer.customerID);
		System.out.println(customer.createdDate);
		return true;
	}

}
