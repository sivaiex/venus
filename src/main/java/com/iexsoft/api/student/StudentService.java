package com.iexsoft.api.student;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.iexsoft.api.ServiceURL;
import com.iexsoft.domain.Student;
import com.iexsoft.domain.StudentAccountActivity;
import com.iexsoft.domain.StudentAttendance;
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
	@Path(ServiceURL.STUDENT_SERVICE_All_STUDENTS)
	public List<Student> getStudents();

	/*
	 * Get Students by last name
	 */
	public List<Student> getStudentsByLastName(@PathVariable("lastname") String surname);

	/*
	 * Get Students by First name
	 */
	public List<Student> getStudentsByFirstName(@PathVariable("firstname") String firstname);

	/*
	 * Get Students by Date of Birth
	 */
	public List<Student> getStudentsByDOB(@PathVariable("dateOfBirth") Date dateofBirth);

	/*
	 * Get Students by Admission Number
	 */
	public List<Student> getStudentsByAdmissionNumber(@PathVariable("admissionNumber") String admissionNumber);

	/*
	 * Get Students by Father
	 */
	public List<Student> getStudentsByFather(@PathVariable("father") String father);

	/*
	 * Get Students by Mother
	 */
	public List<Student> getStudentsByMother(@PathVariable("mother") String mother);

	/*
	 * Search students by last name match
	 */
	public List<Student> searchStudentsByLastNameMatch(@PathVariable("lastname") String lastname);

	/*
	 * Search students by first name match
	 */
	public List<Student> searchStudentsByFirstNameMatch(@PathVariable("firstname") String firstname);

	/*
	 * Search students by Birth date
	 */
	public List<Student> searchStudentsByBirthDate(@PathVariable("month") int month, @PathVariable("date") int date);

	/*
	 * Find students by class
	 */
	public List<Student> getStudentsByBirthDate(@PathVariable("classId") String classId);

	/*
	 * Get Student Account
	 */
	public List<StudentAccountActivity> getStudentAccountByStudentId(@PathVariable("studentid") String studentid);

	/*
	 * Get Student Activity
	 */
	public List<StudentNotes> getStudentActivityByStudentId(@PathVariable("studentid") String studentid);

	/*
	 * Get Student Attendance
	 */
	public List<StudentAttendance> getStudentAttendanceByStudentId(@PathVariable("studentid") String studentid);

	/*
	 * Get Student Marks
	 */
	public List<StudentMarks> getStudentMarksByStudentId(@PathVariable("studentid") String studentid);

	/*
	 * Get Student Promotion
	 */
	public List<StudentPromotion> getStudentPromotionByStudentId(@PathVariable("studentid") String studentid);

	/*
	 * Get Student Record
	 */
	public List<StudentRecord> getStudentRecordByStudentId(@PathVariable("studentid") String studentid);

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
	@Path(ServiceURL.STUDENT_SERVICE_CREATE_STUDENT)
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
