/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

import java.sql.Date;

public class student implements Serializable{
private int student_id;
private String name;
private String phone_number;
private String address;
private Date britday;
private boolean gender;
private boolean status;
public student(int student_id, String name, String phone_number, String address, Date britday, boolean gender,
		boolean status) {
	super();
	this.student_id = student_id;
	this.name = name;
	this.phone_number = phone_number;
	this.address = address;
	this.britday = britday;
	this.gender = gender;
	this.status = status;
}
@Override
public String toString() {
	return "student [student_id=" + student_id + ", name=" + name + ", phone_number=" + phone_number + ", address="
			+ address + ", britday=" + britday + ", gender=" + gender + ", status=" + status + ", getStudent_id()="
			+ getStudent_id() + ", getName()=" + getName() + ", getPhone_number()=" + getPhone_number()
			+ ", getAddress()=" + getAddress() + ", getBritday()=" + getBritday() + ", isGender()=" + isGender()
			+ ", isStatus()=" + isStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone_number() {
	return phone_number;
}
public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Date getBritday() {
	return britday;
}
public void setBritday(Date britday) {
	this.britday = britday;
}
public boolean isGender() {
	return gender;
}
public void setGender(boolean gender) {
	this.gender = gender;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
}
