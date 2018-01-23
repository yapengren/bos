package com.yapengren.bos.domain.system;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @description:角色
 */
@Entity
@Table(name = "T_ROLE")
public class Role implements Serializable{
	@Id
	@GeneratedValue
	@Column(name = "C_ID")
	private Integer id;
	@Column(name = "C_NAME")
	private String name; // 角色名称
	@Column(name = "C_KEYWORD")
	private String keyword; // 角色关键字，用于权限控制
	@Column(name = "C_DESCRIPTION")
	private String description; // 描述

	@ManyToMany(mappedBy = "roles")
	private Set<User> users = new HashSet<User>(0);

	@ManyToMany
	@JoinTable(name = "T_ROLE_PERMISSION", joinColumns = {
			@JoinColumn(name = "C_ROLE_ID", referencedColumnName = "C_ID") }, inverseJoinColumns = {
					@JoinColumn(name = "C_PERMISSION_ID", referencedColumnName = "C_ID") })
	private Set<Permission> permissions = new HashSet<Permission>(0);

	@ManyToMany
	@JoinTable(name = "T_ROLE_MENU", joinColumns = {
			@JoinColumn(name = "C_ROLE_ID", referencedColumnName = "C_ID") }, inverseJoinColumns = {
					@JoinColumn(name = "C_MENU_ID", referencedColumnName = "C_ID") })
	private Set<Menu> menus = new HashSet<Menu>(0);

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	public Set<Menu> getMenus() {
		return menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}

}
