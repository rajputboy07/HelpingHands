package com.project.helpinghands.ngo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.helpinghands.entity.Donor;
import com.project.helpinghands.entity.Medicine;
import com.project.helpinghands.services.MedicineService;


@RestController
@RequestMapping("/medicine")
public class MedicineController {
	
	 @Autowired
	  MedicineService response;
	 
	  @PostMapping("/newMedicine")
	  public boolean insertNewMedicine(@RequestBody Medicine entity)
	  {
	  	
	  return response.insertion(entity);
	  }
	  
	  
	  @GetMapping("/getMedicineById")
	  public List<Medicine>getCategoryById(@RequestParam(name="id") int id) {
		  
		  List<Medicine> med=response.getAllMedsById(id);
			return med;
		}
	  
	 
	  
	  @GetMapping("/getAllMedicine")
	    public List<Medicine> getAllMed()
	  {
		  return response.getAllMeds();
	  }
 
	  
	 

}
