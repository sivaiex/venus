package com.iexsoft.controller.student;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iexsoft.domain.Student;
import com.iexsoft.domain.StudentAccountActivity;
import com.iexsoft.domain.StudentNotes;
import com.iexsoft.domain.StudentAttendance;
import com.iexsoft.domain.StudentMarks;
import com.iexsoft.domain.StudentPromotion;
import com.iexsoft.domain.StudentRecord;
import com.iexsoft.repositories.StudentAccountRepository;
import com.iexsoft.repositories.StudentActivitytRepository;
import com.iexsoft.repositories.StudentAttendanceRepository;
import com.iexsoft.repositories.StudentMarksRepository;
import com.iexsoft.repositories.StudentPromotionRepository;
import com.iexsoft.repositories.StudentRecordRepository;
import com.iexsoft.repositories.StudentRepository;
import com.iexsoft.service.DomainService;

@Controller
public class StudentController {

	@Autowired
	DomainService domainService;

	/*
	 * Get all Students, probably we may not using this method because is going
	 * to return all students list in school
	 */
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudents() {
		return domainService.getRepository(StudentRepository.class).findAll();

	}

	/*
	 * Get Students by last name
	 */
	@RequestMapping(value = "/students/ln/{lastname}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudentsByLastName(@PathVariable("lastname") String surname) {
		return domainService.getRepository(StudentRepository.class).findByLastName(surname);

	}

	/*
	 * Get Students by First name
	 */
	@RequestMapping(value = "/students/fn/{firstname}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudentsByFirstName(@PathVariable("firstname") String firstname) {
		return domainService.getRepository(StudentRepository.class).findByFirstName(firstname);

	}

	/*
	 * Get Students by Date of Birth
	 */
	@RequestMapping(value = "/students/dob/{dateOfBirth}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudentsByDOB(@PathVariable("dateOfBirth") Date dateofBirth) {
		return domainService.getRepository(StudentRepository.class).findByDateOfBirth(dateofBirth);

	}

	/*
	 * Get Students by Admission Number
	 */
	@RequestMapping(value = "/students/adm/{admissionNumber}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudentsByAdmissionNumber(@PathVariable("admissionNumber") String admissionNumber) {
		return domainService.getRepository(StudentRepository.class).findByadmissionNumber(admissionNumber);

	}

	/*
	 * Get Students by Father
	 */
	@RequestMapping(value = "/students/father/{father}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudentsByFather(@PathVariable("father") String father) {
		return domainService.getRepository(StudentRepository.class).findByFather(father);

	}

	/*
	 * Get Students by Mother
	 */
	@RequestMapping(value = "/students/mother/{mother}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudentsByMother(@PathVariable("mother") String mother) {
		return domainService.getRepository(StudentRepository.class).findByMother(mother);

	}

	/*
	 * Search students by last name match
	 */
	@RequestMapping(value = "/students/lns/{lastname}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> searchStudentsByLastNameMatch(@PathVariable("lastname") String lastname) {
		return domainService.searchStudentsByLastName(lastname);

	}

	/*
	 * Search students by first name match
	 */
	@RequestMapping(value = "/students/fns/{firstname}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> searchStudentsByFirstNameMatch(@PathVariable("firstname") String firstname) {
		return domainService.searchStudentsByFirstName(firstname);

	}

	/*
	 * Search students by Birth date
	 */
	@RequestMapping(value = "/students/month/{month}/date/{date}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> searchStudentsByBirthDate(@PathVariable("month") int month, @PathVariable("date") int date) {
		return domainService.searchStudentsBirthDate(month, date);

	}

	/*
	 * Find students by class
	 */
	@RequestMapping(value = "/students/class/{classId}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudentsByBirthDate(@PathVariable("classId") String classId) {
		return domainService.getRepository(StudentRepository.class).findByClassId(classId);

	}

	/*
	 * Get Student Account
	 */
	@RequestMapping(value = "/studentaccount/id/{studentid}", method = RequestMethod.GET)
	@ResponseBody
	public List<StudentAccountActivity> getStudentAccountByStudentId(@PathVariable("studentid") String studentid) {
		return domainService.getRepository(StudentAccountRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Activity
	 */
	@RequestMapping(value = "/studentactivity/id/{studentid}", method = RequestMethod.GET)
	@ResponseBody
	public List<StudentNotes> getStudentActivityByStudentId(@PathVariable("studentid") String studentid) {
		return domainService.getRepository(StudentActivitytRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Attendance
	 */
	@RequestMapping(value = "/studentattenddence/id/{studentid}", method = RequestMethod.GET)
	@ResponseBody
	public List<StudentAttendance> getStudentAttendanceByStudentId(@PathVariable("studentid") String studentid) {
		return domainService.getRepository(StudentAttendanceRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Marks
	 */
	@RequestMapping(value = "/studentmarks/id/{studentid}", method = RequestMethod.GET)
	@ResponseBody
	public List<StudentMarks> getStudentMarksByStudentId(@PathVariable("studentid") String studentid) {
		return domainService.getRepository(StudentMarksRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Promotion
	 */
	@RequestMapping(value = "/studentpromotion/id/{studentid}", method = RequestMethod.GET)
	@ResponseBody
	public List<StudentPromotion> getStudentPromotionByStudentId(@PathVariable("studentid") String studentid) {
		return domainService.getRepository(StudentPromotionRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Record
	 */
	@RequestMapping(value = "/studentrecord/id/{studentid}", method = RequestMethod.GET)
	@ResponseBody
	public List<StudentRecord> getStudentRecordByStudentId(@PathVariable("studentid") String studentid) {
		return domainService.getRepository(StudentRecordRepository.class).findByStudent(studentid);

	}

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

	@RequestMapping(value = "/student", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Student saveStudent(@Valid @RequestBody Student student) {
		return domainService.getRepository(StudentRepository.class).save(student);

	}

	/*
	 * Save Student Attendance
	 */
	@RequestMapping(value = "/student/attendance", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public StudentAttendance saveStudentAttendance(@Validated @RequestBody StudentAttendance studentattendance) {
		return domainService.getRepository(StudentAttendanceRepository.class).save(studentattendance);

	}

	/*
	 * Save Student Marks
	 */
	@RequestMapping(value = "/student/marks", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public StudentMarks saveStudentMarks(@Validated @RequestBody StudentMarks studentMarks) {
		return domainService.getRepository(StudentMarksRepository.class).save(studentMarks);

	}

	/*
	 * Save Student Promotion
	 */
	@RequestMapping(value = "/student/promotion", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public StudentPromotion saveStudentPromotion(@Validated @RequestBody StudentPromotion studentPromotion) {
		return domainService.getRepository(StudentPromotionRepository.class).save(studentPromotion);

	}

}
