package br.com.segchamada.controller;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.segchamada.model.Discipline;
import br.com.segchamada.service.DisciplineService;

@Controller
public class DisciplineController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject DisciplineService service;
	@Inject Result result;
	
	
	@Get ("/discipline")
	public void add() {
		Discipline disciplina = new Discipline("Introdução a Loucura", "CTR2469", null, null, null, null);
		service.persist(disciplina);
		result.nothing();
	}

}
