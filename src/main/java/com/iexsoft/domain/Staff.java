package com.iexsoft.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "staff")
public class Staff extends Domain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4093982725442212490L;

	@NotNull
	@Field("first_name")
	private String firstName;
	@NotNull
	@Field("last_name")
	private String lastName;

	@Field("sex")
	private String sex;

	@Field("mobile_phone")
	private String mobilePhone;


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

	

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	
}