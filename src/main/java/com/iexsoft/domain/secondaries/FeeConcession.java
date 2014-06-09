package com.iexsoft.domain.secondaries;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "staff-type")
public class FeeConcession implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4591355263399734022L;

	@Id
	private String id;
	@Field("fee-type")
	private String feeType;
	@Field("class-id")
	private String classId;
	private String[] concessions;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String[] getConcessions() {
		return concessions;
	}

	public void setConcessions(String[] concessions) {
		this.concessions = concessions;
	}

	

}
