package com.project.helpinghands.services;

import java.util.List;

import com.project.helpinghands.entity.Donor;

public interface DonorService {
	boolean addNewDonor(Donor entity);
	
	Donor getDonorById(int id);
	
	List<Donor> getAllDonor();
	
	boolean donorUpdate(Donor entity);

}
