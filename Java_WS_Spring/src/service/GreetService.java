package service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;
import org.apache.cxf.annotations.WSDLDocumentation;
import org.apache.cxf.annotations.WSDLDocumentationCollection;

@WebService
@WSDLDocumentationCollection({
	@WSDLDocumentation("This is a simple web - service"),
	@WSDLDocumentation(value = "This is a simple web - service", placement = WSDLDocumentation.Placement.TOP),
	@WSDLDocumentation(value = "Greet service port", placement = WSDLDocumentation.Placement.BINDING) })
public interface GreetService {
	
	@SchemaValidation(type = SchemaValidationType.BOTH) //Turns on schema validation at client and server end
	@WSDLDocumentation(value="Just a greet service, say Hi!!", placement = WSDLDocumentation.Placement.BINDING_OPERATION)
	String sayHi(@XmlElement(name = "username", required = true) String name);
}
