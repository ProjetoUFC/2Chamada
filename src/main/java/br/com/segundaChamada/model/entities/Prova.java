package br.com.segundaChamada.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Prova extends DefaultEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LocalDateTime data;
	private LocalDateTime data2Chamada;
	private boolean solicitacao;
	
	@ManyToOne
	private Disciplina disciplina;

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public LocalDateTime getData2Chamada() {
		return data2Chamada;
	}

	public void setData2Chamada(LocalDateTime data2Chamada) {
		this.data2Chamada = data2Chamada;
	}

	public boolean isSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(boolean solicitacao) {
		this.solicitacao = solicitacao;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
