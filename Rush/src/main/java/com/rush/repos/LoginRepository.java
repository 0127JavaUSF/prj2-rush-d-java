package com.rush.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rush.model.Customer;


@Repository
public interface LoginRepository extends JpaRepository<Customer, Long> {
	

 
    @Query("SELECT a FROM Customer a WHERE username = :userName AND password = :password")
    Customer findByUsernameAndPassword(@Param("userName") String userName, @Param("password") String password);
}