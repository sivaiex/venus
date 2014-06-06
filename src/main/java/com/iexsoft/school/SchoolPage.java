
package com.iexsoft.school;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SchoolPage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	private static Logger log = LoggerFactory.getLogger(SchoolPage.class);
	
	
    public SchoolPage(final PageParameters parameters) {
		super(parameters);
		add(new Label("message", "Welcome to school edit page"));
		
    }
    
    
}
