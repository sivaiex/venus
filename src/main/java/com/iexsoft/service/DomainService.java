package com.iexsoft.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.meta.When;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.iexsoft.config.ConfigData;
import com.iexsoft.domain.Parent;
import com.iexsoft.domain.Student;
import com.iexsoft.repositories.ClassTimeTableRepository;
import com.iexsoft.repositories.ClassTypeRepository;
import com.iexsoft.repositories.FeeConcessionRepository;
import com.iexsoft.repositories.FeePaidStatusRepository;
import com.iexsoft.repositories.FeeRepository;
import com.iexsoft.repositories.FeeTypeRepository;
import com.iexsoft.repositories.ParentRepository;
import com.iexsoft.repositories.PhotoRepository;
import com.iexsoft.repositories.PhotoTypeRepository;
import com.iexsoft.repositories.RoleRepository;
import com.iexsoft.repositories.SchoolRepository;
import com.iexsoft.repositories.StaffRepository;
import com.iexsoft.repositories.StaffTypeRepository;
import com.iexsoft.repositories.StudentAccountActivityRepository;
import com.iexsoft.repositories.StudentAttendanceStatusRepository;
import com.iexsoft.repositories.StudentMarksRepository;
import com.iexsoft.repositories.StudentPromotionRepository;
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
	private StaffRepository staffRepository;

	@Autowired
	private StudyClassRepository studyClassRepository;

	@Autowired
	private StudentRecordRepository studentRecordRepository;

	@Autowired
	private FeeRepository feeRepository;

	@Autowired
	private ClassTimeTableRepository classTimeTableRepository;

	@Autowired
	private StudentAccountActivityRepository studentAccountActivityRepository;

	@Autowired
	private StudentMarksRepository studentMarksRepository;

	@Autowired
	private StudentPromotionRepository studentPromotionRepository;

	@Autowired
	private PhotoRepository photoRepository;
	
	@Autowired
	private PhotoTypeRepository photoTypeRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	@SuppressWarnings("rawtypes")
	private Map<String, MongoRepository> repoMap;
	/*
	 * Any pre-loading of configuration data etc..
	 */
	@SuppressWarnings("rawtypes")
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
			feePaidStatusRepository.save(ConfigData.getAllDefaultFeePaidStatus());
		}
		// Student Attendance Status
		if (studentAttendanceStatusRepository.findAll().size() == 0) {
			log.debug("Loading Default Attendance Status ....");
			studentAttendanceStatusRepository.save(ConfigData.getAllDefaultStudentAttendanceStatus());
		}
		// Subject
		if (subjectRepository.findAll().size() == 0) {
			log.debug("Loading Default Subjects ....");
			subjectRepository.save(ConfigData.getAllDefaultSubjects());
		}

		// Photo
		if (photoTypeRepository.findAll().size() == 0) {
			log.debug("Loading Default PhotoTypes ....");
			photoTypeRepository.save(ConfigData.getAllDefaultPhotoTypes());
		}

		// Adding all repos to Map, so that we can easily retrieve the required
		// repository
		log.debug("adding all repos to repoMap....");
		repoMap = new HashMap<String, MongoRepository>();

		repoMap.put(StudentRepository.class.getName(), studentRepository);
		repoMap.put(SchoolRepository.class.getName(), schoolRepository);
		repoMap.put(ClassTypeRepository.class.getName(), classTypeRepository);
		repoMap.put(FeeConcessionRepository.class.getName(), feeConcessionRepository);
		repoMap.put(FeePaidStatusRepository.class.getName(), feePaidStatusRepository);
		repoMap.put(FeeTypeRepository.class.getName(), feeTypeRepository);
		repoMap.put(RoleRepository.class.getName(), roleRepository);
		repoMap.put(StaffTypeRepository.class.getName(), staffTypeRepository);
		repoMap.put(StudentAttendanceStatusRepository.class.getName(), studentAttendanceStatusRepository);
		repoMap.put(SubjectRepository.class.getName(), subjectRepository);
		repoMap.put(TestTypeRepository.class.getName(), testTypeRepository);
		repoMap.put(ParentRepository.class.getName(), parentRepository);

		repoMap.put(StaffRepository.class.getName(), staffRepository);

		repoMap.put(StudyClassRepository.class.getName(), studyClassRepository);
		repoMap.put(StudentRecordRepository.class.getName(), studentRecordRepository);
		repoMap.put(FeeRepository.class.getName(), feeRepository);
		repoMap.put(StudentAccountActivityRepository.class.getName(), studentAccountActivityRepository);
		repoMap.put(ClassTimeTableRepository.class.getName(), classTimeTableRepository);
		repoMap.put(StudentMarksRepository.class.getName(), studentMarksRepository);
		repoMap.put(StudentPromotionRepository.class.getName(), studentPromotionRepository);
		repoMap.put(PhotoRepository.class.getName(), photoRepository);
		repoMap.put(PhotoTypeRepository.class.getName(), photoTypeRepository);

	}

	public <T> T getRepository(final Class<T> type) {
		return type.cast(repoMap.get(type.getName()));
	}

	/*
	 * All Mongo complex Query APIS
	 */

	public List<Student> searchStudentsByLastName(String lastname) {
		Query query = new Query(Criteria.where("lastName").regex("/"+lastname+"/"));
	    return mongoTemplate.find(query, Student.class);
	}

	public List<Student> searchStudentsByFirstName(String firstname) {
		Query query = new Query(Criteria.where("firstName").regex("/"+firstname+"/"));
	    return mongoTemplate.find(query, Student.class);

	}

	public List<Student> searchStudentsBirthDate(int month, int date) {
		//Query query = new Query(Criteria.where("lastName").regex("/"+lastname+"/"));
	   // return mongoTemplate.find(query, Student.class);
		return null;

	}

	public List<Parent> searchParentsByLastName(String lastname) {
		Query query = new Query(Criteria.where("lastName").regex("/"+lastname+"/"));
	    return mongoTemplate.find(query, Parent.class);

	}

	public List<Parent> searchParentsByFirstName(String firstname) {
		Query query = new Query(Criteria.where("firstName").regex("/"+firstname+"/"));
	    return mongoTemplate.find(query, Parent.class);

	}
	
	
}
