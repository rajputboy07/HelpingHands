package com.project.helpinghands.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.helpinghands.entity.Medicine;
import com.project.helpinghands.ngo.repository.MedicineRepository;


@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	MedicineRepository repository;
	@Override
	public boolean addNewMedicine(Medicine entity) {
		Medicine returnEntity=repository.save(entity);
		return returnEntity!=null?true:false;
	}

	@Override
	public Medicine getMedicineById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Medicine> getAllMedicine() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Medicine> getAllMeds() {
		
		List<Medicine> med=repository.getAllMeds();
		return med;
	}

	@Override
	public List<Medicine> getAllMedsById(int id) {
	 List<Medicine> medById=repository.getAllMedsById(id);
		return medById;
	}

	@Override
	@Transactional
	public boolean insertion(Medicine entity) {

		int add=repository.Insert(entity.getMedId().getmId(), entity.getExpDate(), entity.getDonationDate(), entity.getQuantity(), entity.getDonor().getD_id(), entity.getNgo().getnRegistrationNo());
		
		return add!=0?true:false;
		
		
	}
	@Override
	@Transactional
	public boolean deleteNgo(String userName) {
		// TODO Auto-generated method stub
		int del=repository.deleteNgoById(userName);
		return del!=0?true:false;

	}
	@Override
	@Transactional
	public boolean deleteDonor(String userName) {
		// TODO Auto-generated method stub
		int del=repository.deleteDonorById(userName);
		return del!=0?true:false;

	}
	@Override
	public List<Medicine> ngoMedicineAllDetails(String userName) {
	
		//int id= repository.ngoById(userName);
	    //	System.out.println(id);
	   List<Medicine> data= repository.ngoMedicineDetails(userName);
	    
	    
	    return data;
	}

	@Override
	public boolean getMedicineStatus(int serial) {
		int med=repository.getmedicineByStatus(serial);
		return med!=0?true:false;
	}

	
	

}
	
	
	

	/*@Override
	public boolean Insert(Medicine entity) {
		
		
		
		Medicine returnEntity=repository.Insert(entity.getMedId(), entity.getExpDate(), entity.getDonationDate(), entity.getQuantity(), entity.getDonor(), entity.getNgo());
		return returnEntity!=null?true:false;
	    
		
	}*/


