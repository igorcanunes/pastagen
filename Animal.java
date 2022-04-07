package com.gen.exercicio_herança;

public class Animal {
	// atributos
	
	private String nome;
	private String som;
	private String açao;
	private int idade;
	
	// atributos gett e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAçao() {
		return açao;
	}
	public void setAçao(String açao) {
		this.açao = açao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	// metodos --- > açoes
	void brincando() {
		System.out.println("cachorro esta brincando");
}
	void pocoto() {
		System.out.println("trotando pocotopocoto");
	}
	void dormindo() {
		System.out.println("zzZZZzz");
	}
}
