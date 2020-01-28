package com.project.helpinghands.ngo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.helpinghands.entity.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
	
   @Modifying
   @Query( nativeQuery = true,value = "insert into medicine(m_id,expdate,donationdate,quantity,d_id,n_registrationno) VALUES(:m_id,:expdate, :donationdate,:quantity,:d_id,:n_registrationno)")
    int Insert(@Param("m_id") int mId, @Param("expdate") String expDate,@Param("donationdate") String donationDate,@Param("quantity") int quantity,@Param("d_id") int dId,@Param("n_registrationno") int regNo);

	
	@Query(nativeQuery=true,value="select * from medicine ")
	List<Medicine> getAllMeds();
	
	
	@Query(nativeQuery=true,value="select * from medicine where d_id=:donorid")
	List<Medicine> getAllMedsById(@Param("donorid") int id );
}
