package com.rush.utils;

import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

public class CustomerJWTUtil {
	public static Long getCustIdOrNull(String jwtValue) {//returns the value of the claim, null or the value of the custId

		if(!JWTAuthService.verifyToken(jwtValue)) {
			System.out.println("\n\n\n hits after verify token evaluated to false \n\n\n");
			return null;
		}
	    DecodedJWT decodedJwt = JWT.decode(jwtValue);
	    
	    Claim claim = decodedJwt.getClaim("custId");

	    Long custId = claim.asLong();
		  //DO NOT DELETE UNTIL WE DETERMINE IF WE NEED customer id/other details of the customer =) in angular
//	    Map<String, Long> claimAndValue = new HashMap<String, Long>();
//	    claimAndValue.put("custId", custId);

	    return custId;

	}
}
