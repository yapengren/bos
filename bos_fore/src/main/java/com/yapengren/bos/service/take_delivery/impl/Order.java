
package com.yapengren.bos.service.take_delivery.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>order complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="courier" type="{http://impl.take_delivery.service.bos.yapengren.com/}courier" minOccurs="0"/>
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="goodsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orderNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payTypeNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recArea" type="{http://impl.take_delivery.service.bos.yapengren.com/}area" minOccurs="0"/>
 *         &lt;element name="recCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendArea" type="{http://impl.take_delivery.service.bos.yapengren.com/}area" minOccurs="0"/>
 *         &lt;element name="sendCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendMobileMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendProNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wayBill" type="{http://impl.take_delivery.service.bos.yapengren.com/}wayBill" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="workBills" type="{http://impl.take_delivery.service.bos.yapengren.com/}workBill" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = {
    "courier",
    "customerId",
    "goodsType",
    "id",
    "orderNum",
    "orderTime",
    "orderType",
    "payTypeNum",
    "recAddress",
    "recArea",
    "recCompany",
    "recMobile",
    "recName",
    "remark",
    "sendAddress",
    "sendArea",
    "sendCompany",
    "sendMobile",
    "sendMobileMsg",
    "sendName",
    "sendProNum",
    "status",
    "telephone",
    "wayBill",
    "weight",
    "workBills"
})
public class Order {

    protected Courier courier;
    @XmlElement(name = "customer_id")
    protected Integer customerId;
    protected String goodsType;
    protected Integer id;
    protected String orderNum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderTime;
    protected String orderType;
    protected String payTypeNum;
    protected String recAddress;
    protected Area recArea;
    protected String recCompany;
    protected String recMobile;
    protected String recName;
    protected String remark;
    protected String sendAddress;
    protected Area sendArea;
    protected String sendCompany;
    protected String sendMobile;
    protected String sendMobileMsg;
    protected String sendName;
    protected String sendProNum;
    protected String status;
    protected String telephone;
    protected WayBill wayBill;
    protected Double weight;
    @XmlElement(nillable = true)
    protected List<WorkBill> workBills;

    /**
     * 获取courier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Courier }
     *     
     */
    public Courier getCourier() {
        return courier;
    }

    /**
     * 设置courier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Courier }
     *     
     */
    public void setCourier(Courier value) {
        this.courier = value;
    }

    /**
     * 获取customerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 设置customerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerId(Integer value) {
        this.customerId = value;
    }

    /**
     * 获取goodsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * 设置goodsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsType(String value) {
        this.goodsType = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * 获取orderNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 设置orderNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNum(String value) {
        this.orderNum = value;
    }

    /**
     * 获取orderTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderTime() {
        return orderTime;
    }

    /**
     * 设置orderTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderTime(XMLGregorianCalendar value) {
        this.orderTime = value;
    }

    /**
     * 获取orderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置orderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * 获取payTypeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTypeNum() {
        return payTypeNum;
    }

    /**
     * 设置payTypeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTypeNum(String value) {
        this.payTypeNum = value;
    }

    /**
     * 获取recAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecAddress() {
        return recAddress;
    }

    /**
     * 设置recAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecAddress(String value) {
        this.recAddress = value;
    }

    /**
     * 获取recArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getRecArea() {
        return recArea;
    }

    /**
     * 设置recArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setRecArea(Area value) {
        this.recArea = value;
    }

    /**
     * 获取recCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCompany() {
        return recCompany;
    }

    /**
     * 设置recCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCompany(String value) {
        this.recCompany = value;
    }

    /**
     * 获取recMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecMobile() {
        return recMobile;
    }

    /**
     * 设置recMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecMobile(String value) {
        this.recMobile = value;
    }

    /**
     * 获取recName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecName() {
        return recName;
    }

    /**
     * 设置recName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecName(String value) {
        this.recName = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取sendAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendAddress() {
        return sendAddress;
    }

    /**
     * 设置sendAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendAddress(String value) {
        this.sendAddress = value;
    }

    /**
     * 获取sendArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getSendArea() {
        return sendArea;
    }

    /**
     * 设置sendArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setSendArea(Area value) {
        this.sendArea = value;
    }

    /**
     * 获取sendCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendCompany() {
        return sendCompany;
    }

    /**
     * 设置sendCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendCompany(String value) {
        this.sendCompany = value;
    }

    /**
     * 获取sendMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendMobile() {
        return sendMobile;
    }

    /**
     * 设置sendMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendMobile(String value) {
        this.sendMobile = value;
    }

    /**
     * 获取sendMobileMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendMobileMsg() {
        return sendMobileMsg;
    }

    /**
     * 设置sendMobileMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendMobileMsg(String value) {
        this.sendMobileMsg = value;
    }

    /**
     * 获取sendName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendName() {
        return sendName;
    }

    /**
     * 设置sendName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendName(String value) {
        this.sendName = value;
    }

    /**
     * 获取sendProNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendProNum() {
        return sendProNum;
    }

    /**
     * 设置sendProNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendProNum(String value) {
        this.sendProNum = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取telephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置telephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * 获取wayBill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WayBill }
     *     
     */
    public WayBill getWayBill() {
        return wayBill;
    }

    /**
     * 设置wayBill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WayBill }
     *     
     */
    public void setWayBill(WayBill value) {
        this.wayBill = value;
    }

    /**
     * 获取weight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the workBills property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workBills property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkBills().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkBill }
     * 
     * 
     */
    public List<WorkBill> getWorkBills() {
        if (workBills == null) {
            workBills = new ArrayList<WorkBill>();
        }
        return this.workBills;
    }

}
