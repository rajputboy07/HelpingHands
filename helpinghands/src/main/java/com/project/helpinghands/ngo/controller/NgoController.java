package com.project.helpinghands.ngo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.helpinghands.entity.Medicine;
import com.project.helpinghands.entity.Ngo;
import com.project.helpinghands.services.LoginServices;
import com.project.helpinghands.services.NgoService;

@RestController
@RequestMapping("/api")
public class NgoController {

	
	 @Autowired
	  NgoService response;
	 
	 @Autowired
	 LoginServices loginService;
	 
	  @PostMapping("/newngo")
	  public boolean insertNewCategory(@RequestBody Ngo entity)
	  {
	  	
	  return response.addNewNgo(entity);
	  }
	  
	  
	  @GetMapping("/getNgoById")
	  public Ngo getCategoryById(@RequestParam(name="username") String userName) {
			return response.getNgoByUserName(userName);
		}
	   
	  
	  @GetMapping("/getAllNgo")
	  
	  public List<Ngo> getAllNgo()
	  {
		  return response.getAllNgo();
	  }
	  
	  @PostMapping("/ngoauthenticate")
		public boolean ngoValidation(@RequestBody Ngo entity) 
	  {
			return loginService.ngoValidation(entity);
	  }
	  
	  @PutMapping("/updateNgo")
	  public boolean updateNgo(@RequestBody Ngo entity)
	  {
	  	
	  return response.ngoUpdate(entity);
	  }
	  
	  
}
