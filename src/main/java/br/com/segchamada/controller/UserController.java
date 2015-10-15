package br.com.segchamada.controller;

import javax.inject.Inject;

import java.io.Serializable;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.segchamada.model.*;
import br.com.segchamada.service.*;

@Controller
public class UserController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject UserService service;
	@Inject Result result;
<<<<<<< HEAD
/*	
	@Get ("/events")
	public void show() {
		result.include("events", service.findAll());
	}
*/	
//	@Post
	@Get ("/events")
	public void add() {//(Student student) {
		Student student = new Student("Jão", "jao", "jao123", "jao@jao.com", 320232, null, null);
//		student.setCourse(null);
//		student.setDisciplines(null);
		service.persist(student);
		result.nothing();//redirectTo(this).show();
=======
	
//	@Post
	@Get ("/test")
	public void add() {//(Student usuario) {
		Student usuario = new Student("Jão", "jao", "jao123", "jao@jao.gmail.com", 320232, null, null);
		service.persist(usuario);
		result.nothing();
>>>>>>> 5cf82f6c4e4689e345c3f3448c0d6726f1f9797d
	}
	
}
