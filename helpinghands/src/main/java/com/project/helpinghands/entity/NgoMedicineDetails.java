package com.project.helpinghands.entity;

public class NgoMedicineDetails {
	
	AllMedicine mName;
	AllMedicine mType;
	Medicine expDate;
	Medicine donationDate;
	Donor name;
	public AllMedicine getmName() {
		return mName;
	}
	public void setmName(AllMedicine mName) {
		this.mName = mName;
	}
	public AllMedicine getmType() {
		return mType;
	}
	public void setmType(AllMedicine mType) {
		this.mType = mType;
	}
	public Medicine getExpDate() {
		return expDate;
	}
	public void setExpDate(Medicine expDate) {
		this.expDate = expDate;
	}
	public Medicine getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(Medicine donationDate) {
		this.donationDate = donationDate;
	}
	public Donor getName() {
		return name;
	}
	public void setName(Donor name) {
		this.name = name;
	}
	
	

}
