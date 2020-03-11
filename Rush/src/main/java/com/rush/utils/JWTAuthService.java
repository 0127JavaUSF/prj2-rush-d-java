package com.rush.utils;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

@Service
public class JWTAuthService {
	
	
	public String generateToken(Long custId){
		String token = null;
		try {
		    Algorithm algorithm = Algorithm.HMAC256("secret");
		    token = JWT.create()
		        .withIssuer("auth0")
		        .withClaim("custId", custId)
		        .sign(algorithm);
		    return token;
		} catch (JWTCreationException exception){
			exception.printStackTrace();
			return token;
		    //Invalid Signing configuration / Couldn't convert Claims.
		}
		
	}
	public boolean verifyToken(String token) {
		String thetoken = token;
		try {
		    Algorithm algorithm = Algorithm.HMAC256("secret");
		    JWTVerifier verifier = JWT.require(algorithm)
		        .withIssuer("auth0")
		        .build(); //Reusable verifier instance
		    DecodedJWT jwt = verifier.verify(thetoken);
		    return true;
		} catch (JWTVerificationException exception){
			System.out.println("token verification failed");
			return false;
		    //Invalid signature/claims
		}
		
	}
	

}
