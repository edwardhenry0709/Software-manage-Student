/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

import java.sql.Date;

public class course implements Serializable{
private int course_id ;
private String course_name ;  
private String describe_1;
private Date startup ;
public course(int course_id, String course_name, String describe_1, Date startup, Date end, String status) {
	super();
	this.course_id = course_id;
	this.course_name = course_name;
	this.describe_1 = describe_1;
	this.startup = startup;
	this.end = end;
	this.status = status;
}
@Override
public String toString() {
	return "course [course_id=" + course_id + ", course_name=" + course_name + ", describe_1=" + describe_1
			+ ", startup=" + startup + ", end=" + end + ", status=" + status + ", getCourse_id()=" + getCourse_id()
			+ ", getCourse_name()=" + getCourse_name() + ", getDescribe_1()=" + getDescribe_1() + ", getStartup()="
			+ getStartup() + ", getEnd()=" + getEnd() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public String getDescribe_1() {
	return describe_1;
}
public void setDescribe_1(String describe_1) {
	this.describe_1 = describe_1;
}
public Date getStartup() {
	return startup;
}
public void setStartup(Date startup) {
	this.startup = startup;
}
public Date getEnd() {
	return end;
}
public void setEnd(Date end) {
	this.end = end;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
private Date end ;
private String status ;
}
