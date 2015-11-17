package br.com.segchamada.controller;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
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

    @Get("/disciplines")
    public void discipline() {
        result.include("disciplines", service.findAll());
    }
    
    @Post ("/adddiscipline")
    public void add(Discipline discipline) {
        service.persist(discipline);
        result.redirectTo(this).discipline();
    }
}