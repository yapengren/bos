
package com.yapengren.bos.service.take_delivery.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>subArea complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="subArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://impl.take_delivery.service.bos.yapengren.com/}area" minOccurs="0"/>
 *         &lt;element name="assistKeyWords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixedArea" type="{http://impl.take_delivery.service.bos.yapengren.com/}fixedArea" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyWords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="single" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="startNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subArea", propOrder = {
    "area",
    "assistKeyWords",
    "endNum",
    "fixedArea",
    "id",
    "keyWords",
    "single",
    "startNum"
})
public class SubArea {

    protected Area area;
    protected String assistKeyWords;
    protected String endNum;
    protected FixedArea fixedArea;
    protected String id;
    protected String keyWords;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer single;
    protected String startNum;

    /**
     * 获取area属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getArea() {
        return area;
    }

    /**
     * 设置area属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setArea(Area value) {
        this.area = value;
    }

    /**
     * 获取assistKeyWords属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistKeyWords() {
        return assistKeyWords;
    }

    /**
     * 设置assistKeyWords属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistKeyWords(String value) {
        this.assistKeyWords = value;
    }

    /**
     * 获取endNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndNum() {
        return endNum;
    }

    /**
     * 设置endNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndNum(String value) {
        this.endNum = value;
    }

    /**
     * 获取fixedArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FixedArea }
     *     
     */
    public FixedArea getFixedArea() {
        return fixedArea;
    }

    /**
     * 设置fixedArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FixedArea }
     *     
     */
    public void setFixedArea(FixedArea value) {
        this.fixedArea = value;
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
     * 获取keyWords属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyWords() {
        return keyWords;
    }

    /**
     * 设置keyWords属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyWords(String value) {
        this.keyWords = value;
    }

    /**
     * 获取single属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSingle() {
        return single;
    }

    /**
     * 设置single属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSingle(Integer value) {
        this.single = value;
    }

    /**
     * 获取startNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartNum() {
        return startNum;
    }

    /**
     * 设置startNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartNum(String value) {
        this.startNum = value;
    }

}
