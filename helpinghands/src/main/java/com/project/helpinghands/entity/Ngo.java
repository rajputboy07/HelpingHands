package com.project.helpinghands.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ngo")
public class Ngo implements Serializable{
	

		private static final long serialVersionUID = 693169456471849431L;
		
		@Column(name = "n_username")
		String username;
		
		@Column(name = "n_password")
		String password;
		
		@Column(name = "n_name")
		String name;
		
		
		@Id
		@Column(name = "n_registrationno")
		int nRegistrationNo;
		
	
		@Column(name = "mobileno")
		String mobileno;
	
		@Column(name = "n_email")
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
		@JoinColumn(name="n_registrationno",referencedColumnName="n_registrationno",insertable = false ,updatable = false)
		private List<Medicine> medicine;
		
	
*/
		





	




		





	





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






		public String getName() {
			return name;
		}






		public void setName(String name) {
			this.name = name;
		}





		public int getnRegistrationNo() {
			return nRegistrationNo;
		}






		public void setnRegistrationNo(int nRegistrationNo) {
			this.nRegistrationNo = nRegistrationNo;
		}






		public String getMobileno() {
			return mobileno;
		}






		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
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


		
/*


	

		public List<Medicine> getMedicine() {
			return medicine;
		}






		public void setMedicine(List<Medicine> medicine) {
			this.medicine = medicine;
		}

*/




		public Ngo() {
			super();
			
		}






		public Ngo(String nUserName, String nPassword, String nName, int nRegistrationNo, String mobileno, String email,
				String addressLine1, String addressLine2, String city, int pincode ) {
			super();
			this.username = nUserName;
			this.password = nPassword;
			this.name = nName;
			this.nRegistrationNo = nRegistrationNo;
			this.mobileno = mobileno;
			this.email = email;
			this.addressLine1 = addressLine1;
			this.addressLine2 = addressLine2;
			this.city = city;
			this.pincode = pincode;
			//this.medicine = medicine;
		}
		
		
		
		

}
