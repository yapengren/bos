
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
 * <p>fixedArea complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="fixedArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="couriers" type="{http://impl.take_delivery.service.bos.yapengren.com/}courier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fixedAreaLeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixedAreaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subareas" type="{http://impl.take_delivery.service.bos.yapengren.com/}subArea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fixedArea", propOrder = {
    "company",
    "couriers",
    "fixedAreaLeader",
    "fixedAreaName",
    "id",
    "operatingCompany",
    "operatingTime",
    "operator",
    "subareas",
    "telephone"
})
public class FixedArea {

    protected String company;
    @XmlElement(nillable = true)
    protected List<Courier> couriers;
    protected String fixedAreaLeader;
    protected String fixedAreaName;
    protected String id;
    protected String operatingCompany;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operatingTime;
    protected String operator;
    @XmlElement(nillable = true)
    protected List<SubArea> subareas;
    protected String telephone;

    /**
     * 获取company属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置company属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the couriers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couriers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouriers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Courier }
     * 
     * 
     */
    public List<Courier> getCouriers() {
        if (couriers == null) {
            couriers = new ArrayList<Courier>();
        }
        return this.couriers;
    }

    /**
     * 获取fixedAreaLeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedAreaLeader() {
        return fixedAreaLeader;
    }

    /**
     * 设置fixedAreaLeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedAreaLeader(String value) {
        this.fixedAreaLeader = value;
    }

    /**
     * 获取fixedAreaName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedAreaName() {
        return fixedAreaName;
    }

    /**
     * 设置fixedAreaName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedAreaName(String value) {
        this.fixedAreaName = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取operatingCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * 设置operatingCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCompany(String value) {
        this.operatingCompany = value;
    }

    /**
     * 获取operatingTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperatingTime() {
        return operatingTime;
    }

    /**
     * 设置operatingTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperatingTime(XMLGregorianCalendar value) {
        this.operatingTime = value;
    }

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the subareas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subareas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubareas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubArea }
     * 
     * 
     */
    public List<SubArea> getSubareas() {
        if (subareas == null) {
            subareas = new ArrayList<SubArea>();
        }
        return this.subareas;
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

}
