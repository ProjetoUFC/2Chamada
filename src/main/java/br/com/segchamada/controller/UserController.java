package br.com.segchamada.controller;

import javax.inject.Inject;

import java.io.Serializable;

import br.com.caelum.vraptor.Controller;
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
/*	
	@Get ("/users")
	public void show() {
		result.include("user", service.findAll());
	}
*/

//	@Post
	@Get ("/adduser")
	public void add(Student student) {//(Student student) {
//		Student student = new Student("Jão", "jao", "jao123", "jao@jao.com", 320232, null, null);
//		student.setCourse(null);
//		student.setDisciplines(null);
		service.persist(student);
		result.nothing();//redirectTo(this).show();
	}
}