package com.gen.exercicio_heran�a;

public class FazendaTudo {

	public static void main(String[] args) {
		
		Animal cachorro = new Animal ();
		Animal cavalo = new Animal ();
		Animal pregui�a = new Animal ();
		
		cachorro.setNome(" pithu ");
		cachorro.setIdade(8);
				
		cavalo.setNome("pocoto");
		cavalo.setIdade(16);
		cavalo.setSom("pocoto pocoto");
		cavalo.setA�ao("Trote");
		
		pregui�a.setNome("seu ze");
		pregui�a.setA�ao("zzzZZZZzzz");
		pregui�a.setIdade(2500);
		pregui�a.setSom("zzZZzz");
		
		
		System.out.println("nome do meu cachorro �: "+ cachorro.getNome());
		System.out.println("idade: " + cachorro.getIdade());
		cachorro.brincando();
			System.out.println();
			
		// cavalo
		System.out.println("nome do meu cavalo: " + cavalo.getNome());
		System.out.println("idade: "+ cavalo.getIdade());
		cavalo.pocoto();
			System.out.println();
		
			// pregui�a
			System.out.println("nome da pregui�a �: "+ pregui�a.getNome());
			System.out.println("idade: " + pregui�a.getIdade());
			System.out.println("pregui�a "+ pregui�a.getA�ao());
			pregui�a.dormindo();
			
	}

}
