package service;

import javax.xml.ws.Endpoint;

public class GreetServiceTest {
	
	public static void main(String[] args) {
		System.out.println("Starting Server");
		GreetServiceImpl implementor = new GreetServiceImpl();
		String address = "http://localhost:9000/greetservice";
		Endpoint.publish(address, implementor);
	}
	
}
