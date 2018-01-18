package com.yapengren.bos.domain.base;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @description:定区
 */
@Entity
@Table(name = "T_FIXED_AREA")
public class FixedArea {

	@Id
	@Column(name = "C_ID")
	private String id; // 主键
	@Column(name = "C_FIXED_AREA_NAME", unique = true)
	private String fixedAreaName; // 定区名称
	@Column(name = "C_FIXED_AREA_LEADER", unique = true)
	private String fixedAreaLeader;// 定区负责人
	@Column(name = "C_TELEPHONE")
	private String telephone;// 联系电话
	@Column(name = "C_COMPANY")
	private String company; // 所属单位

	@Column(name = "C_OPERATING_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date operatingTime;// 操作时间
	@Column(name = "C_OPERATOR")
	private String operator; // 操作员
	@Column(name = "C_OPERATING_COMPANY")
	private String operatingCompany; // 操作单位

	@OneToMany(mappedBy = "fixedArea")
	private Set<SubArea> subareas = new HashSet<SubArea>(0);

	@ManyToMany
	@JoinTable(name = "T_FIXEDAREA_COURIER", joinColumns = { @JoinColumn(name = "C_FIXED_AREA_ID", referencedColumnName = "C_ID") }, inverseJoinColumns = { @JoinColumn(name = "C_COURIER_ID", referencedColumnName = "C_ID") })
	private Set<Courier> couriers = new HashSet<Courier>(0);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFixedAreaName() {
		return fixedAreaName;
	}

	public void setFixedAreaName(String fixedAreaName) {
		this.fixedAreaName = fixedAreaName;
	}

	public String getFixedAreaLeader() {
		return fixedAreaLeader;
	}

	public void setFixedAreaLeader(String fixedAreaLeader) {
		this.fixedAreaLeader = fixedAreaLeader;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getOperatingTime() {
		return operatingTime;
	}

	public void setOperatingTime(Date operatingTime) {
		this.operatingTime = operatingTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Set<SubArea> getSubareas() {
		return subareas;
	}

	public void setSubareas(Set<SubArea> subareas) {
		this.subareas = subareas;
	}

	public Set<Courier> getCouriers() {
		return couriers;
	}

	public void setCouriers(Set<Courier> couriers) {
		this.couriers = couriers;
	}

	public String getOperatingCompany() {
		return operatingCompany;
	}

	public void setOperatingCompany(String operatingCompany) {
		this.operatingCompany = operatingCompany;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
