package br.com.segchamada.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Proof
 *
 */
@Entity

public class Test implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

	@Column(nullable = false)
	private LocalDateTime date;
	
	@Column(nullable = false)
	private LocalDateTime date2Chamada;
	
	@ManyToOne
	@Column(nullable = false)
	private Discipline discipline;
	
	public Long getId() {
		return id;
	}

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

	public Discipline getDisciplina() {
		return discipline;
	}

	public void setDisciplina(Discipline discipline) {
		this.discipline = discipline;
	}

}