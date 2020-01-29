package com.project.helpinghands.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.helpinghands.entity.Admin;
import com.project.helpinghands.entity.Donor;
import com.project.helpinghands.entity.Ngo;
import com.project.helpinghands.ngo.repository.AdminRepository;
import com.project.helpinghands.ngo.repository.DonorRepository;
import com.project.helpinghands.ngo.repository.NgoRepository;

@Service
public class LoginServicesImpl implements LoginServices {
@Autowired
AdminRepository adminRepose;
@Autowired
DonorRepository donorRepose;
@Autowired
NgoRepository ngoRepose;
	@Override
	public boolean addNewAdmin(Admin entity) {
		Admin returnEntity=adminRepose.save(entity);
		return returnEntity!=null?true:false;
	}

	@Override
	public boolean adminValidation(Admin entity) {
		Admin returnEntity=adminRepose.adminValidate(entity.getUsername(),entity.getPassword());
		return returnEntity!=null?true:false;
	}

	@Override
	public boolean donorValidation(Donor entity) {
		
		Donor returnEntity=donorRepose.donorValidate(entity.getUsername(),entity.getPassword());
		return returnEntity!=null?true:false;
	}

	@Override
	public boolean ngoValidation(Ngo entity) {
		Ngo returnEntity=ngoRepose.ngoValidate(entity.getUsername(),entity.getPassword());
		return returnEntity!=null?true:false;
	}

}
