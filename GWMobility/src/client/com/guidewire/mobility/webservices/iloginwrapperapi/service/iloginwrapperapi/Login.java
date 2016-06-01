
package client.com.guidewire.mobility.webservices.iloginwrapperapi.service.iloginwrapperapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import client.com.guidewire.mobility.webservices.iloginwrapperapi.vo.loginrequest.LoginRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginRequest" type="{http://guidewire.com/mobility/webservices/ILoginWrapperAPI/vo/LoginRequest}LoginRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginRequest"
})
@XmlRootElement(name = "login")
public class Login {

    protected LoginRequest loginRequest;

    /**
     * Gets the value of the loginRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoginRequest }
     *     
     */
    public LoginRequest getLoginRequest() {
        return loginRequest;
    }

    /**
     * Sets the value of the loginRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRequest }
     *     
     */
    public void setLoginRequest(LoginRequest value) {
        this.loginRequest = value;
    }

}
