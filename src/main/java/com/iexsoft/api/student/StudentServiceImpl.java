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
   @Override
	public List<Student> getStudents() {
		return domainService.getRepository(StudentRepository.class).findAll();

	}

   @Override
	public List<Student> getStudentsByLastName(String surname) {
		return domainService.getRepository(StudentRepository.class).findByLastName(surname);

	}
    
   @Override
	public List<Student> getStudentsByFirstName(String firstname) {
		return domainService.getRepository(StudentRepository.class).findByFirstName(firstname);

	}

	/*
	 * Get Students by Date of Birth
	 */
    @Override
	public List<Student> getStudentsByDOB(Date dateofBirth) {
		return domainService.getRepository(StudentRepository.class).findByDateOfBirth(dateofBirth);

	}

	/*
	 * Get Students by Admission Number
	 */

    @Override
	public Student getStudentByAdmissionNumber(String admissionNumber) {
		return domainService.getRepository(StudentRepository.class).findByadmissionNumber(admissionNumber);

	}

	/*
	 * Get Students by Father
	 */
    @Override
	public List<Student> getStudentsByFather(String father) {
		return domainService.getRepository(StudentRepository.class).findByFather(father);

	}

	/*
	 * Get Students by Mother
	 */
    @Override
	public List<Student> getStudentsByMother( String mother) {
		return domainService.getRepository(StudentRepository.class).findByMother(mother);

	}

	/*
	 * Search students by last name match
	 */
   @Override
	public List<Student> searchStudentsByLastNameMatch(String lastname) {
		return domainService.searchStudentsByLastName(lastname);

	}

	/*
	 * Search students by first name match
	 */
    @Override
	public List<Student> searchStudentsByFirstNameMatch(String firstname) {
		return domainService.searchStudentsByFirstName(firstname);

	}

	/*
	 * Search students by Birth date
	 */
    @Override
	public List<Student> searchStudentsByBirthDate(int month, int date) {
		return domainService.searchStudentsBirthDate(month, date);

	}

	/*
	 * Find students by class
	 */
    @Override
	public List<Student> getStudentsByBirthDate(String classId) {
		return domainService.getRepository(StudentRepository.class).findByClassId(classId);

	}

	/*
	 * Get Student Account
	 */

	


	/*
	 * Get Student Attendance
	 */
    @Override
	public List<StudentAttendance> getStudentAttendanceByStudentId(String studentid) {
		return domainService.getRepository(StudentAttendanceRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Marks
	 */
	@Override
	public List<StudentMarks> getStudentMarksByStudentId(String studentid) {
		return domainService.getRepository(StudentMarksRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Promotion
	 */
	@Override
	public List<StudentPromotion> getStudentPromotionByStudentId(String studentid) {
		return domainService.getRepository(StudentPromotionRepository.class).findByStudent(studentid);

	}

	/*
	 * Get Student Record
	 */

	@Override
	public List<StudentRecord> getStudentRecordByStudentId(String studentid) {
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
	@Override
	public StudentAttendance saveStudentAttendance(StudentAttendance studentattendance) {
		return domainService.getRepository(StudentAttendanceRepository.class).save(studentattendance);

	}

	/*
	 * Save Student Marks
	 */
	@Override
	public StudentMarks saveStudentMarks(StudentMarks studentMarks) {
		return domainService.getRepository(StudentMarksRepository.class).save(studentMarks);

	}

	/*
	 * Save Student Promotion
	 */
	@Override
	public StudentPromotion saveStudentPromotion(StudentPromotion studentPromotion) {
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
