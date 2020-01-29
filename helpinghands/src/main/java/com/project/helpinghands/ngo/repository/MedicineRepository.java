package com.project.helpinghands.ngo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.helpinghands.entity.Medicine;
import com.project.helpinghands.entity.Ngo;

@Transactional
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
	
   @Modifying
   @Query( nativeQuery = true,value = "insert into medicine(m_id,expdate,donationdate,quantity,d_id,n_registrationno) VALUES(:m_id,:expdate, :donationdate,:quantity,:d_id,:n_registrationno)")
    int Insert(@Param("m_id") int mId, @Param("expdate") String expDate,@Param("donationdate") String donationDate,@Param("quantity") int quantity,@Param("d_id") int dId,@Param("n_registrationno") int regNo);

	
	@Query(nativeQuery=true,value="select * from medicine ")
	List<Medicine> getAllMeds();
	
	
	@Query(nativeQuery=true,value="select * from medicine where d_id=:donorid")
	List<Medicine> getAllMedsById(@Param("donorid") int id );
	
	//@Query(nativeQuery=true,value="update table medicine set status =1 where med_serial=:donorid")
//	List<Medicine> getAllMedsById(@Param("donorid") int id );
	 @Modifying	 
	 @Query(nativeQuery = true,value=" Delete from ngo where n_username=:namepattern")
	  public int deleteNgoById(@Param("namepattern")String username);
	 
	 
	 @Modifying	 
	 @Query(nativeQuery = true,value=" Delete from donor where d_username=:namepattern")
	  public int deleteDonorById(@Param("namepattern")String username);
	
	 @Query(nativeQuery = true,value="  SELECT * from medicine where n_registrationno =(select n_registrationno from ngo where n_username = :namepattern) and status=1")
	 public List<Medicine> ngoMedicineDetails(@Param("namepattern")String username);
	 
	 @Modifying	 
	 @Query(nativeQuery = true,value=" Update medicine set status=1 where med_serial=:namepattern")
	  public int getmedicineByStatus(@Param("namepattern")int serialId);
	
}
