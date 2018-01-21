
package com.yapengren.crm.service.impl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CustomerServiceImpl", targetNamespace = "http://impl.service.crm.yapengren.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.yapengren.crm.service.impl.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLinkedCustomers", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.GetLinkedCustomers")
    @ResponseWrapper(localName = "getLinkedCustomersResponse", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.GetLinkedCustomersResponse")
    public List<Customer> getLinkedCustomers(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.yapengren.crm.service.impl.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByTelephone", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.FindByTelephone")
    @ResponseWrapper(localName = "findByTelephoneResponse", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.FindByTelephoneResponse")
    public Customer findByTelephone(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.yapengren.crm.service.impl.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByAddress", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.FindByAddress")
    @ResponseWrapper(localName = "findByAddressResponse", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.FindByAddressResponse")
    public Customer findByAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.yapengren.crm.service.impl.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByEmail", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.FindByEmail")
    @ResponseWrapper(localName = "findByEmailResponse", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.FindByEmailResponse")
    public Customer findByEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.yapengren.crm.service.impl.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByEmailAndPassword", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.FindByEmailAndPassword")
    @ResponseWrapper(localName = "findByEmailAndPasswordResponse", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.FindByEmailAndPasswordResponse")
    public Customer findByEmailAndPassword(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "active", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.Active")
    @ResponseWrapper(localName = "activeResponse", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.ActiveResponse")
    public void active(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "save", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.SaveResponse")
    public void save(
        @WebParam(name = "arg0", targetNamespace = "")
        Customer arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "fixedAreaLinkCustomers", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.FixedAreaLinkCustomers")
    @ResponseWrapper(localName = "fixedAreaLinkCustomersResponse", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.FixedAreaLinkCustomersResponse")
    public void fixedAreaLinkCustomers(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<Integer> arg1);

    /**
     * 
     * @return
     *     returns java.util.List<com.yapengren.crm.service.impl.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUnLinkedCustomers", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.GetUnLinkedCustomers")
    @ResponseWrapper(localName = "getUnLinkedCustomersResponse", targetNamespace = "http://impl.service.crm.yapengren.com/", className = "com.yapengren.crm.service.impl.GetUnLinkedCustomersResponse")
    public List<Customer> getUnLinkedCustomers();

}
