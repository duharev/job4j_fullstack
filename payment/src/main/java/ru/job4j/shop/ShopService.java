
package ru.job4j.shop;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ShopService", targetNamespace = "http://shop.job4j.ru/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ShopService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://shop.job4j.ru/ShopService/updateRequest", output = "http://shop.job4j.ru/ShopService/updateResponse")
    public void update(
        @WebParam(name = "arg0", partName = "arg0")
        Item arg0);

    /**
     * 
     * @return
     *     returns ru.job4j.shop.ItemArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://shop.job4j.ru/ShopService/listRequest", output = "http://shop.job4j.ru/ShopService/listResponse")
    public ItemArray list();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://shop.job4j.ru/ShopService/deleteRequest", output = "http://shop.job4j.ru/ShopService/deleteResponse")
    public void delete(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ru.job4j.shop.Item
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://shop.job4j.ru/ShopService/createRequest", output = "http://shop.job4j.ru/ShopService/createResponse")
    public Item create(
        @WebParam(name = "arg0", partName = "arg0")
        Item arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ru.job4j.shop.Item
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://shop.job4j.ru/ShopService/findByIdRequest", output = "http://shop.job4j.ru/ShopService/findByIdResponse")
    public Item findById(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

}
