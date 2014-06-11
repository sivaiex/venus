package com.iexsoft.staff;

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

import com.iexsoft.domain.Staff;
import com.iexsoft.repositories.StaffRepository;
import com.iexsoft.service.DomainService;


@MountPath(value = "staff")
public class StaffPage extends WebPage {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(StaffPage.class);

	@SpringBean
	DomainService domainService;

	public StaffPage(final PageParameters parameters) {
		super(parameters);

		Staff staff = new Staff();

		StaffForm staffForm = new StaffForm("staffForm");
		staffForm.setDefaultModel(new CompoundPropertyModel<Staff>(staff));
		add(staffForm);
	}

	class StaffForm extends Form<Staff> {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		

		public StaffForm(String id) {
			super(id);

			TextField<String> firstNameField = new TextField<String>("firstName");
			firstNameField.add(new PropertyValidator<String>());
			
			TextField<String> lastNameField = new TextField<String>("lastName");
			lastNameField.add(new PropertyValidator<String>());
			
			TextField<Date> genderField = new TextField<Date>("sex");
			genderField.add(new PropertyValidator<String>());
			

			add(firstNameField);
			add(lastNameField);
			add(genderField);
		
			add(new FeedbackPanel("feedback"));

		}

		public final void onSubmit() {

			Staff staff = getModelObject();
			
			//domainService.getStaffRepository().save(staff);
			domainService.getRepository(StaffRepository.class).save(staff);			
			

			log.debug("Staff name:" + staff.getFirstName());
			setResponsePage(StaffListPage.class);

		}
	}
}
