package test;

import client.com.guidewire.mobility.webservices.iloginwrapperapi.service.iloginwrapperapi.ILoginWrapperAPI;
import client.com.guidewire.mobility.webservices.iloginwrapperapi.vo.loginrequest.LoginRequest;
import client.com.guidewire.mobility.webservices.iloginwrapperapi.vo.loginresponse.LoginResponse;

public class LoginTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ILoginWrapperAPI service = new ILoginWrapperAPI();
		LoginRequest request = new LoginRequest();
		request.setUserName("su");
		request.setPassWord("gw");
		
		HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
		service.setHandlerResolver(handlerResolver);
		
		LoginResponse response = service.getILoginWrapperAPISoap11Port().login(request);
		System.out.println(response.getSessionID());
		System.out.println(response.getStatusMessage());
	}

}
