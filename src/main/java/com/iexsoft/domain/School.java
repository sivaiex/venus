package com.iexsoft.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import javax.validation.constraints.Pattern;

@Document(collection="school")
public class School implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4065197733627571051L;
	@Id
	private String id;
	@NotNull(message = "{school.nameRequired}")
	private String name;
	@Field("reg-number")
	private String regNumber;
	@Field("established")
	private Date establishedDate;
	@Field("address-line1")
	private String addressLine1;
	@Field("address-line2")
	private String addressLine2;
	private String city;
	private String state;
	
	@Field("postal-code")
	@Pattern(regexp = "\\d+", message = "{address.invalidPostalCode}")
	private String postalCode;
	
	@Field("logo-image")
	private byte[] logoImage;
	@Field("first-phone")
	private String phoneNumber1;
	@Field("second-phone")
	private String phoneNumber2;
	

	@Pattern(regexp = "^[_A-Za-z0-9-]+(.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(.[A-Za-z0-9-]+)*((.[A-Za-z]{2,}){1}$)", message = "{school.invalidEmail}")
	private String email;
	private String correspondant;
	
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
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public Date getEstablishedDate() {
		return establishedDate;
	}
	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public byte[] getLogoImage() {
		return logoImage;
	}
	public void setLogoImage(byte[] logoImage) {
		this.logoImage = logoImage;
	}
	public String getPhoneNumber1() {
		return phoneNumber1;
	}
	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}
	public String getPhoneNumber2() {
		return phoneNumber2;
	}
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCorrespondant() {
		return correspondant;
	}
	public void setCorrespondant(String correspondant) {
		this.correspondant = correspondant;
	}
	
	
	

}
