
package WebService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ChatService", targetNamespace = "http://ServicesGenerator/", wsdlLocation = "http://localhost:8080/ConnectServer/ChatService?wsdl")
public class ChatService_Service
    extends Service
{

    private final static URL CHATSERVICE_WSDL_LOCATION;
    private final static WebServiceException CHATSERVICE_EXCEPTION;
    private final static QName CHATSERVICE_QNAME = new QName("http://ServicesGenerator/", "ChatService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ConnectServer/ChatService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHATSERVICE_WSDL_LOCATION = url;
        CHATSERVICE_EXCEPTION = e;
    }

    public ChatService_Service() {
        super(__getWsdlLocation(), CHATSERVICE_QNAME);
    }

    public ChatService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHATSERVICE_QNAME, features);
    }

    public ChatService_Service(URL wsdlLocation) {
        super(wsdlLocation, CHATSERVICE_QNAME);
    }

    public ChatService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHATSERVICE_QNAME, features);
    }

    public ChatService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChatService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ChatService
     */
    @WebEndpoint(name = "ChatServicePort")
    public ChatService getChatServicePort() {
        return super.getPort(new QName("http://ServicesGenerator/", "ChatServicePort"), ChatService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChatService
     */
    @WebEndpoint(name = "ChatServicePort")
    public ChatService getChatServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ServicesGenerator/", "ChatServicePort"), ChatService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHATSERVICE_EXCEPTION!= null) {
            throw CHATSERVICE_EXCEPTION;
        }
        return CHATSERVICE_WSDL_LOCATION;
    }

}