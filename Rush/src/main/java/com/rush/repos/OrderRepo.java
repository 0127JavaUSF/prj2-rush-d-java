package com.rush.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rush.model.Order;
import com.rush.model.OrderItem;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long>{

	
	@Query("SELECT o FROM Order o WHERE o.customer.custId = 4")
	List<Order> findAllCustomerOrders();
	
	@Query("SELECT o FROM OrderItem o WHERE o.order.orderId = :id")
	List<OrderItem> findAllItemsInOrder(@Param("id") Long orderId );
}
	