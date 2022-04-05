package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

			Scanner leia = new Scanner (System.in);
		int a, b, soma, sub, divi, multi;
		
		System.out.println("Digite um numero: ");
		a = leia.nextInt();
		
		System.out.println("Digite outro valor: ");
		b = leia.nextInt();
		
		soma = a + b;
		sub = a - b;
		divi = a % b;
		multi = a * b;
		
		System.out.println("A soma dos valores dos valores é: " + soma);
		System.out.println("A divisao dos valores: " + divi);
		System.out.println("A subtraçao dos valores é: " + sub);
		System.out.println("A multiplcaçao dos valores: " + multi);
		
		leia.close();
		
		
	}

}
