package com.iexsoft.api.school;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class SchoolServiceException extends WebApplicationException {
	/**
		 * 
		 */
	private static final long serialVersionUID = -5554067420277041419L;

	public SchoolServiceException() {
		super();
	}

	public SchoolServiceException(Response.Status status, String errorMsg) {

		super(Response.status(status).entity(errorMsg).build());
	}

}
