package com.iexsoft.school;

import java.util.Date;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.bean.validation.PropertyValidator;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

import com.iexsoft.domain.School;
import com.iexsoft.service.DomainService;

public class SchoolPage extends WebPage {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(SchoolPage.class);

	@SpringBean
	DomainService domainService;

	public SchoolPage(final PageParameters parameters) {
		super(parameters);

		List<School> schoolList = domainService.getSchoolRepository()
				.findAll();
		School school = null;

		if (schoolList.size() == 0) {
			school = new School();
		} else {
			school = schoolList.get(0);
		}

		SchoolForm schoolForm = new SchoolForm("schoolForm");
		schoolForm.setDefaultModel(new CompoundPropertyModel<School>(school));
		add(schoolForm);
	}

	class SchoolForm extends Form<School> {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		

		public SchoolForm(String id) {
			super(id);

			TextField<String> nameField = new TextField<String>("name");
			nameField.add(new PropertyValidator<String>());
			TextField<String> regField = new TextField<String>("regNumber");
			TextField<Date> establishedDateField = new TextField<Date>("establishedDate");
			TextField<String> add1Field = new TextField<String>("addressLine1");
			TextField<String> add2Field = new TextField<String>("addressLine2");
			TextField<String> cityField = new TextField<String>("city");
			TextField<String> stateField = new TextField<String>("state");
			TextField<String> postalCodeField = new TextField<String>("postalCode");
			postalCodeField.add(new PropertyValidator<String>());
			TextField<String> phone1Field = new TextField<String>("phoneNumber1");
			TextField<String> phone2Field = new TextField<String>("phoneNumber2");
			TextField<String> emailField = new TextField<String>("email");
			emailField.add(new PropertyValidator<String>());
			

			add(nameField);
			add(regField);
			add(establishedDateField);
			add(add1Field);
			add(add2Field);
			add(cityField);
			add(stateField);
			add(postalCodeField);
			add(phone1Field);
			add(phone2Field);
			add(emailField);
			add(new FeedbackPanel("feedback"));

		}

		public final void onSubmit() {

			School school = getModelObject();
			domainService.getSchoolRepository().save(school);

			log.debug("school name:" + school.getName());

		}
	}
}
