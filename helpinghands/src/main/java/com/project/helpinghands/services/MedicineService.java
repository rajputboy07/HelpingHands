package com.project.helpinghands.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.project.helpinghands.entity.Medicine;

public interface MedicineService {
	
    boolean addNewMedicine(Medicine entity);
	
	Medicine getMedicineById(int id);
	
	List<Medicine> getAllMedicine();
	
	List<Medicine>getAllMeds();
	
	boolean insertion(Medicine Entity);

	List<Medicine> getAllMedsById(int id);
	
	boolean deleteNgo(String userName);
	
	boolean deleteDonor(String userName);

	public List<Medicine> ngoMedicineAllDetails(String userName);
	
	boolean getMedicineStatus(int serial);
	 
}
