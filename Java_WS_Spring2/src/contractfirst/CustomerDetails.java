package contractfirst;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.annotations.WSDLDocumentation;
import org.apache.cxf.annotations.WSDLDocumentationCollection;

@WebService(name = "CustomerInfoService", serviceName = "CustomerInfoService", portName = "CustomerInfoServicePort")
@WSDLDocumentationCollection({
		@WSDLDocumentation("My portType documentation"),
		@WSDLDocumentation(value = "My top level documentation", placement = WSDLDocumentation.Placement.TOP),
		@WSDLDocumentation(value = "My binding doc", placement = WSDLDocumentation.Placement.BINDING) })
public interface CustomerDetails {

	@WebMethod
	public Customer[] getCustomers(@WebParam(name = "customername") String name);

	@WebMethod
	public boolean saveCustomer(
			@WebParam(name = "customerdetail") Customer customer);
}
