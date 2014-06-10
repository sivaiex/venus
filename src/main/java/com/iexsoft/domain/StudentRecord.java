package com.iexsoft.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "student_record")
public class StudentRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4093982725442212490L;
	@Id
	private String id;
	@NotNull
	private String name;
	@NotNull
	@Field("doi")
	private Date dateOfIssue;
	@Field("approved_by")
	private String approvedBy;
	@Field("issued_by")
	private String issuedBy;
	private String student;
	@Field("doc_location")
	private String documentLocation;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getDocumentLocation() {
		return documentLocation;
	}
	public void setDocumentLocation(String documentLocation) {
		this.documentLocation = documentLocation;
	}
	
}
