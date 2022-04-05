package exercicios;

import java.util.Scanner;

public class ExercicioLaço06 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	int i = 0, numero,  soma = 0;
	double media = 0.0;
	
	do {
		System.out.println("digite um numero: ");
		numero = entrada.nextInt();
		
		if(numero % 3 == 0 && numero != 0) {
			soma = soma + numero;
			i++;
		}
	} while (numero != 0);
	media = soma / i;
	System.out.println("Media: "+media);
		}
	
	}


