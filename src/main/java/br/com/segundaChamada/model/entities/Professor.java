package br.com.segundaChamada.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Professor extends Usuario {

	private static final long serialVersionUID = 1L;
	
	private String identificacao;
	
	@ManyToMany (fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.ALL })
	private List<Disciplina> disciplinas;
	
	@OneToOne
	private Curso coordenadorCurso;
	
	@ManyToMany
	private List<Curso> cursos = new ArrayList<Curso>();
	

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Curso getCoordenadorCurso() {
		return coordenadorCurso;
	}

	public void setCoordenadorCurso(Curso coordenadorCurso) {
		this.coordenadorCurso = coordenadorCurso;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
}
