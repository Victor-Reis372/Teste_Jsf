package com.hibernate;

import org.hibernate.Session;
import com.projeto.jsf2.SessionHibernate5;
import com.projeto.jsf2.ManagerBean;
import java.util.List;

public class TesteHibernate {
	
	
	

	public static void main(String[] args) {
		
		Session session = SessionHibernate5.getSession();
		

		/*
		List<ManagerBean> cadastros = session();
		
		
		for(ManagerBean p : cadastros) { System.out.printf(p.getNome(),p.getEmail(),p.getSenha());}

		
		*/
		
		session.close();
	}

	
	
}
	


