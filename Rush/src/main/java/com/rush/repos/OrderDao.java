package com.rush.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rush.model.Order;

@Repository
public interface OrderDao extends JpaRepository <Order, Long>{

}
