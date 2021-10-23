package com.demo;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.DAO.CustomerDAO;
import com.demo.jpa.CustVO;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {
	@Autowired
	private CustomerDAO customerDAO;
	
	@Test
	public void contextLoads() {
		List<CustVO> list = customerDAO.findAll();
		
		assertNotNull(list);
	}

}
