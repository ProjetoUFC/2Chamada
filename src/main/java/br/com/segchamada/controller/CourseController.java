package br.com.segchamada.controller;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.segchamada.model.Course;
import br.com.segchamada.service.CourseService;

@Controller
public class CourseController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject CourseService service;
	@Inject Result result;
	
	@Get ("/course")
	public void add() {
		Course course = new Course("Ciência da Computação", "1232469", null, null, null);
		service.persist(course);
		result.nothing();
	}
}
