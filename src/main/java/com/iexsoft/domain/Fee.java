package com.iexsoft.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "fee")
public class Fee extends Domain {
	/**
	 * 
	 */

	@Field("fee_type")
	@JsonProperty(value="fee_type")
	private String feeType;
	
	@Field("class_id")
	@JsonProperty(value="class_id")
	private String studyClass;

	@Field("amount")
	private String amount;

	@Field("start_date")
	@JsonProperty(value="start_date")
	private Date startDate;

	@Field("end_date")
	@JsonProperty(value="end_date")
	private Date endDate;
	
	// Monthly, quarterly etc..
	private String frequency;
	
	// 1st every month, 10th of every month etc..
	@Field("pay_date")
	@JsonProperty(value="pay_date")
	private int payDate;
		

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getStudyClass() {
		return studyClass;
	}

	public void setStudyClass(String studyClass) {
		this.studyClass = studyClass;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public int getPayDate() {
		return payDate;
	}

	public void setPayDate(int payDate) {
		this.payDate = payDate;
	}
	
	

}
