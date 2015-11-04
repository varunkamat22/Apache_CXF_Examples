package service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface GreetService {
	String sayHi(@WebParam(name="username") String name);
}
