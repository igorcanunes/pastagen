package com.gen.exercicio_heran�a;

public class Animal {
	// atributos
	
	private String nome;
	private String som;
	private String a�ao;
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
	public String getA�ao() {
		return a�ao;
	}
	public void setA�ao(String a�ao) {
		this.a�ao = a�ao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	// metodos --- > a�oes
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
