package com.project.helpinghands.ngo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.helpinghands.entity.Donor;
import com.project.helpinghands.entity.Ngo;
import com.project.helpinghands.services.DonorService;
import com.project.helpinghands.services.LoginServices;
import com.project.helpinghands.services.NgoService;

@RestController
@RequestMapping("/api")
public class DonorController {
	
	
	@Autowired
	  DonorService response;
	
	@Autowired
	 LoginServices loginService;
	  @PostMapping("/newdonor")
	  public boolean insertNewCategory(@RequestBody Donor entity)
	  {
	  	
	  return response.addNewDonor(entity);
	  }
	  
	  
	  @GetMapping("/getDonorById")
	  public Donor getCategoryById(@RequestParam(name="id") int id) {
			return response.getDonorById(id);
		}
	  
	  @GetMapping("/getDonorById/{id}")
	  public Donor getCategoryById1(@PathVariable(name="id") int id) {
			return response.getDonorById(id);
		}
	  
	  
	  @GetMapping("/getAllDonor")
	  
	  public List<Donor> getAllNgo()
	  {
		  return response.getAllDonor();
	  }
	  
	  @PostMapping("/donorauthenticate")
	  public boolean donorValidation(@RequestBody Donor entity) {
	  	return loginService.donorValidation(entity);
	  }
	  
	  @PutMapping("/updateDonor")
	  public boolean updateDonor(@RequestBody Donor entity)
	  {
	  	
	  return response.donorUpdate(entity);
	  }
	  

}
