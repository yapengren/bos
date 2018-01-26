package com.yapengren.bos.web.action.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import com.yapengren.bos.domain.base.Area;
import com.yapengren.bos.service.base.AreaService;
import com.yapengren.bos.utils.PinYin4jUtils;
import com.yapengren.bos.utils.action.BaseAction;

//返回结果
@Results({@Result(name="toList", type="redirect", location="/pages/base/area.html")})
public class AreaAction extends BaseAction<Area> {
	
	@Autowired
	private AreaService as;
	
	//接收名为 xls 的上传文件
	private File xls;

	//接收文件本来的文件名
	private String xlsFileName;
	
	//接收下拉选项框提示参数
	private String q;
	
	/**
	 * @throws IOException 
	 * @Title: upload
	 * @Description: TODO 导入区域数据
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("AreaAction_upload")
	public String upload() throws IOException {
		
		//测试输出
		System.out.println("测试_AreaAction.java_接收文件" + xls);
		System.out.println("测试_AreaAction.java_接收文件本来的文件名" + xlsFileName);
		
		//创建list
		List<Area> list = new ArrayList<>();
		
		//解析excel
		//创建文件输入字节流
		FileInputStream inputStream = new FileInputStream(xls);
		
		//读取xls 文件，获得文档对象
		HSSFWorkbook wb = new HSSFWorkbook(inputStream);
		
		//从文档中获得表格对象
		HSSFSheet sheet = wb.getSheetAt(0);
		
		//获得每一个数据行以及其中的内容
		//获得最后一行的行号
		int lastRowNum = sheet.getLastRowNum();
		
		//遍历获得每行内容
		for (int i = 1; i < lastRowNum; i++) {
			//创建封装数据的area 对象
			//取出每个区域属性，封装为Area 对象
			Area area = new Area();
			
			//获得当前遍历的数据行
			HSSFRow row = sheet.getRow(i);
			
			//取出单元格内容放入area 对象    get the value of the cell as a string
			area.setId(row.getCell(0).getStringCellValue());
			area.setProvince(row.getCell(1).getStringCellValue());
			area.setCity(row.getCell(2).getStringCellValue());
			area.setDistrict(row.getCell(3).getStringCellValue());
			area.setPostcode(row.getCell(4).getStringCellValue());
			
			//将省 | 市 | 区 名称的最后一个字删除
				//substring(开始索引<包括>, 结束索引<不包括>)
			String province = area.getProvince().substring(0, area.getProvince().length() - 1);
			String city = area.getCity().substring(0, area.getCity().length() - 1);
			String district = area.getDistrict().substring(0, area.getDistrict().length() - 1);
			
			//生成全拼，放入area 对象
			area.setCitycode(PinYin4jUtils.hanziToPinyin(city, ""));
			
			//生成首字母
			String shortCode = StringUtils.join(PinYin4jUtils.getHeadByString(province + city + district), "");
			
			//将生成的首字母，放入area 对象
			area.setShortcode(shortCode);
			
			//将area 添加到集合中
			list.add(area);
		}
		
		//调用service 保存list
		as.saveAll(list);
		return null;
	}
	
	/**
	 * @throws IOException   
	 * @Title: pageList  
	 * @Description: TODO 区域分页查询
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("AreaAction_pageList")
	public String pageList() throws IOException {
		//调用Service查询PageBean
		Page<Area> pageBean = as.findPageBean(page, rows);
		
		/*
		//将pageBean 转换为json
		Map pageMap = new HashMap();
		pageMap.put("total", pageBean.getTotalElements());
		pageMap.put("rows", pageBean.getContent());
		
		String json = JSON.toJSONString(pageMap);
		
		//将json 发送到浏览器
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().write(json);
		*/
		
		page2Client(pageBean, "subareas");
		return null;
	}
	
	/**  
	 * @Title: findAll  
	 * @Description: TODO 区域查询所有
	 * @param @return
	 * @return String
	 * @throws  
	 */  
	@Action("AreaAction_findAll")
	public String findAll() {
		
		List<Area> list = null;
		
		if (StringUtils.isNotBlank(q)) {
			//条件查询
			list = as.findByCondition(q);
		} else {
			//查询所有
			list = as.findPageBean(1, Integer.MAX_VALUE).getContent();
		}
		
		list2Client(list, "subareas");
		return null;
	}

	public File getXls() {
		return xls;
	}

	public void setXls(File xls) {
		this.xls = xls;
	}

	public String getXlsFileName() {
		return xlsFileName;
	}

	public void setXlsFileName(String xlsFileName) {
		this.xlsFileName = xlsFileName;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

}
