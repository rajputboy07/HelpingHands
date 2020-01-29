package com.project.helpinghands.ngo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.helpinghands.entity.AllMedicine;
import com.project.helpinghands.entity.Medicine;
import com.project.helpinghands.entity.Ngo;
import com.project.helpinghands.entity.NgoMedicineDetails;
@Transactional
@Repository
public interface NgoRepository extends JpaRepository<Ngo , Integer> {
	
	 @Query(nativeQuery = true,value="Select * from ngo where n_username=:namepattern and n_password=:password")
	    public Ngo ngoValidate(@Param("namepattern")String username,@Param("password")String password);
	 
	 @Query(nativeQuery = true,value="Select * from ngo where n_username=:namepattern ")
	    public Ngo ngoByUserName(@Param("namepattern")String username);
	 
	 @Query(nativeQuery = true,value="  SELECT * FROM medicine where n_registrationno = (SELECT n_registrationno from ngo where =:namepattern) and status=1")
	    public List<Medicine> ngoMedicineDetails(@Param("namepattern")String username);
	 
	
	 
	 @Query(nativeQuery=true,value="SELECT n_registrationno from ngo where n_username=:namepattern")
	 public int ngoById(@Param("namepattern") String username);
	 
	/* @Query(nativeQuery = true,value="  SELECT allmedicine.m_name,allmedicine.m_type from allmedicine,ngo,medicine where medicine.n_registrationno=:namepattern ")
	  public List<Object> ngoByMedicine(@Param("namepattern")int regId);*/
	 
	
	 
	 
	}