package com.projeto.jsf2;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@ApplicationScoped

public class ListaCadastro{
	
	
	
	private ManagerBean cadastro;
	private List<ManagerBean> cadastros;
	
	public ListaCadastro() {
		this.cadastros = new ArrayList<ManagerBean>();
		this.cadastro = new ManagerBean();	
	}
	
	
	public void incluir()
	{
		this.cadastros.add(this.cadastro);
		this.cadastro = new ManagerBean();
		
	}

	public ManagerBean getCadastro() {
		return cadastro;
	}


	public List<ManagerBean> getCadastros() {
		return cadastros;
	}

	
	
	
	
}


