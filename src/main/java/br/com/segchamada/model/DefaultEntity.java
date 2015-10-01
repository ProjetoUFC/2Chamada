package br.com.segchamada.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DefaultEntity
 *
 */
@MappedSuperclass

public class DefaultEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
/*
    @Column(name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao = LocalDateTime.now();
*/
	public Long getId() {
		return id;
	}
/*
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
*/
}