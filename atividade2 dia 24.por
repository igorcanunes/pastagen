programa
{ //Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
	//horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
	//por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
	//armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
	//trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
	//excedente.
	
	funcao inicio()
	{
		cadeia nome
		inteiro hora, extra, horacomum, salario

		escreva("Ola qual o seu nome: ?")
		leia(nome)
		horacomum = 50
		extra = 20
		


		escreva("Qual valor do salario atual ?: ")
		leia(salario)

		escreva("\n E qual a carga horaria mensal atual (em horas)?: ")
		leia(hora)
		extra = hora - 50

		se (hora<=50)
		escreva (nome, "\n Você ainda nao atingiu a quantidade minima de horas, obrigado e bom trabalho !")

		senao
		escreva (nome, " sua carga horaria é de ",hora , "H com base no salario de ", salario, "\n seus rendimentos para mês seguinte equivale à ", extra *20)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 788; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */