package com.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.jpa.ProductVO;


@Repository
public interface ProductDAO extends JpaRepository<ProductVO, Integer>{

	public List<ProductVO> findProductVOByCustId(int custId);
	
	@Query(value="select * from product where cust_id=:custId",nativeQuery = true)
	public List<ProductVO> selectProductVOByCustId(@Param("custId") Integer  custId);
	//HQL要寫別名
	@Query(value="select pv from ProductVO as pv where pv.custId=:custId")
	public List<ProductVO> selectProductVOByCustIdHql(@Param("custId") Integer  custId);
}
