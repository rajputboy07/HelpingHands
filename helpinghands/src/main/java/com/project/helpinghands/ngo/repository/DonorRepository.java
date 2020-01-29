package com.project.helpinghands.ngo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.helpinghands.entity.Donor;


@Repository
public interface DonorRepository extends JpaRepository<Donor, Integer> {
	@Query(nativeQuery = true,value="Select * from donor where d_username=:namepattern and d_password=:password")
    public Donor donorValidate(@Param("namepattern")String username,@Param("password")String password);
	
	
	
}
