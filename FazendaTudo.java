package com.gen.exercicio_herança;

public class FazendaTudo {

	public static void main(String[] args) {
		
		Animal cachorro = new Animal ();
		Animal cavalo = new Animal ();
		Animal preguiça = new Animal ();
		
		cachorro.setNome(" pithu ");
		cachorro.setIdade(8);
				
		cavalo.setNome("pocoto");
		cavalo.setIdade(16);
		cavalo.setSom("pocoto pocoto");
		cavalo.setAçao("Trote");
		
		preguiça.setNome("seu ze");
		preguiça.setAçao("zzzZZZZzzz");
		preguiça.setIdade(2500);
		preguiça.setSom("zzZZzz");
		
		
		System.out.println("nome do meu cachorro é: "+ cachorro.getNome());
		System.out.println("idade: " + cachorro.getIdade());
		cachorro.brincando();
			System.out.println();
			
		// cavalo
		System.out.println("nome do meu cavalo: " + cavalo.getNome());
		System.out.println("idade: "+ cavalo.getIdade());
		cavalo.pocoto();
			System.out.println();
		
			// preguiça
			System.out.println("nome da preguiça é: "+ preguiça.getNome());
			System.out.println("idade: " + preguiça.getIdade());
			System.out.println("preguiça "+ preguiça.getAçao());
			preguiça.dormindo();
			
	}

}
