package com.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.jpa.CustVO;

@Repository
public interface CustomerDAO extends JpaRepository<CustVO, String>{

}
