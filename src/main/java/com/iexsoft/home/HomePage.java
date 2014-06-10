
package com.iexsoft.home;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wicketstuff.annotation.mount.MountPath;

import com.iexsoft.domain.Parent;
import com.iexsoft.domain.School;
import com.iexsoft.domain.Student;
import com.iexsoft.parent.ParentListPage;
import com.iexsoft.school.SchoolPage;
import com.iexsoft.student.StudentListPage;

@MountPath(value = "dashboard")
public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	private static Logger log = LoggerFactory.getLogger(HomePage.class);
	
	
    public HomePage(final PageParameters parameters) {
		super(parameters);
		log.debug("Default Home Page");
		add(new Label("header", "Here the Header HTML GOES..."));
		add(new Label("message", "Welcome to Venus"));
		add(getSchoolLink());
		add(getStudentListLink());
		add(getParentListLink());
		add(new Label("footer", "@copy right, iexsoft LLC, 2014"));
		
		
    }
    
    private Link<School> getSchoolLink(){
    	Link<School> link = new Link<School>("createSchool") {
    		
    		/**
			 * 
			 */
			private static final long serialVersionUID = -8845475700383712203L;

			@Override
    		public void onClick() {
    			setResponsePage(SchoolPage.class);
    			
    		}
		};
		return link;
    }
    
    
    
    private Link<Student> getStudentListLink(){
    	Link<Student> link = new Link<Student>("studentList") {
    		
    		/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
    		public void onClick() {
    			setResponsePage(StudentListPage.class);
    			
    		}
		};
		return link;
    }
    
    private Link<Parent> getParentListLink(){
    	Link<Parent> link = new Link<Parent>("parentList") {
    		
    		/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
    		public void onClick() {
    			setResponsePage(ParentListPage.class);
    			
    		}
		};
		return link;
    }
}
