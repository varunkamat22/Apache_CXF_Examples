package test;

import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
 
/**
 *
 * @author www.javadb.com
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
 
    public boolean handleMessage(SOAPMessageContext smc) {
 
        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
 
        if (outboundProperty.booleanValue()) {
 
            SOAPMessage message = smc.getMessage();
 
            try {
 
                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.addHeader();
                envelope.addNamespaceDeclaration("soap", "http://guidewire.com/ws/soapheaders");
                SOAPElement auth = header.addChildElement("authentication","soap");                
                SOAPElement username = header.addChildElement("username","soap");
                username.addTextNode("mobileuser");
                SOAPElement password = header.addChildElement("password","soap");
                password.addTextNode("mobil123");
                auth.addChildElement(username);
                auth.addChildElement(password);
                System.out.println("");
                 
            } catch (Exception e) {
                e.printStackTrace();
            }
 
        } else {
            try {
                 
                //This handler does nothing with the response from the Web Service so
                //we just print out the SOAP message.
                SOAPMessage message = smc.getMessage();
            } catch (Exception ex) {
                ex.printStackTrace();
            } 
        }
 
 
        return outboundProperty;
 
    }
 
    public Set getHeaders() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return null;
    }
 
    public boolean handleFault(SOAPMessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }
 
    public void close(MessageContext context) {
    //throw new UnsupportedOperationException("Not supported yet.");
    }
}
