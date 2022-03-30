programa
{ //Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente 
	
	funcao inicio()
	{
		inteiro cont = 1
		real notas [5], maiornota = 0.0

		para (inteiro x = 0; x<=4; x++){
			
		escreva ("\n Digite "+ cont + "° nota: ")
			leia (notas[x])
			cont++ 
			se (maiornota < notas[x]) {
			maiornota = notas[x] }}  //usuario coloca valor

			
			escreva ("\n A maior nota é: " +maiornota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 8, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */