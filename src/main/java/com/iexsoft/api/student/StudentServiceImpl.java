package com.iexsoft.api.student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.iexsoft.api.util.FieldError;
import com.iexsoft.domain.Student;
import com.iexsoft.domain.StudentAccountActivity;
import com.iexsoft.domain.StudentAttendance;
import com.iexsoft.domain.StudentCredit;
import com.iexsoft.domain.StudentMarks;
import com.iexsoft.domain.StudentNotes;
import com.iexsoft.domain.StudentPromotion;
import com.iexsoft.domain.StudentRecord;
import com.iexsoft.repositories.StudentAttendanceRepository;
import com.iexsoft.repositories.StudentMarksRepository;
import com.iexsoft.repositories.StudentPromotionRepository;
import com.iexsoft.repositories.StudentRecordRepository;
import com.iexsoft.repositories.StudentRepository;
import com.iexsoft.service.DomainService;

public class StudentServiceImpl implements StudentService {

	private static final Logger LOG = LoggerFactory.getLogger(StudentServiceImpl.class);

	@Autowired
	DomainService domainService;

	@Autowired
	private ObjectMapper objectMapper;

	/*
	 * Get all Students, probably we may not using this method because is going
	 * to return all students list in school
	 */

	public List<Student> getStudents() {
		return domainService.getRepository(StudentRepository.class).findAll();

	}

	public List<Student> getStudentsByLastName(@PathVariable("lastname") String surname) {
		return domainService.getRepository(StudentRepository.class).findByLastName(surname);

	}

	public List<Student> getStudentsByFirstName(@PathVariable("firstname") String firstname) {
		return domainService.getRepository(StudentRepository.class).findByFirstName(firstname);

	}

	/*
	 * Get Students by Date of Birth
	 */

	public List<Student> getStudentsByDOB(@PathVariable("dateOfBirth") Date dateofBirth) {
		return domainService.getRepository(StudentRepository.class).findByDateOfBirth(dateofBirth);

	}

	/*
	 * Get Students by Admission Number
	 */

	public Student getStudentByAdmissionNumber(@PathVariable("admissionNumber") String admissionNumber) {
		return domainService.getRepository(StudentRepository.class).findByadmissionNumber(admissionNumber);

	}

	/*
	 * Get Students by Father
	 */

	public List<Student> getStudentsByFather(@PathVariable("father") String father) {
		return domainService.getRepository(StudentRepository.class).findByFather(father);

	}

	/*
	 * Get Students by Mother
	 */

	public List<Student> getStudentsByMother(@PathVariable("mother") String mother) {
		return domainService.getRepository(StudentRepository.class).findByMother(mother);

	}

	/*
	 * Search students by last name match
	 */

	public List<Student> searchStudentsByLastNameMatch(@PathVariable("lastname") String lastname) {
		return domainService.searchStudentsByLastName(lastname);

	}

	/*
	 * Search students by first name match
	 */

	public List<Student> searchStudentsByFirstNameMatch(@PathVariable("firstname") String firstname) {
		return domainService.searchStudentsByFirstName(firstname);

	}

	/*
	 * Search students by Birth date
	 */

	public List<Student> searchStudentsByBirthDate(@PathVariable("month") int month, @PathVariable("date") int date) {
		return domainService.searchStudentsBirthDate(month, date);

	}

	/*
	 * Find students by class
	 */

	public List<Student> getStudentsByBirthDate(@PathVariable("classId") String classId) {
		return domainService.getRepository(StudentRepository.class).findByClassId(classId);

	}

	/*
	 * Get Student Account
	 */

	


	/*
	 * Get Student Attendance
	 */

	public List<StudentAttendance> getStudentAttendanceByStudentId(@PathVariable("studentid") String studentid) {
		return domainService.getRepository(StudentAttendanceRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Marks
	 */

	public List<StudentMarks> getStudentMarksByStudentId(@PathVariable("studentid") String studentid) {
		return domainService.getRepository(StudentMarksRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Promotion
	 */

	public List<StudentPromotion> getStudentPromotionByStudentId(@PathVariable("studentid") String studentid) {
		return domainService.getRepository(StudentPromotionRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Record
	 */

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

	@Override
	public Student saveStudent(Student student) {
		List<FieldError> errors = validate(student);
		if (errors.size() > 0) {
			String errormessage = "";
			try {
				errormessage = objectMapper.writeValueAsString(errors);
			} catch (Exception e) {
			}
			throw new StudentServiceException(Response.Status.BAD_REQUEST, errormessage);
		}

		return domainService.getRepository(StudentRepository.class).save(student);

	}

	/*
	 * Save Student Attendance
	 */

	public StudentAttendance saveStudentAttendance(@Validated @RequestBody StudentAttendance studentattendance) {
		return domainService.getRepository(StudentAttendanceRepository.class).save(studentattendance);

	}

	/*
	 * Save Student Marks
	 */

	public StudentMarks saveStudentMarks(@Validated @RequestBody StudentMarks studentMarks) {
		return domainService.getRepository(StudentMarksRepository.class).save(studentMarks);

	}

	/*
	 * Save Student Promotion
	 */

	public StudentPromotion saveStudentPromotion(@Validated @RequestBody StudentPromotion studentPromotion) {
		return domainService.getRepository(StudentPromotionRepository.class).save(studentPromotion);

	}

	private List<FieldError> validate(Student student) {
		List<FieldError> errorList = new ArrayList<FieldError>();
		if (StringUtils.isBlank(student.getFirstName())) {
			FieldError error = new FieldError();
			error.setField("first_name");
			error.setError("First Name Cannot be Empty");
			errorList.add(error);
		}
		if (StringUtils.isBlank(student.getLastName())) {
			FieldError error = new FieldError();
			error.setField("last_Name");
			error.setError("Surname Cannot be Empty");
			errorList.add(error);
		}

		return errorList;
	}

	

	@Override
	public List<StudentAccountActivity> getStudentAccountActivityByStudentId(String studentid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentNotes> getStudentNotesByStudentId(String studentid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCredit getStudentCreditByStudentId(String studentid) {
		// TODO Auto-generated method stub
		return null;
	}

}
