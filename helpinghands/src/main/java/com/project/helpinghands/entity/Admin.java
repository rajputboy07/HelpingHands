package com.project.helpinghands.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")

public class Admin implements Serializable {
	
	private static final long serialVersionUID = 8549987348228054404L;
    @Id
	@Column(name = "a_username")
	String username;
	@Column(name = "a_password")
	String password;
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
	
}


