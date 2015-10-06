package br.com.segchamada.controller;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
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
	
	
	@Post //@Get
	public void add(Discipline disciplina) {
		//Discipline disciplina = new Discipline("Introdução a Loucura", "CTR2469");
		service.persist(disciplina);
		//result.include("linkTo[UserController].add");
	}

}
