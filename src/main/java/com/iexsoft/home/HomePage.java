
package com.iexsoft.home;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iexsoft.school.SchoolPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	private static Logger log = LoggerFactory.getLogger(HomePage.class);
	
	
    public HomePage(final PageParameters parameters) {
		super(parameters);
		
		add(new Label("header", "Here the Header HTML GOES..."));
		add(new Label("message", "Welcome to Venus"));
		add(getSchoolLink());
		add(new Label("footer", "@copy right, iexsoft LLC, 2014"));
		
		
    }
    
    private Link getSchoolLink(){
    	Link link = new Link("createSchool") {
    		
    		@Override
    		public void onClick() {
    			setResponsePage(SchoolPage.class);
    			
    		}
		};
		return link;
    }
}
