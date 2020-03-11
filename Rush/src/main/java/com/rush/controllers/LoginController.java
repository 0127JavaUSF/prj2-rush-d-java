package com.rush.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.rush.model.Customer;
import com.rush.model.LoginForm;
import com.rush.service.LoginService;
import com.rush.utils.JWTAuthService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;
	@Autowired
	private JWTAuthService jwtService;
	
	//checks if user has active session from angular ngOnit of login component performing httpClient request
	
	@GetMapping(value = "/session", produces = "application/json")
	public ResponseEntity sessionProcess(@CookieValue(value = "JWT", defaultValue="inactive") String jwt) {
		System.out.println("\n\n\n The token is here!(maybe): " + jwt + "\n\n\n");
		if (jwt.contentEquals("inactive")) {
			return ResponseEntity
					.status(401)
					.body("User is not authenticated");
		}
		else {
			//verify that we signed the 'JWT'cookie token, and that it wasn't altered
			
			if(jwtService.verifyToken(jwt)) {
				try {
	
				    DecodedJWT decodedJwt = JWT.decode(jwt);
				    
				    Claim claim = decodedJwt.getClaim("custId");
				    Long jsonClaim = claim.asLong();
				    Map<String, Long> claimAndValue = new HashMap<String, Long>();
				    claimAndValue.put("custId", jsonClaim);
				    System.out.println("\n\n\nwhat the hell is the value of this claim, and why you no work?" + claimAndValue + "\n\n\n");
				    return ResponseEntity
							.status(200)
							.body(claimAndValue);//return the payload for client to utilize the userId for the session
				} catch (JWTDecodeException exception){
				    //Invalid token
				}
				
			}
			//their ip should be banned for their insolence, they altered the token or otherwise tried to add a token
			//because of their lack of faith in our authentication integrity
			return ResponseEntity
					.status(404)
					.body("You're a savage");
			
			// return user client Id from token back for use
			

			
		}

	}
	
	
	//call service to generate and return a token as well as authenticate the user
	@PostMapping(value = "/login", consumes = "application/json", produces = "application/json")
	public ResponseEntity loginProcess(@RequestBody @Valid LoginForm loginForm, HttpServletResponse response) {
		  
		
		//User sent token
		/*add jwt logic here
		   * if jwt authenticated, return user details
		   * else...(below)
		   */
		
		Customer customer = loginService.validateUser(loginForm);
		//User sent credentials
		try {
	    	if (!customer.equals(null)){
	    		//generate token to return to the user, s.t. the ngOninit from angular side login page 
	    		//will automatically send a request with that token from now on
	    		String token = jwtService.generateToken(customer.getCustId());
	    		Cookie cookie = new Cookie("JWT", token);
	    		response.addCookie(cookie);
	    		return ResponseEntity
	    				.status(201)
	    				.body("Token has been set");//TODO return userID for client-side use
	    	}

		}
    	catch(NullPointerException e) {
    	
    		//invalid login, will return below
    	}
		return ResponseEntity.status(401).body("Invalid username/password");
	 }

		

	  
	
	
	public LoginController(LoginService loginService, JWTAuthService jwtService) {
		super();
		this.loginService = loginService;
		this.jwtService = jwtService;
	}
	
}




