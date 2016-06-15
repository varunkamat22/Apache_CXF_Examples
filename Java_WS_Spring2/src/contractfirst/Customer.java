package contractfirst;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CustomerInfo")
@XmlAccessorType(XmlAccessType.FIELD )
public class Customer {
	public String name;
	public String customerID;
	public Date createdDate;
}
