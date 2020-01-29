package com.project.helpinghands.ngo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.helpinghands.entity.AllMedicine;
import com.project.helpinghands.entity.Donor;
import com.project.helpinghands.entity.Medicine;
import com.project.helpinghands.services.AllMedicineService;

@RestController
@RequestMapping("/api")
public class AllMedicineController {
	
	
	 @Autowired
	  AllMedicineService response;
	 
	  @PostMapping("/addNewMedicine")
	  public boolean insertNewCategory(@RequestBody AllMedicine entity)
	  {
	  	
	  return response.addNewMedicine(entity);
	  }
	  
	  
	  @GetMapping("/getAllMedicineById")
	  public AllMedicine getMedicineById(@RequestParam(name="id") int id) {
			return response.getMedicineById(id);
		}
	  
	  @GetMapping("/getMedicineById/{id}")
	  public AllMedicine getMedicineById1(@PathVariable(name="id") int id) {
			return response.getMedicineById(id);
		}

	  
	  @GetMapping("/getAllMedcineData")
	    public List<AllMedicine> getAllMedicine()
	  {
		  return response.getAllMedicine();
	  }
	
	
	
	

}
