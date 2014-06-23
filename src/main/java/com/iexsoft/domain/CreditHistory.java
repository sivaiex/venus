package com.iexsoft.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditHistory{

	@Field("deducted_amount")
	@JsonProperty(value = "deducted_amount")
	private float deductedAmount;
	
	@Field("added_amount")
	@JsonProperty(value = "added_amount")
	private float addedAmount;
	
	private String note;
	private Date date;
	public float getDeductedAmount() {
		return deductedAmount;
	}
	public void setDeductedAmount(float deductedAmount) {
		this.deductedAmount = deductedAmount;
	}
	public float getAddedAmount() {
		return addedAmount;
	}
	public void setAddedAmount(float addedAmount) {
		this.addedAmount = addedAmount;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
}
