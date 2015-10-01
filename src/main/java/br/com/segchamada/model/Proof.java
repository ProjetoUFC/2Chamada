package br.com.segchamada.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Proof
 *
 */
@Entity

public class Proof extends DefaultEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

//	@Column(nullable = false)
	private LocalDateTime date;
	
//	@Column(nullable = false)
	private LocalDateTime date2Chamada;
	
//	@Column(nullable = false)
	private boolean solicitation;
	
	@ManyToOne
//	@Column(nullable = false)
	private Discipline discipline;

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public LocalDateTime getDate2Chamada() {
		return date2Chamada;
	}

	public void setData2Chamada(LocalDateTime date2Chamada) {
		this.date2Chamada = date2Chamada;
	}

	public boolean isSolicitation() {
		return solicitation;
	}

	public void setSolicitation(boolean solicitation) {
		this.solicitation = solicitation;
	}

	public Discipline getDisciplina() {
		return discipline;
	}

	public void setDisciplina(Discipline discipline) {
		this.discipline = discipline;
	}

}