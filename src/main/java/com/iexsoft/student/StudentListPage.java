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
import com.iexsoft.school.SchoolPage;
import com.iexsoft.service.DomainService;

@MountPath(value = "student/list")
public class StudentListPage extends WebPage {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(StudentListPage.class);

	@SpringBean
	DomainService domainService;

	public StudentListPage(final PageParameters parameters) {
		super(parameters);

		List<Student> studentList = domainService.getStudentRepository()
				.findAll();
	
		
		ListDataProvider<Student> listDataProvider = new ListDataProvider<Student>(studentList);

		
        DataView<Student> dataView = new DataView<Student>("rows", listDataProvider) {
			
			@Override
			protected void populateItem(Item<Student> item) {
				Student student = item.getModelObject();
				item.setModel(new CompoundPropertyModel(student));
                item.add(new Label("id"));
                item.add(new Label("firstName"));
                item.add(new Label("lastName"));
			}
		};
		
		add(dataView);
		add(getStudentLink());
	}
	
	 private Link getStudentLink(){
	    	Link link = new Link("createStudent") {
	    		
	    		@Override
	    		public void onClick() {
	    			setResponsePage(StudentPage.class);
	    			
	    		}
			};
			return link;
	    }

}
