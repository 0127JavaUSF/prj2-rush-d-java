package com.rush.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.rush.exception.ValidateSessionException;
import com.rush.model.Customer;
import com.rush.model.LoginForm;
import com.rush.service.LoginService;
import com.rush.utils.CustomerJWTUtil;
import com.rush.utils.JWTAuthService;
import com.rush.utils.PasswordUtil;


@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class LoginController {
	
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private PasswordUtil passwordUtil;
	@Autowired
	private LoginService loginService;
	@Autowired
	private JWTAuthService jwtService;
	
	//checks if user has active session from angular ngOnit of login component performing httpClient request
	
	@GetMapping(value = "/session", produces = "application/json")//used for NgOninit to auto-redirect a user if they're already logged in
	public ResponseEntity sessionProcess(@CookieValue(value = "JWT", defaultValue="noCookie") String jwt){
		try {
			if (!(CustomerJWTUtil.getCustIdOrNull(jwt).equals(null))) {
				Map<String, String> responsebody = new HashMap();
				responsebody.put("Session", "User has active session");
				logger.info("Session Initialization Successful");

				responsebody.put("response", "User has active session");

				return ResponseEntity
						.status(200)
						.body(responsebody);
				
			}
		}
		catch(NullPointerException e) {
			logger.error("Fail Seesion Initialization");	
		}
	    return ResponseEntity
				.status(401)
				.body("JWT token value invalid");//return the payload for client to utilize the userId for the session

	}

	
	
	
	//call service to generate and return a token as well as authenticate the user
	@PostMapping(value = "/login", consumes = "application/json", produces = "application/json")
	public ResponseEntity loginProcess(@RequestBody @Valid LoginForm loginForm, HttpServletResponse response) {
		
		//User sent token
		/*add jwt logic here
		   * if jwt authenticated, return user details
		   * else...(below)
		   */
		String salt = "rushdessert";
		loginForm.setPassword(passwordUtil.generateSecurePassword(loginForm.getPassword(), salt));
		Customer customer = loginService.validateUser(loginForm);
		//User sent credentials
		try {
	    	if (!customer.equals(null)){
	    		//generate token to return to the user, s.t. the ngOninit from angular side login page 
	    		//will automatically send a request with that token from now on
	    		String token = JWTAuthService.generateToken(customer.getCustId());
	    		Cookie cookie = new Cookie("JWT", token);
	    		response.addCookie(cookie);
	    		Map<String, String> responsebody = new HashMap();

	    		responsebody.put("response", "User has been verified");
				logger.info("Customer Logged In Successful");


	    		return ResponseEntity
	    				.status(201)
	    				.body(responsebody);//TODO return userID for client-side use
	    	}

		}
    	catch(NullPointerException e) {
    		logger.error("Fail Customer Login");
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




