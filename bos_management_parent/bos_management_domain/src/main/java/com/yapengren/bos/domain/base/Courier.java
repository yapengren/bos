package com.yapengren.bos.domain.base;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @description:快递员
 */
@Entity
@Table(name = "T_COURIER")
public class Courier {

	@Id
	@GeneratedValue
	@Column(name = "C_ID")
	private Integer id; // 主键
	@Column(name = "C_COURIER_NUM", unique = true)
	private String courierNum; // 快递员工号
	@Column(name = "C_NAME")
	private String name; // 快递员姓名
	@Column(name = "C_TELEPHONE")
	private String telephone; // 快递员联系电话
	@Column(name = "C_PDA")
	private String pda; // PDA号
	@Column(name = "C_DELTAG")
	private Character deltag; // 作废标志 1 为标记作废
	@Column(name = "C_CHECK_PWD")
	private String checkPwd; // 查台密码
	@Column(name = "C_TYPE")
	private String type; // 取件员类型
	@Column(name = "C_COMPANY")
	private String company; // 单位
	@Column(name = "C_VEHICLE_TYPE")
	private String vehicleType; // 车辆类型
	@Column(name = "C_VEHICLE_NUM")
	private String vehicleNum; // 车牌号

	@ManyToOne
	@JoinColumn(name = "C_STANDARD_ID")
	private Standard standard;

	@ManyToOne
	@JoinColumn(name = "C_TAKETIME_ID")
	private TakeTime takeTime;

	@ManyToMany(mappedBy = "couriers")
	private Set<FixedArea> fixedAreas = new HashSet<FixedArea>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourierNum() {
		return courierNum;
	}

	public void setCourierNum(String courierNum) {
		this.courierNum = courierNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Character getDeltag() {
		return deltag;
	}

	public void setDeltag(Character deltag) {
		this.deltag = deltag;
	}

	public String getCheckPwd() {
		return checkPwd;
	}

	public void setCheckPwd(String checkPwd) {
		this.checkPwd = checkPwd;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public Set<FixedArea> getFixedAreas() {
		return fixedAreas;
	}

	public void setFixedAreas(Set<FixedArea> fixedAreas) {
		this.fixedAreas = fixedAreas;
	}

	public TakeTime getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(TakeTime takeTime) {
		this.takeTime = takeTime;
	}

	public String getPda() {
		return pda;
	}

	public void setPda(String pda) {
		this.pda = pda;
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}
}
