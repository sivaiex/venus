package com.iexsoft.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Domain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4446298736187520418L;
	@Id
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
