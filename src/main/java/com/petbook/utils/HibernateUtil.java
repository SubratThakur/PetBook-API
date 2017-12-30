package com.petbook.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate - AnnotationConfiguration deprecated
 *"All functionality has been moved to Configuration": http://docs.jboss.org/hibernate/core/3.6/javadocs/org/hibernate/cfg/AnnotationConfiguration.html
 * And here is Configuration:
 * http://docs.jboss.org/hibernate/core/3.6/javadocs/org/hibernate/cfg/Configuration.html
 * 
 * => Solution
 * In Hibernate 3.6, “org.hibernate.cfg.AnnotationConfiguration” is deprecated, and all its functionality has been moved to “org.hibernate.cfg.Configuration“.
 * So , you can safely replace your “AnnotationConfiguration” with “Configuration” class.

 * Even AnnotationConfiguration get deprectaed in Hibernate 4
 * Replace your SessionFactory with the following:

		In Hibernate 4.0, 4.1, 4.2
		
		private static SessionFactory sessionFactory;
		private static ServiceRegistry serviceRegistry;
		
		public static SessionFactory createSessionFactory() {
		    Configuration configuration = new Configuration();
		    configuration.configure();
		    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
		            configuration.getProperties()). buildServiceRegistry();
		    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		    return sessionFactory;
		}
		
		UPDATE:
		In Hibernate 4.3 ServiceRegistryBuilder is deprecated. Use the following instead.
		
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
		            configuration.getProperties()).build();

 * @author subratthakur
 *
 */

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration configuration = new Configuration();
		    configuration.configure();
		    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
		    	applySettings(configuration.getProperties());
		    sessionFactory= configuration.buildSessionFactory(builder.build());

		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
