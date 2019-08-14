
package ru.job4j.shop;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ShopServiceImplService", targetNamespace = "http://shop.job4j.ru/", wsdlLocation = "http://localhost:7779/ws/shop?wsdl")
public class ShopServiceImplService
    extends Service
{

    private final static URL SHOPSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHOPSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName SHOPSERVICEIMPLSERVICE_QNAME = new QName("http://shop.job4j.ru/", "ShopServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7779/ws/shop?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHOPSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        SHOPSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ShopServiceImplService() {
        super(__getWsdlLocation(), SHOPSERVICEIMPLSERVICE_QNAME);
    }

    public ShopServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SHOPSERVICEIMPLSERVICE_QNAME, features);
    }

    public ShopServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SHOPSERVICEIMPLSERVICE_QNAME);
    }

    public ShopServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SHOPSERVICEIMPLSERVICE_QNAME, features);
    }

    public ShopServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ShopServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ShopService
     */
    @WebEndpoint(name = "ShopServiceImplPort")
    public ShopService getShopServiceImplPort() {
        return super.getPort(new QName("http://shop.job4j.ru/", "ShopServiceImplPort"), ShopService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ShopService
     */
    @WebEndpoint(name = "ShopServiceImplPort")
    public ShopService getShopServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://shop.job4j.ru/", "ShopServiceImplPort"), ShopService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHOPSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw SHOPSERVICEIMPLSERVICE_EXCEPTION;
        }
        return SHOPSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
