package com.project.helpinghands.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name ="donor")

public class Donor implements Serializable {
	
	
	@Column(name = "d_username")
	String username;
	
	@Column(name = "d_password")
	String password;
	
	@Column(name = "d_name")
	String name;
	
	
	@Id
	@GeneratedValue(generator ="increment")
	@Column(name = "d_id")
	int d_id;
	
	
	@Column(name = "mobileno")
	String mobileno;
	
	@Column(name = "d_gender")
	String gender;

	@Column(name = "d_email")
	String email;

	@Column(name = "address_line1")
	String addressLine1;
	
	@Column(name = "address_line2")
	String addressLine2;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "pincode")
	int pincode;
	/*
@OneToMany(targetEntity = Medicine.class,cascade = CascadeType.ALL)
	@JoinColumn(name="d_id",referencedColumnName="d_id",insertable = false,updatable = false)
	private List<Medicine> medicine;

	*/





	



	public int getD_id() {
		return d_id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setD_id(int d_id) {
		this.d_id = d_id;
	}




	public String getMobileno() {
		return mobileno;
	}




	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getAddressLine1() {
		return addressLine1;
	}




	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}




	public String getAddressLine2() {
		return addressLine2;
	}




	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public int getPincode() {
		return pincode;
	}




	public void setPincode(int pincode) {
		this.pincode = pincode;
	}




	




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public Donor() {
		super();
	}




	public Donor(String dUserName, String nPassword, String dName, int dId, String mobileno, String gender,
			String email, String addressLine1, String addressLine2, String city, int pincode) {
		super();
		this.username = dUserName;
		this.password = nPassword;
		this.name = dName;
		this.d_id= dId;
		this.mobileno = mobileno;
		this.gender = gender;
		this.email = email;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.pincode = pincode;
	}
	
	


/*

	public List<Medicine> getMedicine() {
		return medicine;
	}




	public void setMedicine(List<Medicine> medicine) {
		this.medicine = medicine;
	}
*/



	
	}

	
	
	
	
	
	
	
	


