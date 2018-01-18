package com.yapengren.bos.domain.base;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @description:地域信息实体类，主要包含 省市区(县)
 */
@Entity
@Table(name = "T_AREA")
public class Area {

	@Id
	@Column(name = "C_ID")
	private String id;
	@Column(name = "C_PROVINCE")
	private String province; // 省
	@Column(name = "C_CITY")
	private String city; // 城市
	@Column(name = "C_DISTRICT")
	private String district; // 区域
	@Column(name = "C_POSTCODE")
	private String postcode; // 邮编
	@Column(name = "C_CITYCODE")
	private String citycode; // 城市编码
	@Column(name = "C_SHORTCODE")
	private String shortcode; // 简码

	@OneToMany(mappedBy = "area")
	private Set<SubArea> subareas = new HashSet<SubArea>();
	
	public String getName() {
		return province + city + district;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getShortcode() {
		return shortcode;
	}

	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}

	public Set<SubArea> getSubareas() {
		return subareas;
	}

	public void setSubareas(Set<SubArea> subareas) {
		this.subareas = subareas;
	}

	@Override
	public String toString() {
		return "Area [id=" + id + ", province=" + province + ", city=" + city
				+ ", district=" + district + ", postcode=" + postcode
				+ ", citycode=" + citycode + ", shortcode=" + shortcode + "]";
	}

}
