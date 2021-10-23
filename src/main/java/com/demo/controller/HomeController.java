package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.CustRequest;
import com.demo.bean.Test;
import com.demo.jpa.CustVO;
import com.demo.service.Servicetest;


@RestController
@RequestMapping("/cust")
public class HomeController {
	
	@Autowired
	private Servicetest servicetest;
	
	
	@GetMapping("/select")
	public List<CustVO> selectAll() {
		return servicetest.select();
	}
	@PostMapping("/insert")
	public CustVO insertCust(@RequestBody CustRequest custRequest) {
		return servicetest.update(custRequest);
	}
	@DeleteMapping("/delete")
	public void deleteCust(@RequestParam String custid) {
		servicetest.delete(custid);
	}
	

}
