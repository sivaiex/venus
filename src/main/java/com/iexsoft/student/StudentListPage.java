package com.iexsoft.student;

import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wicketstuff.annotation.mount.MountPath;

import com.iexsoft.domain.Student;
import com.iexsoft.repositories.StudentRepository;
import com.iexsoft.service.DomainService;

@MountPath(value = "students")
public class StudentListPage extends WebPage {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(StudentListPage.class);

	@SpringBean
	DomainService domainService;

	public StudentListPage(final PageParameters parameters) {
		super(parameters);
        log.debug("Students list page");
		List<Student> studentList = domainService.getRepository(StudentRepository.class)
				.findAll();
	
		
		ListDataProvider<Student> listDataProvider = new ListDataProvider<Student>(studentList);

		
        DataView<Student> dataView = new DataView<Student>("rows", listDataProvider) {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = -2832173638218470243L;

			@Override
			protected void populateItem(Item<Student> item) {
				Student student = item.getModelObject();
				item.setModel(new CompoundPropertyModel<Student>(student));
                item.add(new Label("id"));
                item.add(new Label("firstName"));
                item.add(new Label("lastName"));
			}
		};
		
		add(dataView);
		add(getStudentLink());
	}
	
	 private Link<Student> getStudentLink(){
	    	Link<Student> link = new Link<Student>("createStudent") {
	    		
	    		/**
				 * 
				 */
				private static final long serialVersionUID = -30276803280453838L;

				@Override
	    		public void onClick() {
	    			setResponsePage(StudentPage.class);
	    			
	    		}
			};
			return link;
	    }

}
