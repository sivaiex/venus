package com.iexsoft.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "parent")
public class Parent extends Domain {
	/**
	 * 
	 */

	@Field("first_name")
	private String firstName;
	@Field("last_name")
	private String lastName;

	@Field("sex")
	private String sex;

	@Field("address_line1")
	private String addressLine1;
	@Field("address_line2")
	private String addressLine2;
	private String city;
	private String state;

	@Field("postal_code")
	private String postalCode;

	private String email;

	@Field("sms")
	private boolean allowSMS;

	@Field("primary_phone")
	private String primaryPhone;

	@Field("mobile_phone")
	private String mobilePhone;

	@Field("auth")
	private boolean portalAccess;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAllowSMS() {
		return allowSMS;
	}

	public void setAllowSMS(boolean allowSMS) {
		this.allowSMS = allowSMS;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public boolean isPortalAccess() {
		return portalAccess;
	}

	public void setPortalAccess(boolean portalAccess) {
		this.portalAccess = portalAccess;
	}

}
