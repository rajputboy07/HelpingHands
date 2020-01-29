package com.project.helpinghands.ngo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.helpinghands.entity.Donor;
import com.project.helpinghands.entity.Medicine;
import com.project.helpinghands.entity.Ngo;
import com.project.helpinghands.services.MedicineService;


@RestController
@RequestMapping("/api")
public class MedicineController {
	
	 @Autowired
	  MedicineService response;
	 
	  @PostMapping("/newMedicine")
	  public boolean insertNewMedicine(@RequestBody Medicine entity)
	  {
	  	
	  return response.insertion(entity);
	  }
	  
	
	  @PostMapping("/insertNewMedicine")
	  public boolean addNewMedicine(@RequestBody Medicine entity)
	  {
	  	
	  return response.addNewMedicine(entity);
	  }
	  
	  @GetMapping("/deleteNgoById")
	  public boolean deleteNgoById(@RequestParam(name="username") String userName) {
			return response.deleteNgo(userName);
		}
	  
	  @GetMapping("/deleteDonorById")
	  public boolean deleteDonorById(@RequestParam(name="username") String userName) {
			return response.deleteDonor(userName);
		}
	  
	  
	  @GetMapping("/getMedicineById")
	  public List<Medicine>getCategoryById(@RequestParam(name="id") int id) {
		  
		  List<Medicine> med=response.getAllMedsById(id);
			return med;
		}
	  @GetMapping("/getNgoMedicine1")
	  public List<Medicine> getNgoMedicine1(@RequestParam(name="username") String username) {
			return response.ngoMedicineAllDetails(username);
		}
	 
	 
	  
	  @GetMapping("/getAllMedicine")
	    public List<Medicine> getAllMed()
	  {
		  return response.getAllMeds();
	  }
	  
	  @Transactional
	  @GetMapping("/updateMedicineByStatus")
	    public boolean updateStatus(@RequestParam(name="status") int status) {
		  return response.getMedicineStatus(status);
	  }
 
	  
	 

}
