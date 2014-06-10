package com.iexsoft.domain.secondaries;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.iexsoft.domain.Domain;

@Document(collection = "fee_concession")
public class FeeConcession extends Domain implements Serializable {

	private static final long serialVersionUID = 774728290821248715L;

	@Field("fee-type")
	private String feeType;
	@Field("class-id")
	private String classId;
	private String[] concessions;

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
