package com.project.helpinghands.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table (name="medicine")
@SecondaryTable(name="donor", pkJoinColumns =@PrimaryKeyJoinColumn(name="d_id"))
@SecondaryTable(name="ngo", pkJoinColumns = @PrimaryKeyJoinColumn(name="n_registrationno"))
@SecondaryTable(name="allmedicine", pkJoinColumns = @PrimaryKeyJoinColumn(name="m_id"))
public class Medicine implements Serializable {
	
private static final long serialVersionUID = 693169456471849431L;
	
	
		
	@Id
	@GeneratedValue (generator = "increment")
	@Column(name = "med_serial")
	int medSerial;
	
	@Column(name = "expdate")
	String expDate;
	
	@Column(name = "donationdate")
	String donationDate;
		
	@Column(name = "quantity")
	int quantity;
	 

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="m_id",referencedColumnName="m_id",table = "allmedicine",insertable = false,updatable = false)
    private AllMedicine medId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="d_id",referencedColumnName="d_id",table = "donor",insertable = false,updatable = false)
	private Donor donor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="n_registrationno",referencedColumnName="n_registrationno",table = "ngo",insertable = false ,updatable = false)
	 private Ngo ngo;
	
	
	@Column(name="status")
	private int status = 0;


	public Medicine() {
		super();
	}




	public Donor getDonor() {
		return donor;
	}




	public AllMedicine getMedId() {
		return medId;
	}




	public void setMedId(AllMedicine medId) {
		this.medId = medId;
	}




	public void setDonor(Donor donor) {
		this.donor = donor;
	}




	public Ngo getNgo() {
		return ngo;
	}




	public void setNgo(Ngo ngo) {
		this.ngo = ngo;
	}






	public int getStatus() {
		return status;
	}




	public void setStatus(int status) {
		this.status = status;
	}




	public String getExpDate() {
		return expDate;
	}


	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}


	public String getDonationDate() {
		return donationDate;
	}


	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
