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
	
//	@Post
	@Get ("/test")
	public void add() {//(Student usuario) {
		Student usuario = new Student("Jão", "jao", "jao123", "jao@jao.gmail.com", 320232, null, null);
		service.persist(usuario);
		result.nothing();
	}
	
}
