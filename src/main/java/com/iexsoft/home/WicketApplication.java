
package com.iexsoft.home;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.bean.validation.BeanValidationConfiguration;
import org.wicketstuff.annotation.scan.AnnotatedMountScanner;


/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see com.iexsoft.home.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{    	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<HomePage> getHomePage()
	{
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();
		
		getComponentInstantiationListeners().add(new SpringComponentInjector(this));
		new BeanValidationConfiguration().configure(this);
		new AnnotatedMountScanner().scanPackage("com.iexsoft").mount(this);
	}
}
