package com.project.helpinghands.services;

import java.util.List;

import com.project.helpinghands.entity.AllMedicine;
import com.project.helpinghands.entity.Medicine;
import com.project.helpinghands.entity.Ngo;
import com.project.helpinghands.entity.NgoMedicineDetails;

public interface NgoService {
	boolean addNewNgo(Ngo entity);
	
	Ngo getNgoByUserName(String id);
	
	
	List<Ngo> getAllNgo();
	boolean ngoUpdate(Ngo entity);
	
	

}
