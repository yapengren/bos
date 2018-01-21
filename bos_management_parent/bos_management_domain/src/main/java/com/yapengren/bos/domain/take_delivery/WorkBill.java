package com.yapengren.bos.domain.take_delivery;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.yapengren.bos.domain.base.Courier;

/**
 * @description:工单
 */
@Entity
@Table(name = "T_WORK_BILL")
public class WorkBill {
	@Id
	@GeneratedValue
	@Column(name = "C_ID")
	private Integer id; // 主键
	@Column(name = "C_TYPE")
	private String type; // 工单类型 新,追,销
	/*
	 * 新单:没有确认货物状态的 已通知:自动下单下发短信 已确认:接到短信,回复收信确认信息 已取件:已经取件成功,发回确认信息 生成工作单
	 * 已取消:销单
	 * 
	 */
	@Column(name = "C_PICKSTATE")
	private String pickstate; // 取件状态
	@Column(name = "C_BUILDTIME")
	private Date buildtime; // 工单生成时间
	@Column(name = "C_ATTACHBILLTIMES")
	private Integer attachbilltimes; // 追单次数
	@Column(name = "C_REMARK")
	private String remark; // 订单备注
	@Column(name = "C_SMSNUMBER")
	private String smsNumber; // 短信序号

	@OneToOne
	@JoinColumn(name = "C_COURIER")
	private Courier courier;// 快递员

	@ManyToOne
	@JoinColumn(name = "C_ORDER_ID")
	private Order order; // 订单

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPickstate() {
		return pickstate;
	}

	public void setPickstate(String pickstate) {
		this.pickstate = pickstate;
	}

	public Date getBuildtime() {
		return buildtime;
	}

	public void setBuildtime(Date buildtime) {
		this.buildtime = buildtime;
	}

	public Integer getAttachbilltimes() {
		return attachbilltimes;
	}

	public void setAttachbilltimes(Integer attachbilltimes) {
		this.attachbilltimes = attachbilltimes;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSmsNumber() {
		return smsNumber;
	}

	public void setSmsNumber(String smsNumber) {
		this.smsNumber = smsNumber;
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
