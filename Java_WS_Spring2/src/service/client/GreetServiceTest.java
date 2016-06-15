package service.client;

import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import service.PasswordCallBackHandler;

public class GreetServiceTest {
	
	public static void main(String[] args){
		ApplicationContext ctx = (ApplicationContext) new FileSystemXmlApplicationContext(new  String[] {"src\\main\\webapp\\WEB-INF\\ws-client-config.xml"});
		GreetService greeter = (GreetService) ctx.getBean("greetClient");
		//GreetService greeter =  gs.getGreetServiceImplPort();
		org.apache.cxf.endpoint.Client client = ClientProxy.getClient(greeter);
		org.apache.cxf.endpoint.Endpoint cxfEndpoint = client.getEndpoint();
		Map<String,Object> outProps = new HashMap<String,Object>();
		WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
		outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
		// Specify our username
		outProps.put(WSHandlerConstants.USER, "spring");
		// Password type : plain text
		outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
		// for hashed password use:
		//properties.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_DIGEST);
		// Callback used to retrieve password for given user.
		outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, PasswordCallBackHandler.class.getName());
		cxfEndpoint.getOutInterceptors().add(wssOut);
		String res = greeter.sayHi("james");
		System.out.println(">>>>"+res);
	}
	
}
