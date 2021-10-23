package com.demo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.DAO.CustomerDAO;
import com.demo.bean.CustRequest;
import com.demo.jpa.CustVO;


@Service
@Component
public class Servicetest {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	public List<CustVO> select() {
		return customerDAO.findAll();
	}
	public void delete(String custId) {
		customerDAO.deleteById(custId);
	}
	public CustVO update(CustRequest custRequest){
		CustVO cust = new CustVO();
		BeanUtils.copyProperties(custRequest, cust);
		return customerDAO.save(cust);
	}

}
