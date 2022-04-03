package ExerciciosExtra;

import java.util.Scanner;

public class ExercicioExtra {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		int n1, n2, n3;
		
		System.out.println("Digite um numero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite um 2° numero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o 3° numero: ");
		n3 = leia.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("o maior numero é: " +n1); }
		
		else if (n2>n1 && n2>n3) {
			System.out.println("o maior numero é: "+ n2);
		}
		else if (n3>n1 && n3>n2){
			System.out.println("o maior numero é: " + n3);
			
		}
		
		
		
	}

}
