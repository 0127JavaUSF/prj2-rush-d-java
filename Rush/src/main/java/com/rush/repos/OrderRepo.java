package com.rush.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rush.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long>{

	
	@Query("SELECT o FROM Order o WHERE o.customer.custId = 4")
	List<Order> findAllCustomerOrders();
}
	