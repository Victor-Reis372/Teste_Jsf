package com.projeto.jsf2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class SessionHibernate5 {

	 private static SessionFactory sessionFactory = getSessionFactory();
	 
	    private static SessionFactory getSessionFactory() {
	    	
	        // Creating a registry
	        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	 
	        // Create the MetadataSources
	        MetadataSources sources = new MetadataSources(registry);
	 
	        // Create the Metadata
	        Metadata metadata = sources.getMetadataBuilder().build();
	 
	        // Create SessionFactory
	        return metadata.getSessionFactoryBuilder().build();
	    }
	 
	    public static Session getSession() {
	    	
	        return sessionFactory.openSession();
	        
	        

	        
}
	    
	    
	    
}



