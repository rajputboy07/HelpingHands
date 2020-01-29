package com.project.helpinghands.ngo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.helpinghands.entity.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	@Query(nativeQuery = true,value="Select * from admin where a_username=:namepattern and a_password=:password")
    public Admin adminValidate(@Param("namepattern")String username,@Param("password")String password);
	

}
