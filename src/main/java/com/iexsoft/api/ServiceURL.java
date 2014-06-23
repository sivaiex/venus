package com.iexsoft.api;

public class ServiceURL {

	/***
	 *  School Service REST URLs
	 */
	public static final String All_SCHOOLS = "/schools";

	
	/***
	 * Student Service REST URLs
	 */
	// All Student GET URLs
	public static final String All_STUDENTS = "/students";
	public static final String GET_STUDENTS_BY_LASTNAME = "/students/ln/{lastname}";
	public static final String GET_STUDENTS_BY_FIRSTNAME = "/students/fn/{firstname}";
	public static final String GET_STUDENTS_BY_DOB = "/students/dob/{dateOfBirth}";
	public static final String GET_STUDENT_BY_ADMISSION = "/students/adn/{admissionNumber}";
	public static final String GET_STUDENTS_BY_FATHER = "/students/father/{father}";
	public static final String GET_STUDENTS_BY_MOTHER = "/students/father/{mother}";
	public static final String GET_STUDENTS_BY_CLASS = "/students/class/{classId}";
	public static final String GET_STUDENT_ACCOUNT_ACTIVITY_BY_STUDENT = "/student/account/id/{studentid}";
	public static final String GET_STUDENT_NOTES_BY_STUDENT = "/student/notes/id/{studentid}";
	public static final String GET_STUDENT_ATTENDANCE_BY_STUDENT = "/student/attendance/id/{studentid}";
	public static final String GET_STUDENT_MARKS_BY_STUDENT = "/student/marks/id/{studentid}";
	public static final String GET_STUDENT_PROMOTION_BY_STUDENT = "/student/promotion/id/{studentid}";
	public static final String GET_STUDENT_RECORDS_BY_STUDENT = "/student/records/id/{studentid}";
	public static final String GET_STUDENT_CREDIT_BY_STUDENT = "/student/credit/id/{studentid}";
	
	// ALL Student Search URLs
	public static final String SEARCH_STUDENTS_BY_LASTNAME = "/students/lns/{lastname}";
	public static final String SEARCH_STUDENTS_BY_FIRSTNAME = "/students/fns/{firstname}";
	public static final String SEARCH_STUDENTS_BY_MONTH_DATE = "/students/month/{month}/date/{date}";
	
	// All student Create URLs
	public static final String CREATE_STUDENT = "/student";

	/**
	 *  Parent Service REST URLs
	 */
	// All Parent GET URLs
	public static final String All_PARENTS = "/parents";
	public static final String GET_PARENTS_BY_LASTNAME = "/parents/ln/{lastname}";
	public static final String GET_PARENTS_BY_FIRSTNAME = "/parents/fn/{firstname}";

	// All Parent Create URLs
	public static final String CREATE_PARENT = "/parent";
	
}
