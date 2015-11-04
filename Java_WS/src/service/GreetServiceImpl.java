package service;

import javax.jws.WebService;

@WebService(endpointInterface = "service.GreetService", serviceName = "GreetService")
public class GreetServiceImpl implements GreetService{
	
	public String sayHi(String name){
		return "Welcome, "+name;
	}
}
