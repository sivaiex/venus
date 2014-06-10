package com.iexsoft.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.iexsoft.config.ConfigData;
import com.iexsoft.repositories.ClassTypeRepository;
import com.iexsoft.repositories.FeeConcessionRepository;
import com.iexsoft.repositories.FeePaidStatusRepository;
import com.iexsoft.repositories.FeeRepository;
import com.iexsoft.repositories.FeeTypeRepository;
import com.iexsoft.repositories.ParentRepository;
import com.iexsoft.repositories.RoleRepository;
import com.iexsoft.repositories.SchoolRepository;
import com.iexsoft.repositories.StaffTypeRepository;
import com.iexsoft.repositories.StudentAttendanceStatusRepository;
import com.iexsoft.repositories.StudentRecordRepository;
import com.iexsoft.repositories.StudentRepository;
import com.iexsoft.repositories.StudyClassRepository;
import com.iexsoft.repositories.SubjectRepository;
import com.iexsoft.repositories.TestTypeRepository;

@Service
public class DomainService {
	private static Logger log = LoggerFactory.getLogger(DomainService.class);

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
	private ParentRepository parentRepository;

	@Autowired
	private StudyClassRepository studyClassRepository;

	@Autowired
	private StudentRecordRepository studentRecordRepository;
	
	@Autowired
	private FeeRepository feeRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	/*
	 * Any pre-loading of configuration data etc..
	 */
	@PostConstruct
	private void init() {
		log.debug("Initializing application....");
		// Roles
		if (roleRepository.findAll().size() == 0) {
			log.debug("Loading Default Roles ....");
			roleRepository.save(ConfigData.getAllDefaultRoles());
		}
		// Staff Type
		if (staffTypeRepository.findAll().size() == 0) {
			log.debug("Loading Default Staff Types ....");
			staffTypeRepository.save(ConfigData.getAllDefaultStaffTypes());
		}
		// Class Type
		if (classTypeRepository.findAll().size() == 0) {
			log.debug("Loading Default Class Types  ....");
			classTypeRepository.save(ConfigData.getAllDefaultClassTypes());
		}
		// Fee Type
		if (feeTypeRepository.findAll().size() == 0) {
			log.debug("Loading Default Fee Types ....");
			feeTypeRepository.save(ConfigData.getAllDefaultFeeTypes());
		}
		// Test Type
		if (testTypeRepository.findAll().size() == 0) {
			log.debug("Loading Default Test Types ....");
			testTypeRepository.save(ConfigData.getAllDefaultTestTypes());
		}
		// Fee Paid Status
		if (feePaidStatusRepository.findAll().size() == 0) {
			log.debug("Loading Default Fee Paid Statuses ....");
			feePaidStatusRepository.save(ConfigData
					.getAllDefaultFeePaidStatus());
		}
		// Student Attendance Status
		if (studentAttendanceStatusRepository.findAll().size() == 0) {
			log.debug("Loading Default Attendance Status ....");
			studentAttendanceStatusRepository.save(ConfigData
					.getAllDefaultStudentAttendanceStatus());
		}
		// Subject
		if (subjectRepository.findAll().size() == 0) {
			log.debug("Loading Default Subjects ....");
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

	public FeeConcessionRepository getFeeConcessionRepository() {
		return feeConcessionRepository;
	}

	public FeePaidStatusRepository getFeePaidStatusRepository() {
		return feePaidStatusRepository;
	}

	public FeeTypeRepository getFeeTypeRepository() {
		return feeTypeRepository;
	}

	public RoleRepository getRoleRepository() {
		return roleRepository;
	}

	public StaffTypeRepository getStaffTypeRepository() {
		return staffTypeRepository;
	}

	public StudentAttendanceStatusRepository getStudentAttendanceStatusRepository() {
		return studentAttendanceStatusRepository;
	}

	public SubjectRepository getSubjectRepository() {
		return subjectRepository;
	}

	public TestTypeRepository getTestTypeRepository() {
		return testTypeRepository;
	}

	public ParentRepository getParentRepository() {
		return parentRepository;
	}

	public StudyClassRepository getStudyClassRepository() {
		return studyClassRepository;
	}

	public StudentRecordRepository getStudentRecordRepository() {
		return studentRecordRepository;
	}

	public FeeRepository getFeeRepository() {
		return feeRepository;
	}
	
	

}
