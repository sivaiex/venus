package com.iexsoft.parent;

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

import com.iexsoft.domain.Parent;
import com.iexsoft.repositories.ParentRepository;
import com.iexsoft.service.DomainService;


@MountPath(value = "parent")
public class ParentPage extends WebPage {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(ParentPage.class);

	@SpringBean
	DomainService domainService;

	public ParentPage(final PageParameters parameters) {
		super(parameters);

		Parent parent = new Parent();

		ParentForm parentForm = new ParentForm("parentForm");
		parentForm.setDefaultModel(new CompoundPropertyModel<Parent>(parent));
		add(parentForm);
	}

	class ParentForm extends Form<Parent> {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		

		public ParentForm(String id) {
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

			Parent parent = getModelObject();
			domainService.getRepository(ParentRepository.class).save(parent);

			log.debug("student name:" + parent.getFirstName());
			setResponsePage(ParentListPage.class);

		}
	}
}
