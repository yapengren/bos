package com.yapengren.crm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.yapengren.crm.domain.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

	/**  
	 * @Title: findByFixedAreaIdIsNull  
	 * @Description: TODO 获得未与任何区域关联的客户
	 * @param @return
	 * @return List<Customer>
	 * @throws  
	 */  
	List<Customer> findByFixedAreaIdIsNull();

	/**  
	 * @Title: findByFixedAreaId  
	 * @Description: TODO 与指定定区关联的客户
	 * @param @param fixedAreaId
	 * @param @return
	 * @return List<Customer>
	 * @throws  
	 */  
	List<Customer> findByFixedAreaId(String fixedAreaId);

	/**  
	 * @Title: removeFixedAreaId  
	 * @Description: TODO 根据定区id 移除关系
	 * @param @param fixedAreaId
	 * @return void
	 * @throws  
	 */  
	@Modifying
	@Query("update Customer set fixedAreaId = null where fixedAreaId = ?")
	void removeFixedAreaId(String fixedAreaId);

	/**  
	 * @Title: linkFixedAreaId  
	 * @Description: TODO 关联指定定区与指定客户
	 * @param @param fixedAreaId
	 * @param @param custId
	 * @return void
	 * @throws  
	 */  
	@Modifying
	@Query("update Customer set fixedAreaId = ?1 where id = ?2 ")
	void linkFixedAreaId(String fixedAreaId, Integer custId);

	/**  
	 * @Title: findByTelephone  
	 * @Description: TODO 根据手机号查询客户
	 * @param @param telephone
	 * @param @return
	 * @return Customer
	 * @throws  
	 */  
	Customer findByTelephone(String telephone);

	/**  
	 * @Title: findByEmail  
	 * @Description: TODO 根据邮箱查询客户
	 * @param @param email
	 * @param @return
	 * @return Customer
	 * @throws  
	 */  
	Customer findByEmail(String email);

	/**  
	 * @Title: active  
	 * @Description: TODO 账号激活
	 * @param @param email
	 * @return void
	 * @throws  
	 */  
	@Modifying
	@Query("update Customer set type = 1 where email = ?")
	void active(String email);

	/**  
	 * @Title: findByEmailAndPassword  
	 * @Description: TODO 根据邮箱与密码取出客户
	 * @param @param email
	 * @param @param password
	 * @param @return
	 * @return Customer
	 * @throws  
	 */  
	Customer findByEmailAndPassword(String email, String password);

	/**  
	 * @Title: findByAddress  
	 * @Description: TODO 根据详细地址查询客户
	 * @param @param address
	 * @param @return
	 * @return Customer
	 * @throws  
	 */  
	Customer findByAddress(String address);

}
