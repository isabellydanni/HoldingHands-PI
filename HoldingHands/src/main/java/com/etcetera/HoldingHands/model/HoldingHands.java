package com.etcetera.HoldingHands.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tema")
public class HoldingHands {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 255)
	private String tema;
	
	@NotNull
	@Size(min = 2, max = 511)
	private String descricao;
	
	@Size(min = 0)
	private long qnt_posts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getQnt_posts() {
		return qnt_posts;
	}

	public void setQnt_posts(long qnt_posts) {
		this.qnt_posts = qnt_posts;
	}
	
}
