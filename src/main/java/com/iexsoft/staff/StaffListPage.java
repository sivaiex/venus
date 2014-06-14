package com.iexsoft.staff;

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

import com.iexsoft.domain.Staff;
import com.iexsoft.repositories.StaffRepository;
import com.iexsoft.service.DomainService;

@MountPath(value = "staff")
public class StaffListPage extends WebPage {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(StaffListPage.class);

	@SpringBean
	DomainService domainService;b

	public StaffListPage(final PageParameters parameters) {
		super(parameters);
        log.debug("Staff List Page");
       // List<Parent> parentList = domainService.getRepository(ParentRepository.class).findAll();
        List<Staff> staffList = domainService.getRepository(StaffRepository.class).findAll();
		/*List<Staff> staffList = domainService.getStaffRepository()
				.findAll();*/
	
		
		ListDataProvider<Staff> listDataProvider = new ListDataProvider<Staff>(staffList);

		
        DataView<Staff> dataView = new DataView<Staff>("rows", listDataProvider) {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = -2238353777408041417L;

			@Override
			protected void populateItem(Item<Staff> item) {
				Staff staff = item.getModelObject();
				item.setModel(new CompoundPropertyModel<Staff>(staff));
                item.add(new Label("id"));
                item.add(new Label("firstName"));
                item.add(new Label("lastName"));
			}
		};
		
		add(dataView);
		add(getStaffLink());
	}
	
	 private Link<Staff> getStaffLink(){
	    	Link<Staff> link = new Link<Staff>("createStaff") {
	    		
	    		/**
				 * 
				 */
				private static final long serialVersionUID = -905142031447623203L;

				@Override
	    		public void onClick() {
	    			setResponsePage(StaffPage.class);
	    			
	    		}
			};
			return link;
	    }

}
