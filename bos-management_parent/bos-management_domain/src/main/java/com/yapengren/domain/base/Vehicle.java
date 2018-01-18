package com.yapengren.domain.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description:车辆
 */
@Entity
@Table(name = "T_VEHICLE")
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name = "C_ID")
	private Integer id;
	@Column(name = "C_ROUTE_TYPE")
	private String routeType; // 线路类型
	@Column(name = "C_ROUTE_NAME")
	private String routeName; // 线路名称
	@Column(name = "C_SNIPPER")
	private String shipper; // 承运商
	@Column(name = "C_DRIVER")
	private String driver; // 司机
	@Column(name = "C_VEHICLE_NUM")
	private String vehicleNum; // 车牌号
	@Column(name = "C_TELEPHONE")
	private String telephone; // 电话
	@Column(name = "C_VEHICLE_TYPE")
	private String vehicleType;// 车型
	@Column(name = "C_TON")
	private Integer ton; // 吨控
	@Column(name = "C_REMARK")
	private String remark;// 备注

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRouteType() {
		return routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getTon() {
		return ton;
	}

	public void setTon(Integer ton) {
		this.ton = ton;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
