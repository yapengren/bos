package com.yapengren.bos.domain.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @description:子档案类，记录了档案分级后的子信息
 */
@Entity
@Table(name = "T_SUB_ARCHIVE")
public class SubArchive {
	@Id
	@GeneratedValue
	@Column(name = "C_ID")
	private Integer id; // 主键
	@Column(name = "C_SUB_ARCHIVE_NAME")
	private String subArchiveName; // 子档名称
	@Column(name = "C_MNEMONIC_CODE")
	private String mnemonicCode; // 助记码
	@Column(name = "C_REMARK")
	private String remark; // 备注
	@Column(name = "C_MOTHBALLED")
	private Character mothballed; // 封存标志
	@Column(name = "C_OPERATING_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date operatingTime;// 操作时间
	@Column(name = "C_OPERATOR")
	private String operator; // 操作员
	@Column(name = "C_OPERATING_COMPANY")
	private String operatingCompany; // 操作单位

	@ManyToOne
	@JoinColumn(name = "C_ARCHIVE_ID")
	private Archive archive; // 关联基本档案信息

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubArchiveName() {
		return subArchiveName;
	}

	public void setSubArchiveName(String subArchiveName) {
		this.subArchiveName = subArchiveName;
	}

	public String getMnemonicCode() {
		return mnemonicCode;
	}

	public void setMnemonicCode(String mnemonicCode) {
		this.mnemonicCode = mnemonicCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Archive getArchive() {
		return archive;
	}

	public void setArchive(Archive archive) {
		this.archive = archive;
	}

	public String getOperatingCompany() {
		return operatingCompany;
	}

	public void setOperatingCompany(String operatingCompany) {
		this.operatingCompany = operatingCompany;
	}

	public Character getMothballed() {
		return mothballed;
	}

	public void setMothballed(Character mothballed) {
		this.mothballed = mothballed;
	}

}
