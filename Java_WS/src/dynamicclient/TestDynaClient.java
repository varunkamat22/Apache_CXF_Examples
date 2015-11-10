package dynamicclient;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class TestDynaClient {

	public static void main(String[] args) throws Exception {
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf
				.createClient(
						"http://localhost:8080/Java_WS_Spring/services/customerservice?wsdl",
						Thread.currentThread().getContextClassLoader());

		Object[] customers = client.invoke("getCustomers", "James");
		System.out.println(getFieldValue(customers[0], "getName"));
		System.out.println(getFieldValue(customers[0], "getCustomerID"));
		System.out.println(getFieldValue(customers[0], "getCreatedDate"));

		Object customer = Thread.currentThread().getContextClassLoader().loadClass("contractfirst.CustomerInfo").newInstance();
		setFieldValue(customer, "setName", String.class, "Jhon");
		setFieldValue(customer, "setCustomerID", String.class, "1212");
		setFieldValue(customer, "setCreatedDate", XMLGregorianCalendar.class, DatatypeFactory.newInstance().newXMLGregorianCalendar( new GregorianCalendar()));
		Object[] isSuccess = client.invoke("saveCustomer", customer); //Return type is always Object[]
		System.out.println(isSuccess[0]);
		
	}

	private static Object getFieldValue(Object obj, String methodName)
			throws Exception {
		if (obj == null || methodName == null) {
			return null;
		}
		return obj.getClass().getMethod(methodName).invoke(obj);
	}

	private static void setFieldValue(Object obj, String methodName, Class classType, Object value) throws Exception {
		obj.getClass().getMethod(methodName, classType).invoke(obj, value);
	}

}
