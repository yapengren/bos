package com.yapengren.crm.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yapengren.crm.dao.CustomerDao;
import com.yapengren.crm.domain.Customer;
import com.yapengren.crm.service.CustomerService;

@Service("customerService")    //注册bean
@Transactional    //事务
@WebService    //声明为ws 服务
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao cd;
	
	/**  
	 * @Title: getUnLinkedCustomers  
	 * @Description: TODO 获得未与任何区域关联的客户
	 * @param @return
	 * @return List<Customer>
	 * @throws  
	 */  
	@Override
	public List<Customer> getUnLinkedCustomers() {
		return cd.findByFixedAreaIdIsNull();
	}
	
	/**  
	 * @Title: getLinkedCustomers  
	 * @Description: TODO 与指定定区关联的客户
	 * @param @param fixedAreaId
	 * @param @return
	 * @return List<Customer>
	 * @throws  
	 */  
	@Override
	public List<Customer> getLinkedCustomers(String fixedAreaId) {
		return cd.findByFixedAreaId(fixedAreaId);
	}
	
	/**  
	 * @Title: fixedAreaLinkCustomers  
	 * @Description: TODO 关联指定定区与指定客户
	 * @param @param fixedAreaId
	 * @param @param custIds
	 * @return void
	 * @throws  
	 */  
	@Override
	public void fixedAreaLinkCustomers(String fixedAreaId, Integer[] custIds) {
		//移除定区关联的所有客户
		cd.removeFixedAreaId(fixedAreaId);
		
		//重新添加关联
		if (custIds != null && custIds.length > 0) {
			for (Integer custId : custIds) {
				cd.linkFixedAreaId(fixedAreaId, custId);
			}
		}
	}
	
	/* 
	 * Title: findByTelephone 
	 * Description: 根据手机号查询客户
	 * @param telephone
	 * @return  
	 * @see com.yapengren.crm.service.CustomerService#findByTelephone(java.lang.String)  
	 */  
	@Override
	public Customer findByTelephone(String telephone) {
		return cd.findByTelephone(telephone);
	}
	
	/* 
	 * Title: findByEmail 
	 * Description: 根据邮箱查询客户
	 * @param email
	 * @return  
	 * @see com.yapengren.crm.service.CustomerService#findByEmail(java.lang.String)  
	 */  
	@Override
	public Customer findByEmail(String email) {
		return cd.findByEmail(email);
	}
	
}
