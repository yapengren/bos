
package com.yapengren.bos.service.take_delivery.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>courier complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="courier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courierNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deltag" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="fixedAreas" type="{http://impl.take_delivery.service.bos.yapengren.com/}fixedArea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standard" type="{http://impl.take_delivery.service.bos.yapengren.com/}standard" minOccurs="0"/>
 *         &lt;element name="takeTime" type="{http://impl.take_delivery.service.bos.yapengren.com/}takeTime" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "courier", propOrder = {
    "checkPwd",
    "company",
    "courierNum",
    "deltag",
    "fixedAreas",
    "id",
    "name",
    "pda",
    "standard",
    "takeTime",
    "telephone",
    "type",
    "vehicleNum",
    "vehicleType"
})
public class Courier {

    protected String checkPwd;
    protected String company;
    protected String courierNum;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer deltag;
    @XmlElement(nillable = true)
    protected List<FixedArea> fixedAreas;
    protected Integer id;
    protected String name;
    protected String pda;
    protected Standard standard;
    protected TakeTime takeTime;
    protected String telephone;
    protected String type;
    protected String vehicleNum;
    protected String vehicleType;

    /**
     * 获取checkPwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPwd() {
        return checkPwd;
    }

    /**
     * 设置checkPwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPwd(String value) {
        this.checkPwd = value;
    }

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
     * 获取courierNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourierNum() {
        return courierNum;
    }

    /**
     * 设置courierNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourierNum(String value) {
        this.courierNum = value;
    }

    /**
     * 获取deltag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeltag() {
        return deltag;
    }

    /**
     * 设置deltag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeltag(Integer value) {
        this.deltag = value;
    }

    /**
     * Gets the value of the fixedAreas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedAreas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedArea }
     * 
     * 
     */
    public List<FixedArea> getFixedAreas() {
        if (fixedAreas == null) {
            fixedAreas = new ArrayList<FixedArea>();
        }
        return this.fixedAreas;
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
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取pda属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPda() {
        return pda;
    }

    /**
     * 设置pda属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPda(String value) {
        this.pda = value;
    }

    /**
     * 获取standard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Standard }
     *     
     */
    public Standard getStandard() {
        return standard;
    }

    /**
     * 设置standard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Standard }
     *     
     */
    public void setStandard(Standard value) {
        this.standard = value;
    }

    /**
     * 获取takeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TakeTime }
     *     
     */
    public TakeTime getTakeTime() {
        return takeTime;
    }

    /**
     * 设置takeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TakeTime }
     *     
     */
    public void setTakeTime(TakeTime value) {
        this.takeTime = value;
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
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取vehicleNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleNum() {
        return vehicleNum;
    }

    /**
     * 设置vehicleNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleNum(String value) {
        this.vehicleNum = value;
    }

    /**
     * 获取vehicleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 设置vehicleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

}
