package com.iexsoft.student;

import java.util.Date;

import org.apache.wicket.bean.validation.PropertyValidator;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wicketstuff.annotation.mount.MountPath;

import com.iexsoft.domain.Student;
import com.iexsoft.service.DomainService;


@MountPath(value = "student")
public class StudentPage extends WebPage {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(StudentPage.class);

	@SpringBean
	DomainService domainService;

	public StudentPage(final PageParameters parameters) {
		super(parameters);

		Student student = new Student();

		StudentForm studentForm = new StudentForm("studentForm");
		studentForm.setDefaultModel(new CompoundPropertyModel<Student>(student));
		add(studentForm);
	}

	class StudentForm extends Form<Student> {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		

		public StudentForm(String id) {
			super(id);

			TextField<String> firstNameField = new TextField<String>("firstName");
			firstNameField.add(new PropertyValidator<String>());
			
			TextField<String> lastNameField = new TextField<String>("lastName");
			lastNameField.add(new PropertyValidator<String>());
			
			TextField<Date> dobField = new TextField<Date>("dateOfBirth");
			dobField.add(new PropertyValidator<String>());
			

			add(firstNameField);
			add(lastNameField);
			add(dobField);
		
			add(new FeedbackPanel("feedback"));

		}

		public final void onSubmit() {

			Student student = getModelObject();
			domainService.getStudentRepository().save(student);

			log.debug("student name:" + student.getFirstName());
			setResponsePage(StudentListPage.class);

		}
	}
}
