package com.yapengren.crm.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @description:客户信息表 
 * 
 */
@Entity
@Table(name = "T_CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "C_ID")
	private Integer id; // 主键id
	@Column(name = "C_USERNAME")
	private String username; // 用户名
	@Column(name = "C_PASSWORD")
	private String password; // 密码
	@Column(name = "C_TYPE")
	private Integer type; // 类型
	@Column(name = "C_BRITHDAY")
	@Temporal(TemporalType.DATE)
	private Date birthday; // 生日
	@Column(name = "C_SEX")
	private Integer sex; // 性别
	@Column(name = "C_TELEPHONE")
	private String telephone; // 手机
	@Column(name = "C_COMPANY")
	private String company; // 公司
	@Column(name = "C_DEPARTMENT")
	private String department; // 部门
	@Column(name = "C_POSITION")
	private String position; // 职位
	@Column(name = "C_ADDRESS")
	private String address; // 地址
	@Column(name = "C_MOBILEPHONE")
	private String mobilePhone; // 座机
	@Column(name = "C_EMAIL")
	private String email; // 邮箱
	@Column(name = "C_Fixed_AREA_ID")
	private String fixedAreaId; // 定区编号
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFixedAreaId() {
		return fixedAreaId;
	}
	public void setFixedAreaId(String fixedAreaId) {
		this.fixedAreaId = fixedAreaId;
	}

}