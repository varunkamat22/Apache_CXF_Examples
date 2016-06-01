
package client.com.guidewire.mobility.webservices.iloginwrapperapi.service.iloginwrapperapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="return" type="{http://guidewire.com/mobility/webservices/ILoginWrapperAPI/vo/LoginResponse}LoginResponse" minOccurs="0"/>
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
    "_return"
})
@XmlRootElement(name = "loginResponse")
public class LoginResponse {

    @XmlElement(name = "return")
    protected client.com.guidewire.mobility.webservices.iloginwrapperapi.vo.loginresponse.LoginResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link com.guidewire.mobility.webservices.iloginwrapperapi.vo.loginresponse.LoginResponse }
     *     
     */
    public client.com.guidewire.mobility.webservices.iloginwrapperapi.vo.loginresponse.LoginResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.guidewire.mobility.webservices.iloginwrapperapi.vo.loginresponse.LoginResponse }
     *     
     */
    public void setReturn(client.com.guidewire.mobility.webservices.iloginwrapperapi.vo.loginresponse.LoginResponse value) {
        this._return = value;
    }

}
