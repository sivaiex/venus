package com.iexsoft.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.iexsoft.config.ConfigData;
import com.iexsoft.repositories.ClassTypeRepository;
import com.iexsoft.repositories.FeeConcessionRepository;
import com.iexsoft.repositories.FeePaidStatusRepository;
import com.iexsoft.repositories.FeeTypeRepository;
import com.iexsoft.repositories.RoleRepository;
import com.iexsoft.repositories.SchoolRepository;
import com.iexsoft.repositories.StaffTypeRepository;
import com.iexsoft.repositories.StudentAttendanceStatusRepository;
import com.iexsoft.repositories.StudentRepository;
import com.iexsoft.repositories.SubjectRepository;
import com.iexsoft.repositories.TestTypeRepository;

@Service
public class DomainService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private SchoolRepository schoolRepository;

	@Autowired
	private ClassTypeRepository classTypeRepository;

	@Autowired
	private FeeConcessionRepository feeConcessionRepository;

	@Autowired
	private FeePaidStatusRepository feePaidStatusRepository;

	@Autowired
	private FeeTypeRepository feeTypeRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private StaffTypeRepository staffTypeRepository;

	@Autowired
	private StudentAttendanceStatusRepository studentAttendanceStatusRepository;

	@Autowired
	private SubjectRepository subjectRepository;

	@Autowired
	private TestTypeRepository testTypeRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	/*
	 * Any pre-loading of configuration data etc..
	 */
	@PostConstruct
	private void init() {
		// Roles
		if (roleRepository.findAll().size() == 0) {
			roleRepository.save(ConfigData.getAllDefaultRoles());
		}
		//Staff Type
		if (staffTypeRepository.findAll().size() == 0) {
			staffTypeRepository.save(ConfigData.getAllDefaultStaffTypes());
		}
		//Class Type
		if (classTypeRepository.findAll().size() == 0) {
			classTypeRepository.save(ConfigData.getAllDefaultClassTypes());
		}
		//Fee Type
		if (feeTypeRepository.findAll().size() == 0) {
			feeTypeRepository.save(ConfigData.getAllDefaultFeeTypes());
		}
		//Test Type
		if (testTypeRepository.findAll().size() == 0) {
			testTypeRepository.save(ConfigData.getAllDefaultTestTypes());
		}
		//Fee Paid Status
		if (feePaidStatusRepository.findAll().size() == 0) {
			feePaidStatusRepository.save(ConfigData.getAllDefaultFeePaidStatus());
		}
		//Student Attendance Status
		if (studentAttendanceStatusRepository.findAll().size() == 0) {
			studentAttendanceStatusRepository.save(ConfigData.getAllDefaultStudentAttendanceStatus());
		}
		//Subject
		if (subjectRepository.findAll().size() == 0) {
			subjectRepository.save(ConfigData.getAllDefaultSubjects());
		}

	}

	/*
	 * all the getter methods to repositories
	 */
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public SchoolRepository getSchoolRepository() {
		return schoolRepository;
	}

	public ClassTypeRepository getClassTypeRepository() {
		return classTypeRepository;
	}

	public void setClassTypeRepository(ClassTypeRepository classTypeRepository) {
		this.classTypeRepository = classTypeRepository;
	}

	public FeeConcessionRepository getFeeConcessionRepository() {
		return feeConcessionRepository;
	}

	public void setFeeConcessionRepository(
			FeeConcessionRepository feeConcessionRepository) {
		this.feeConcessionRepository = feeConcessionRepository;
	}

	public FeePaidStatusRepository getFeePaidStatusRepository() {
		return feePaidStatusRepository;
	}

	public void setFeePaidStatusRepository(
			FeePaidStatusRepository feePaidStatusRepository) {
		this.feePaidStatusRepository = feePaidStatusRepository;
	}

	public FeeTypeRepository getFeeTypeRepository() {
		return feeTypeRepository;
	}

	public void setFeeTypeRepository(FeeTypeRepository feeTypeRepository) {
		this.feeTypeRepository = feeTypeRepository;
	}

	public RoleRepository getRoleRepository() {
		return roleRepository;
	}

	public void setRoleRepository(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public StaffTypeRepository getStaffTypeRepository() {
		return staffTypeRepository;
	}

	public void setStaffTypeRepository(StaffTypeRepository staffTypeRepository) {
		this.staffTypeRepository = staffTypeRepository;
	}

	public StudentAttendanceStatusRepository getStudentAttendanceStatusRepository() {
		return studentAttendanceStatusRepository;
	}

	public void setStudentAttendanceStatusRepository(
			StudentAttendanceStatusRepository studentAttendanceStatusRepository) {
		this.studentAttendanceStatusRepository = studentAttendanceStatusRepository;
	}

	public SubjectRepository getSubjectRepository() {
		return subjectRepository;
	}

	public void setSubjectRepository(SubjectRepository subjectRepository) {
		this.subjectRepository = subjectRepository;
	}

	public TestTypeRepository getTestTypeRepository() {
		return testTypeRepository;
	}

	public void setTestTypeRepository(TestTypeRepository testTypeRepository) {
		this.testTypeRepository = testTypeRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public void setSchoolRepository(SchoolRepository schoolRepository) {
		this.schoolRepository = schoolRepository;
	}

}
