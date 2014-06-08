package com.iexsoft.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;

@Document(collection="student")
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4093982725442212490L;
	@Id
	private String id;
	@NotNull
	@Field("first-name")
	private String firstName;
	@NotNull
	@Field("last-name")
	private String lastName;
	@Field("dob")
	private Date dateOfBirth;
	@Field("dfa")
	private Date dateOfFirstAdmission;
	@Field("dsa")
    private Date dateOfSecondAdmission;
	@Field("dfr")
    private Date dateOfFirstRelieving;
	@Field("dsr")
    private Date dateOfSecondRelieving;
    private String father;
    private String mother;
    @Field("class-id")
    private String classId;
    @Field("concession-id")
    private String concessionId;
    @Field("access")
    private boolean hasAccess;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfFirstAdmission() {
		return dateOfFirstAdmission;
	}
	public void setDateOfFirstAdmission(Date dateOfFirstAdmission) {
		this.dateOfFirstAdmission = dateOfFirstAdmission;
	}
	public Date getDateOfSecondAdmission() {
		return dateOfSecondAdmission;
	}
	public void setDateOfSecondAdmission(Date dateOfSecondAdmission) {
		this.dateOfSecondAdmission = dateOfSecondAdmission;
	}
	public Date getDateOfFirstRelieving() {
		return dateOfFirstRelieving;
	}
	public void setDateOfFirstRelieving(Date dateOfFirstRelieving) {
		this.dateOfFirstRelieving = dateOfFirstRelieving;
	}
	public Date getDateOfSecondRelieving() {
		return dateOfSecondRelieving;
	}
	public void setDateOfSecondRelieving(Date dateOfSecondRelieving) {
		this.dateOfSecondRelieving = dateOfSecondRelieving;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getConcessionId() {
		return concessionId;
	}
	public void setConcessionId(String concessionId) {
		this.concessionId = concessionId;
	}
	public boolean isHasAccess() {
		return hasAccess;
	}
	public void setHasAccess(boolean hasAccess) {
		this.hasAccess = hasAccess;
	}
	
	
	 

}
