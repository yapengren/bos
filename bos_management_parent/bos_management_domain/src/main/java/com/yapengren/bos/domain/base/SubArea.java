package com.yapengren.bos.domain.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @description:分区
 */
@Entity
@Table(name = "T_SUB_AREA")
public class SubArea {

	@Id
	@Column(name = "C_ID")
	private String id;
	@Column(name = "C_START_NUM")
	private String startNum; // 起始号
	@Column(name = "C_ENDNUM")
	private String endNum; // 终止号
	@Column(name = "C_SINGLE")
	private Character single; // 单双号
	@Column(name = "C_KEY_WORDS")
	private String keyWords; // 关键字
	@Column(name = "C_ASSIST_KEY_WORDS")
	private String assistKeyWords; // 辅助关键字

	@ManyToOne
	@JoinColumn(name = "C_AREA_ID")
	private Area area; // 区域
	@ManyToOne
	@JoinColumn(name = "C_FIXEDAREA_ID")
	private FixedArea fixedArea; // 定区

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Character getSingle() {
		return single;
	}

	public void setSingle(Character single) {
		this.single = single;
	}

	public String getStartNum() {
		return startNum;
	}

	public void setStartNum(String startNum) {
		this.startNum = startNum;
	}

	public String getEndNum() {
		return endNum;
	}

	public void setEndNum(String endNum) {
		this.endNum = endNum;
	}

	public String getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public String getAssistKeyWords() {
		return assistKeyWords;
	}

	public void setAssistKeyWords(String assistKeyWords) {
		this.assistKeyWords = assistKeyWords;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public FixedArea getFixedArea() {
		return fixedArea;
	}

	public void setFixedArea(FixedArea fixedArea) {
		this.fixedArea = fixedArea;
	}

}
