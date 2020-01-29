package com.project.helpinghands.services;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Service;

import com.project.helpinghands.entity.Donor;
import com.project.helpinghands.ngo.repository.DonorRepository;

@Service
public class DonorServiceImpl implements DonorService {
	
	
	@Autowired
	DonorRepository repository;

	@Override
	public boolean addNewDonor(Donor entity) {
		// TODO Auto-generated method stub
		Donor returnEntity= repository.save(entity);
		boolean status=returnEntity!=null?true:false;

		
		
		return status;
	}

	@Override
	public Donor getDonorById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Donor> getAllDonor() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public boolean donorUpdate(Donor entity) {
		repository.saveAndFlush(entity);
		return true;
	}

}
