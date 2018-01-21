
package com.yapengren.bos.service.take_delivery.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>wayBill complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="wayBill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actlweit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="arriveCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeitemnum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="floadreqr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="order" type="{http://impl.take_delivery.service.bos.yapengren.com/}order" minOccurs="0"/>
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
 *         &lt;element name="sendName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendProNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wayBillNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wayBillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wayBill", propOrder = {
    "actlweit",
    "arriveCity",
    "delTag",
    "feeitemnum",
    "floadreqr",
    "goodsType",
    "id",
    "num",
    "order",
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
    "sendName",
    "sendProNum",
    "signStatus",
    "vol",
    "wayBillNum",
    "wayBillType",
    "weight"
})
public class WayBill {

    protected Double actlweit;
    protected String arriveCity;
    protected String delTag;
    protected Integer feeitemnum;
    protected String floadreqr;
    protected String goodsType;
    protected Integer id;
    protected Integer num;
    protected Order order;
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
    protected String sendName;
    protected String sendProNum;
    protected Integer signStatus;
    protected String vol;
    protected String wayBillNum;
    protected String wayBillType;
    protected Double weight;

    /**
     * 获取actlweit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActlweit() {
        return actlweit;
    }

    /**
     * 设置actlweit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActlweit(Double value) {
        this.actlweit = value;
    }

    /**
     * 获取arriveCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveCity() {
        return arriveCity;
    }

    /**
     * 设置arriveCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveCity(String value) {
        this.arriveCity = value;
    }

    /**
     * 获取delTag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelTag() {
        return delTag;
    }

    /**
     * 设置delTag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelTag(String value) {
        this.delTag = value;
    }

    /**
     * 获取feeitemnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeeitemnum() {
        return feeitemnum;
    }

    /**
     * 设置feeitemnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeeitemnum(Integer value) {
        this.feeitemnum = value;
    }

    /**
     * 获取floadreqr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloadreqr() {
        return floadreqr;
    }

    /**
     * 设置floadreqr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloadreqr(String value) {
        this.floadreqr = value;
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
     * 获取num属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置num属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum(Integer value) {
        this.num = value;
    }

    /**
     * 获取order属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * 设置order属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
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
     * 获取signStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignStatus() {
        return signStatus;
    }

    /**
     * 设置signStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignStatus(Integer value) {
        this.signStatus = value;
    }

    /**
     * 获取vol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVol() {
        return vol;
    }

    /**
     * 设置vol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVol(String value) {
        this.vol = value;
    }

    /**
     * 获取wayBillNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWayBillNum() {
        return wayBillNum;
    }

    /**
     * 设置wayBillNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWayBillNum(String value) {
        this.wayBillNum = value;
    }

    /**
     * 获取wayBillType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWayBillType() {
        return wayBillType;
    }

    /**
     * 设置wayBillType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWayBillType(String value) {
        this.wayBillType = value;
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

}
