package com.project.helpinghands.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.helpinghands.entity.AllMedicine;
import com.project.helpinghands.ngo.repository.AllMedicineRepository;
@Service
public class AllMedicineServiceImpl implements AllMedicineService {

	
	@Autowired
	AllMedicineRepository repository;

	@Override
	public boolean addNewMedicine(AllMedicine entity) {
		AllMedicine returnEntity= repository.save(entity);
		return returnEntity!=null?true:false;
	}

	@Override
	public List<AllMedicine> getAllMedicine() {
		return repository.findAll();
	}

	@Override
	public AllMedicine getMedicineById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	



}
