package com.mtouche.locationservice.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.util.ClassUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletInitializer extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.scan(ClassUtils.getPackageName(getClass()));
        return context;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }

}

/*implements WebApplicationInitializer {

//@Override
public void onStartup(ServletContext servletContext) throws ServletException {
	System.out.println("Inside application initializer...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    //WebApplicationContext context = getContext();
    //servletContext.addListener(new ContextLoaderListener(context));
	//Registering the class that incorporates the annotated DispatcherServlet configuration of spring
    AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
    //rootContext.register(DispatcherConfig.class);
    rootContext.setConfigLocation("com.mtouche.locationservice.config");

  //Adding the listener for the rootContext
    servletContext.addListener(new ContextLoaderListener(rootContext));

    ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(rootContext));
    dispatcher.setLoadOnStartup(1);
    dispatcher.addMapping("/");
}

private AnnotationConfigWebApplicationContext getContext() {
	System.out.println("Inside application initializer...BBBBBBBBBBBBBBBBBBBBBBBBBBBB");
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.setConfigLocation("com.mtouche.locationservice.config");
    return context;
}
}*/
