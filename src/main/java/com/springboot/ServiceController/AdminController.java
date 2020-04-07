package com.springboot.ServiceController;

import java.util.List;

import javax.sql.DataSource;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.JsonNode;
import com.springboot.Entity.Person;
import com.springboot.Entity.Product;
import com.springboot.mapper.PersonMapper;
import com.springboot.mapper.ProductMapper;


@RestController
public class AdminController {
//	@Value("${welcome.message}")
//    private String message;
//	@Value("${blank.error.message}")
//	private String blankErrorMessage;
//	@Value("${login.error.message}")
//	private String loginErrorMessage;
	
	@Autowired PersonMapper personMapper;
	@Autowired ProductMapper productMapper;

	@Autowired
	private DataSource dataSource;
	boolean loginChecked = false;
//-------User-------		
		@GetMapping( "/getPersonList" )
	    public @ResponseBody List<Person> personListModel() {
			List<Person> personList = personMapper.selectAllPerson();
			System.out.println(personList);
			return personList;
		}

		@PostMapping("/editUser")
	    public @ResponseBody void deletePerson(@RequestBody JsonNode json) {
			String jsonUserName = json.get("userName").asText();
			String jsonPassword = json.get("password").asText();
			System.out.println(jsonUserName);	
			System.out.println(jsonPassword);		
			// Person person = new Person(jsonUserName, jsonPassword);
			personMapper.updatePerson(jsonUserName,jsonPassword);	
		}

		
		@PostMapping("/deletePerson")
	    public @ResponseBody void deletePerson(@RequestBody String json) {
			System.out.println(json);
			String userNameDelete = json.substring(0, json.length()-1);
			personMapper.deletePersonByUserName(userNameDelete);	
	
		}
		@PostMapping("/register")
	    public @ResponseBody void registerModel(@RequestBody JsonNode json)  {
			String userName = json.get("userName").asText();
			String password = json.get("password").asText();
			String email = json.get("email").asText();
			String role = "CUSTOMER";
			int active = 1;
			Person person = new Person(userName, password,email,active,role);
			personMapper.insertPerson(person);
		}

	
		// @PostMapping("/login")
		// public void login (){
		// 	System.out.println(dataSource);

		// }

		


//-------Product--------
@PostMapping("/deleteProduct")
public @ResponseBody void deleteProduct(@RequestParam long id) {
	productMapper.deleteProductById(id);	
}
		
}