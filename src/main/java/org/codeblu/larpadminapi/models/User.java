package org.codeblu.larpadminapi.models;

import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class User {

	@Id
	@GeneratedValue
	private Long Id;
	
	private String userName;
	
	private String firstName;
	
	private String lastName;
	
	private URL userEmailAddress;
	
	

	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public URL getUserEmailAddress() {
		return userEmailAddress;
	}



	public void setUserEmailAddress(URL userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}



	public Long getId() {
		return Id;
	}



	public User(String userName, String firstName, String lastName, URL userEmailAddress) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userEmailAddress = userEmailAddress;
	}
	
	
	
}
