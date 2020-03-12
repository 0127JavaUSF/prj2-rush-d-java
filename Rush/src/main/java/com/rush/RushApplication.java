package com.rush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

@SpringBootApplication(scanBasePackages = {"com.rush.controller", "com.rush.model", "com.rush.repos", "com.rush.service","com.rush.utils"})
public class RushApplication {

	public static void main(String[] args) {
		SpringApplication.run(RushApplication.class, args);

	}
	


}
