package br.com.segchamada.controller;

import javax.inject.Inject;

import java.io.Serializable;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Get;

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

	@Get ("/users")
	public void show() {
		result.include("users", service.findAll());
	}

	@Post
	public void add (Student student) {
//		User student = new Student("Jão", "jao", "jao123", "jao@jao.com", 320232, null, null);
		service.persist(student);
		result.redirectTo(this).show();
	}
	
	@Get ("/deleteuser")
	public void delete () {
		service.remove((Student) service.findWithId(3));
	}
}