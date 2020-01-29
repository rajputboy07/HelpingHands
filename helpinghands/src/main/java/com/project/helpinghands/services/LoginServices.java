package com.project.helpinghands.services;

import com.project.helpinghands.entity.Admin;
import com.project.helpinghands.entity.Donor;
import com.project.helpinghands.entity.Ngo;

public interface LoginServices {
	
	 boolean addNewAdmin(Admin entity);
	    boolean adminValidation(Admin entity);
	    boolean donorValidation(Donor entity);
	    boolean ngoValidation(Ngo entity);

}
