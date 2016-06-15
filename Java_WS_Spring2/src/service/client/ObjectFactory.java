
package service.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHi_QNAME = new QName("http://service/", "sayHi");
    private final static QName _UploadDocResponse_QNAME = new QName("http://service/", "uploadDocResponse");
    private final static QName _SayHiResponse_QNAME = new QName("http://service/", "sayHiResponse");
    private final static QName _UploadDoc_QNAME = new QName("http://service/", "uploadDoc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadDocResponse }
     * 
     */
    public UploadDocResponse createUploadDocResponse() {
        return new UploadDocResponse();
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link UploadDoc }
     * 
     */
    public UploadDoc createUploadDoc() {
        return new UploadDoc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "uploadDocResponse")
    public JAXBElement<UploadDocResponse> createUploadDocResponse(UploadDocResponse value) {
        return new JAXBElement<UploadDocResponse>(_UploadDocResponse_QNAME, UploadDocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "uploadDoc")
    public JAXBElement<UploadDoc> createUploadDoc(UploadDoc value) {
        return new JAXBElement<UploadDoc>(_UploadDoc_QNAME, UploadDoc.class, null, value);
    }

}
