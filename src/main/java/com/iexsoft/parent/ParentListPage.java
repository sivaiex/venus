package com.iexsoft.parent;

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

import com.iexsoft.domain.Parent;
import com.iexsoft.service.DomainService;

@MountPath(value = "parents")
public class ParentListPage extends WebPage {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(ParentListPage.class);

	@SpringBean
	DomainService domainService;

	public ParentListPage(final PageParameters parameters) {
		super(parameters);
        log.debug("Parent List Page");
		List<Parent> parentList = domainService.getParentRepository()
				.findAll();
	
		
		ListDataProvider<Parent> listDataProvider = new ListDataProvider<Parent>(parentList);

		
        DataView<Parent> dataView = new DataView<Parent>("rows", listDataProvider) {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = -2238353777408041417L;

			@Override
			protected void populateItem(Item<Parent> item) {
				Parent parent = item.getModelObject();
				item.setModel(new CompoundPropertyModel<Parent>(parent));
                item.add(new Label("id"));
                item.add(new Label("firstName"));
                item.add(new Label("lastName"));
			}
		};
		
		add(dataView);
		add(getParentLink());
	}
	
	 private Link<Parent> getParentLink(){
	    	Link<Parent> link = new Link<Parent>("createParent") {
	    		
	    		/**
				 * 
				 */
				private static final long serialVersionUID = -905142031447623203L;

				@Override
	    		public void onClick() {
	    			setResponsePage(ParentPage.class);
	    			
	    		}
			};
			return link;
	    }

}
