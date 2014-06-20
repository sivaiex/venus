package com.iexsoft.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "student")
public class Student extends Domain {

	@Field("admission_number")
	private String admissionNumber;

	@Field("first_name")
	private String firstName;

	@Field("last_name")
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
	@Field("class_id")
	private String classId;
	@Field("concession_id")
	private String concessionId;
	@Field("access")
	private boolean hasAccess;
	
	private String photo;

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

	public String getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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
