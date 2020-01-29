package com.project.helpinghands.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "allmedicine")
public class AllMedicine implements Serializable {
	
	
	@Id
	@GeneratedValue (generator = "increment")
	@Column(name = "m_id")
	int mId;
	

	@Column(name = "m_name")
	String mName;

	@Column(name = "m_type")
	String mType;
	/*
	@OneToMany(targetEntity = Medicine.class,cascade = CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name="m_id",referencedColumnName="m_id")
     private List<AllMedicine> medId;
*/
	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmType() {
		return mType;
	}

	public void setmType(String mType) {
		this.mType = mType;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public AllMedicine() {
		super();
	}
/*
	public List<AllMedicine> getMedId() {
		return medId;
	}

	public void setMedId(List<AllMedicine> medId) {
		this.medId = medId;
	}*/

	public AllMedicine(int mId, String mName, String mType) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mType = mType;
	}

	
	
	

}
