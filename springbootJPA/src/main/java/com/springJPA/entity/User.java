package com.springJPA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

 

private String nmae;
 private String city;
 private String status;
 
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNmae() {
	return nmae;
}
public void setNmae(String nmae) {
	this.nmae = nmae;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String nmae, String city, String status) {
	super();
	this.id = id;
	this.nmae = nmae;
	this.city = city;
	this.status = status;
}
@Override
public String toString() {
	return "User [id=" + id + ", nmae=" + nmae + ", city=" + city + ", status=" + status + "]";
}

 
	
}
