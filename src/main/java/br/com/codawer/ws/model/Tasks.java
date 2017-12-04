package br.com.codawer.ws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tasks {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String titulo;
	
	private String descricao;
	
	private String mantedor;
	
	private boolean fechado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMantedor() {
		return mantedor;
	}
	public void setMantedor(String mantedor) {
		this.mantedor = mantedor;
	}
	public boolean isFechado() {
		return fechado;
	}
	public void setFechado(boolean fechado) {
		this.fechado = fechado;
	}
	
	

}
