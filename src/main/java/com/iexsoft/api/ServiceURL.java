package com.iexsoft.api;

public class ServiceURL {

	// School services
	public static final String SCHOLL_SERVICE_All_SCHOOL = "/schools";

	// Student services
	public static final String STUDENT_SERVICE_All_STUDENTS = "/students";
	public static final String STUDENT_SERVICE_CREATE_STUDENT = "/student";

	// Parent services
	public static final String PARENT_SERVICE_All_PARENTS = "/parents";
	public static final String PARENT_SERVICE_CREATE_PARENT = "/parent";
	public static final String PARENT_SERVICE_GET_BY_LASTNAME = "/parents/ln/{lastname}";
	public static final String PARENT_SERVICE_GET_BY_FIRSTNAME = "/parents/fn/{firstname}";

}
