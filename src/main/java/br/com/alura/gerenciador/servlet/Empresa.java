package br.com.alura.gerenciador.servlet;

public class Empresa {

	private String nome;
	private Integer id;
	
	public Empresa(String nome) {
		this.nome = nome;
	}
	
	public void setID(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public Integer getID() {
		return id;
	}
}
