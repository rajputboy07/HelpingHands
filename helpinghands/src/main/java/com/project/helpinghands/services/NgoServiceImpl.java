package com.project.helpinghands.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.helpinghands.entity.AllMedicine;
import com.project.helpinghands.entity.Ngo;
import com.project.helpinghands.entity.NgoMedicineDetails;
import com.project.helpinghands.ngo.repository.NgoRepository;

@Service
public class NgoServiceImpl implements NgoService {
	
	@Autowired
	NgoRepository repository;

	@Override
	public boolean addNewNgo(Ngo entity) {
		Ngo returnEntity=repository.save(entity);
		return returnEntity!=null?true:false;
	}

	@Override
	public Ngo getNgoByUserName(String id) {
		
		return repository.ngoByUserName(id);
	}

	@Override
	public List<Ngo> getAllNgo() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public boolean ngoUpdate(Ngo entity) {
		repository.saveAndFlush(entity);
		return true;
		
	}




	
	}

	 
	
	

