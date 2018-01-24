package com.yapengren.bos.domain.system;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @description:后台用户
 */
@Entity
@Table(name = "T_USER")
public class  User implements Serializable{

	@Id
	@GeneratedValue
	@Column(name = "C_ID")
	private Integer id; // 主键
	@Column(name = "C_BIRTHDAY")
	private Date birthday; // 生日
	@Column(name = "C_GENDER")
	private String gender; // 性别
	@Column(name = "C_PASSWORD")
	private String password; // 密码
	@Column(name = "C_REMARK")
	private String remark; // 备注
	@Column(name = "C_STATION")
	private String station; // 状态
	@Column(name = "C_TELEPHONE")
	private String telephone; // 联系电话
	@Column(name = "C_USERNAME", unique = true)
	private String username; // 登陆用户名
	@Column(name = "C_NICKNAME")
	private String nickname; // 真实姓名

	@ManyToMany
	@JoinTable(name = "T_USER_ROLE", joinColumns = {
			@JoinColumn(name = "C_USER_ID", referencedColumnName = "C_ID") }, inverseJoinColumns = {
					@JoinColumn(name = "C_ROLE_ID", referencedColumnName = "C_ID") })
	private Set<Role> roles = new HashSet<Role>(0);
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
