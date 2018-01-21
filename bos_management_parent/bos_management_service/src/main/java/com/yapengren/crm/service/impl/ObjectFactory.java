
package com.yapengren.crm.service.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yapengren.crm.service.impl package. 
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

    private final static QName _FindByTelephone_QNAME = new QName("http://impl.service.crm.yapengren.com/", "findByTelephone");
    private final static QName _GetLinkedCustomersResponse_QNAME = new QName("http://impl.service.crm.yapengren.com/", "getLinkedCustomersResponse");
    private final static QName _FindByEmail_QNAME = new QName("http://impl.service.crm.yapengren.com/", "findByEmail");
    private final static QName _FindByEmailAndPassword_QNAME = new QName("http://impl.service.crm.yapengren.com/", "findByEmailAndPassword");
    private final static QName _SaveResponse_QNAME = new QName("http://impl.service.crm.yapengren.com/", "saveResponse");
    private final static QName _FixedAreaLinkCustomers_QNAME = new QName("http://impl.service.crm.yapengren.com/", "fixedAreaLinkCustomers");
    private final static QName _GetUnLinkedCustomers_QNAME = new QName("http://impl.service.crm.yapengren.com/", "getUnLinkedCustomers");
    private final static QName _FindByEmailAndPasswordResponse_QNAME = new QName("http://impl.service.crm.yapengren.com/", "findByEmailAndPasswordResponse");
    private final static QName _GetUnLinkedCustomersResponse_QNAME = new QName("http://impl.service.crm.yapengren.com/", "getUnLinkedCustomersResponse");
    private final static QName _FindByTelephoneResponse_QNAME = new QName("http://impl.service.crm.yapengren.com/", "findByTelephoneResponse");
    private final static QName _GetLinkedCustomers_QNAME = new QName("http://impl.service.crm.yapengren.com/", "getLinkedCustomers");
    private final static QName _FixedAreaLinkCustomersResponse_QNAME = new QName("http://impl.service.crm.yapengren.com/", "fixedAreaLinkCustomersResponse");
    private final static QName _FindByEmailResponse_QNAME = new QName("http://impl.service.crm.yapengren.com/", "findByEmailResponse");
    private final static QName _Active_QNAME = new QName("http://impl.service.crm.yapengren.com/", "active");
    private final static QName _Save_QNAME = new QName("http://impl.service.crm.yapengren.com/", "save");
    private final static QName _ActiveResponse_QNAME = new QName("http://impl.service.crm.yapengren.com/", "activeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yapengren.crm.service.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FixedAreaLinkCustomersResponse }
     * 
     */
    public FixedAreaLinkCustomersResponse createFixedAreaLinkCustomersResponse() {
        return new FixedAreaLinkCustomersResponse();
    }

    /**
     * Create an instance of {@link FindByTelephoneResponse }
     * 
     */
    public FindByTelephoneResponse createFindByTelephoneResponse() {
        return new FindByTelephoneResponse();
    }

    /**
     * Create an instance of {@link GetLinkedCustomers }
     * 
     */
    public GetLinkedCustomers createGetLinkedCustomers() {
        return new GetLinkedCustomers();
    }

    /**
     * Create an instance of {@link FindByEmailAndPasswordResponse }
     * 
     */
    public FindByEmailAndPasswordResponse createFindByEmailAndPasswordResponse() {
        return new FindByEmailAndPasswordResponse();
    }

    /**
     * Create an instance of {@link GetUnLinkedCustomersResponse }
     * 
     */
    public GetUnLinkedCustomersResponse createGetUnLinkedCustomersResponse() {
        return new GetUnLinkedCustomersResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link Active }
     * 
     */
    public Active createActive() {
        return new Active();
    }

    /**
     * Create an instance of {@link ActiveResponse }
     * 
     */
    public ActiveResponse createActiveResponse() {
        return new ActiveResponse();
    }

    /**
     * Create an instance of {@link FindByEmailResponse }
     * 
     */
    public FindByEmailResponse createFindByEmailResponse() {
        return new FindByEmailResponse();
    }

    /**
     * Create an instance of {@link FindByTelephone }
     * 
     */
    public FindByTelephone createFindByTelephone() {
        return new FindByTelephone();
    }

    /**
     * Create an instance of {@link GetUnLinkedCustomers }
     * 
     */
    public GetUnLinkedCustomers createGetUnLinkedCustomers() {
        return new GetUnLinkedCustomers();
    }

    /**
     * Create an instance of {@link FixedAreaLinkCustomers }
     * 
     */
    public FixedAreaLinkCustomers createFixedAreaLinkCustomers() {
        return new FixedAreaLinkCustomers();
    }

    /**
     * Create an instance of {@link FindByEmail }
     * 
     */
    public FindByEmail createFindByEmail() {
        return new FindByEmail();
    }

    /**
     * Create an instance of {@link GetLinkedCustomersResponse }
     * 
     */
    public GetLinkedCustomersResponse createGetLinkedCustomersResponse() {
        return new GetLinkedCustomersResponse();
    }

    /**
     * Create an instance of {@link FindByEmailAndPassword }
     * 
     */
    public FindByEmailAndPassword createFindByEmailAndPassword() {
        return new FindByEmailAndPassword();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByTelephone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "findByTelephone")
    public JAXBElement<FindByTelephone> createFindByTelephone(FindByTelephone value) {
        return new JAXBElement<FindByTelephone>(_FindByTelephone_QNAME, FindByTelephone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLinkedCustomersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "getLinkedCustomersResponse")
    public JAXBElement<GetLinkedCustomersResponse> createGetLinkedCustomersResponse(GetLinkedCustomersResponse value) {
        return new JAXBElement<GetLinkedCustomersResponse>(_GetLinkedCustomersResponse_QNAME, GetLinkedCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "findByEmail")
    public JAXBElement<FindByEmail> createFindByEmail(FindByEmail value) {
        return new JAXBElement<FindByEmail>(_FindByEmail_QNAME, FindByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByEmailAndPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "findByEmailAndPassword")
    public JAXBElement<FindByEmailAndPassword> createFindByEmailAndPassword(FindByEmailAndPassword value) {
        return new JAXBElement<FindByEmailAndPassword>(_FindByEmailAndPassword_QNAME, FindByEmailAndPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixedAreaLinkCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "fixedAreaLinkCustomers")
    public JAXBElement<FixedAreaLinkCustomers> createFixedAreaLinkCustomers(FixedAreaLinkCustomers value) {
        return new JAXBElement<FixedAreaLinkCustomers>(_FixedAreaLinkCustomers_QNAME, FixedAreaLinkCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnLinkedCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "getUnLinkedCustomers")
    public JAXBElement<GetUnLinkedCustomers> createGetUnLinkedCustomers(GetUnLinkedCustomers value) {
        return new JAXBElement<GetUnLinkedCustomers>(_GetUnLinkedCustomers_QNAME, GetUnLinkedCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByEmailAndPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "findByEmailAndPasswordResponse")
    public JAXBElement<FindByEmailAndPasswordResponse> createFindByEmailAndPasswordResponse(FindByEmailAndPasswordResponse value) {
        return new JAXBElement<FindByEmailAndPasswordResponse>(_FindByEmailAndPasswordResponse_QNAME, FindByEmailAndPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnLinkedCustomersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "getUnLinkedCustomersResponse")
    public JAXBElement<GetUnLinkedCustomersResponse> createGetUnLinkedCustomersResponse(GetUnLinkedCustomersResponse value) {
        return new JAXBElement<GetUnLinkedCustomersResponse>(_GetUnLinkedCustomersResponse_QNAME, GetUnLinkedCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByTelephoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "findByTelephoneResponse")
    public JAXBElement<FindByTelephoneResponse> createFindByTelephoneResponse(FindByTelephoneResponse value) {
        return new JAXBElement<FindByTelephoneResponse>(_FindByTelephoneResponse_QNAME, FindByTelephoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLinkedCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "getLinkedCustomers")
    public JAXBElement<GetLinkedCustomers> createGetLinkedCustomers(GetLinkedCustomers value) {
        return new JAXBElement<GetLinkedCustomers>(_GetLinkedCustomers_QNAME, GetLinkedCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixedAreaLinkCustomersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "fixedAreaLinkCustomersResponse")
    public JAXBElement<FixedAreaLinkCustomersResponse> createFixedAreaLinkCustomersResponse(FixedAreaLinkCustomersResponse value) {
        return new JAXBElement<FixedAreaLinkCustomersResponse>(_FixedAreaLinkCustomersResponse_QNAME, FixedAreaLinkCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "findByEmailResponse")
    public JAXBElement<FindByEmailResponse> createFindByEmailResponse(FindByEmailResponse value) {
        return new JAXBElement<FindByEmailResponse>(_FindByEmailResponse_QNAME, FindByEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Active }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "active")
    public JAXBElement<Active> createActive(Active value) {
        return new JAXBElement<Active>(_Active_QNAME, Active.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.crm.yapengren.com/", name = "activeResponse")
    public JAXBElement<ActiveResponse> createActiveResponse(ActiveResponse value) {
        return new JAXBElement<ActiveResponse>(_ActiveResponse_QNAME, ActiveResponse.class, null, value);
    }

}
