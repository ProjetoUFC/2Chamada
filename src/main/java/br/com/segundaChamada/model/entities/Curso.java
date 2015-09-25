package br.com.segundaChamada.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Curso extends DefaultEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private int identificacao;
	
	@ManyToMany
	private List<Professor> professores = new ArrayList<Professor>();
	
	@OneToOne
	private Professor coordenador;
	
	@ManyToMany
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdentificacao() {
		return identificacao;
	}
	
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public Professor getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
