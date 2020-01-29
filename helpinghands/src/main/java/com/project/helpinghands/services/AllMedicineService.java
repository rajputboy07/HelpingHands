package com.project.helpinghands.services;

import java.util.List;

import com.project.helpinghands.entity.AllMedicine;

public interface AllMedicineService {
	

		boolean addNewMedicine(AllMedicine entity);
		
		AllMedicine getMedicineById(int id);
		
		List<AllMedicine> getAllMedicine();
		
		

	}



