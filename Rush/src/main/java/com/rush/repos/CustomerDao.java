package com.rush.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rush.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository <Customer, Long>{

		
}
