package com.yapengren.bos.web.action.base;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import com.yapengren.bos.domain.base.FixedArea;
import com.yapengren.bos.service.base.FixedAreaService;
import com.yapengren.bos.utils.action.BaseAction;

//返回结果
@Results({@Result(name="toList", type="redirect", location="/pages/base/fixed_area.html")})
public class FixedAreaAction extends BaseAction<FixedArea> {
	
	@Autowired
	private FixedAreaService fas;
	
	//
	private Integer courierId;
	
	//
	private Integer takeTimeId;
	
	/**  
	 * @Title: add  
	 * @Description: TODO 添加定区
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("FixedAreaAction_add")
	public String add() {
		fas.save(model);
		return "toList";
	}
	
	/**  
	 * @Title: pageList  
	 * @Description: TODO 定区分页查询
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("FixedAreaAction_pageList")
	public String pageList() {
		Page<FixedArea> pageBean = fas.findPage(page, rows);
		
		page2Client(pageBean, "subareas", "couriers");
		
		return null;
	}
	
	/**  
	 * @Title: linkCourier  
	 * @Description: TODO 定区关联快递员&收派时间
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("FixedAreaAction_linkCourier")
	public String linkCourier() {
		//调用service 查询pageBean
		fas.linkCourier(model.getId(), courierId, takeTimeId);
		
		return null;
	}

	public Integer getCourierId() {
		return courierId;
	}

	public void setCourierId(Integer courierId) {
		this.courierId = courierId;
	}

	public Integer getTakeTimeId() {
		return takeTimeId;
	}

	public void setTakeTimeId(Integer takeTimeId) {
		this.takeTimeId = takeTimeId;
	}
	
}
