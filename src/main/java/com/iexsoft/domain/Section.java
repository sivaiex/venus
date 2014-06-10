package com.iexsoft.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Field;

public class Section implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9055964951602219642L;
	
	private String name;
	@Field("class_teacher")
	private String classTeacher;
	private String building;
	@Field("room_number")
	private String roomnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	
	

}
