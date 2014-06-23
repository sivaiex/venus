package com.iexsoft.api.student;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.iexsoft.api.ServiceURL;
import com.iexsoft.domain.Student;
import com.iexsoft.domain.StudentAccountActivity;
import com.iexsoft.domain.StudentAttendance;
import com.iexsoft.domain.StudentCredit;
import com.iexsoft.domain.StudentMarks;
import com.iexsoft.domain.StudentNotes;
import com.iexsoft.domain.StudentPromotion;
import com.iexsoft.domain.StudentRecord;

@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public interface StudentService {

	/*
	 * Get all Students, probably we may not using this method because is going
	 * to return all students list in school
	 */
	@GET
	@Path(ServiceURL.All_STUDENTS)
	public List<Student> getStudents();

	/*
	 * Get Students by last name
	 */
	@GET
	@Path(ServiceURL.GET_STUDENTS_BY_LASTNAME)
	public List<Student> getStudentsByLastName(@PathParam("lastname") String surname);

	/*
	 * Get Students by First name
	 */
	@GET
	@Path(ServiceURL.GET_STUDENTS_BY_FIRSTNAME)
	public List<Student> getStudentsByFirstName(@PathParam("firstname") String firstname);

	/*
	 * Get Students by Date of Birth
	 */
	@GET
	@Path(ServiceURL.GET_STUDENTS_BY_DOB)
	public List<Student> getStudentsByDOB(@PathParam("dateOfBirth") Date dateofBirth);

	/*
	 * Get Students by Admission Number
	 */
	@GET
	@Path(ServiceURL.GET_STUDENT_BY_ADMISSION)
	public Student getStudentByAdmissionNumber(@PathParam("admissionNumber") String admissionNumber);

	/*
	 * Get Students by Father
	 */
	@GET
	@Path(ServiceURL.GET_STUDENTS_BY_FATHER)
	public List<Student> getStudentsByFather(@PathParam("father") String father);

	/*
	 * Get Students by Mother
	 */
	@GET
	@Path(ServiceURL.GET_STUDENTS_BY_MOTHER)
	public List<Student> getStudentsByMother(@PathParam("mother") String mother);

	/*
	 * Search students by last name match
	 */
	@GET
	@Path(ServiceURL.SEARCH_STUDENTS_BY_LASTNAME)
	public List<Student> searchStudentsByLastNameMatch(@PathParam("lastname") String lastname);

	/*
	 * Search students by first name match
	 */
	@GET
	@Path(ServiceURL.SEARCH_STUDENTS_BY_FIRSTNAME)
	public List<Student> searchStudentsByFirstNameMatch(@PathParam("firstname") String firstname);

	/*
	 * Search students by Birth date
	 */
	@GET
	@Path(ServiceURL.SEARCH_STUDENTS_BY_MONTH_DATE)
	public List<Student> searchStudentsByBirthDate(@PathParam("month") int month, @PathParam("date") int date);

	/*
	 * Find students by class
	 */
	@GET
	@Path(ServiceURL.GET_STUDENTS_BY_CLASS)
	public List<Student> getStudentsByBirthDate(@PathParam("classId") String classId);

	/*
	 * Get Student Account Activity
	 */
	@GET
	@Path(ServiceURL.GET_STUDENT_ACCOUNT_ACTIVITY_BY_STUDENT)
	public List<StudentAccountActivity> getStudentAccountActivityByStudentId(@PathParam("studentid") String studentid);

	/*
	 * Get Student Notes
	 */
	@GET
	@Path(ServiceURL.GET_STUDENT_NOTES_BY_STUDENT)
	public List<StudentNotes> getStudentNotesByStudentId(@PathParam("studentid") String studentid);

	/*
	 * Get Student Attendance
	 */
	@GET
	@Path(ServiceURL.GET_STUDENT_ATTENDANCE_BY_STUDENT)
	public List<StudentAttendance> getStudentAttendanceByStudentId(@PathParam("studentid") String studentid);

	/*
	 * Get Student Marks
	 */
	@GET
	@Path(ServiceURL.GET_STUDENT_MARKS_BY_STUDENT)
	public List<StudentMarks> getStudentMarksByStudentId(@PathParam("studentid") String studentid);

	/*
	 * Get Student Promotion
	 */
	@GET
	@Path(ServiceURL.GET_STUDENT_PROMOTION_BY_STUDENT)
	public List<StudentPromotion> getStudentPromotionByStudentId(@PathParam("studentid") String studentid);

	/*
	 * Get Student Record
	 */
	@GET
	@Path(ServiceURL.GET_STUDENT_RECORDS_BY_STUDENT)
	public List<StudentRecord> getStudentRecordByStudentId(@PathParam("studentid") String studentid);
	
	/*
	 * Get Student Credit
	 */
	@GET
	@Path(ServiceURL.GET_STUDENT_CREDIT_BY_STUDENT)
	public StudentCredit getStudentCreditByStudentId(@PathParam("studentid") String studentid);

	/***
	 * All the save methods
	 * 
	 */

	/***
	 * POST Method to create a Student
	 * 
	 * @param student
	 * @return
	 */
	@POST
	@Path(ServiceURL.CREATE_STUDENT)
	public Student saveStudent(Student student);

	/*
	 * Save Student Attendance
	 */
	public StudentAttendance saveStudentAttendance(@Validated @RequestBody StudentAttendance studentattendance);

	/*
	 * Save Student Marks
	 */
	public StudentMarks saveStudentMarks(@Validated @RequestBody StudentMarks studentMarks);

	/*
	 * Save Student Promotion
	 */
	public StudentPromotion saveStudentPromotion(@Validated @RequestBody StudentPromotion studentPromotion);

}
