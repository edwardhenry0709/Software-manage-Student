/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.sql.Date;
public class Class implements Serializable {
private int class_id;
private int course_id;
private int student_id;
private Date dang_ky;
private boolean status;
@Override
public String toString() {
	return "Class [class_id=" + class_id + ", course_id=" + course_id + ", student_id=" + student_id + ", dang_ky="
			+ dang_ky + ", status=" + status + ", getClass_id()=" + getClass_id() + ", getCourse_id()=" + getCourse_id()
			+ ", getStudent_id()=" + getStudent_id() + ", getDang_ky()=" + getDang_ky() + ", isStatus()=" + isStatus()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public int getClass_id() {
	return class_id;
}
public void setClass_id(int class_id) {
	this.class_id = class_id;
}
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public Date getDang_ky() {
	return dang_ky;
}
public void setDang_ky(Date dang_ky) {
	this.dang_ky = dang_ky;
}
public boolean isStatus() {
	return status;
}
public Class(int class_id, int course_id, int student_id, Date dang_ky, boolean status) {
	super();
	this.class_id = class_id;
	this.course_id = course_id;
	this.student_id = student_id;
	this.dang_ky = dang_ky;
	this.status = status;
}
public void setStatus(boolean status) {
	this.status = status;
}
}
