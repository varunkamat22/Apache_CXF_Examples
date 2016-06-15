package service;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.springframework.stereotype.Component;


public class PasswordCallBackHandler implements CallbackHandler {
	
	public PasswordCallBackHandler(){
		System.out.println("Callback handler initailaized");
	}
    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
        
        System.out.println(pc.getPassword());
        if (null !=pc.getIdentifier() && "spring".equals(pc.getIdentifier())) {
           pc.setPassword("ws"); 
        }else{
        	throw new IOException("Invalid username/password combination");
        }
    }
}
