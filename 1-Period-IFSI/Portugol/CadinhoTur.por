programa
{
	
	funcao inicio()
	{
		inteiro  aluno
		real mensal, C1, C2, C3, CT, lucro
		
		escreva("Por favor insira a quantidade de alunos: ")
		leia(aluno)
			escreva("\nAgora insira o valor da mensalidade: ")
			leia(mensal)
				limpa()
		
		escreva("Insira os valores do custos mensalmente com a gasolina: ")
		leia(C1)
			escreva("\nInsira os valores do custos com manutenção: ")
			leia(C2)
				escreva("\nInsira os valores de outros custos: ")
				leia(C3)
				
		CT=C1+C2+C3
		lucro=((aluno*mensal)-CT)
		escreva("O Lucro com os dados informados é de R$: "+lucro)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 140; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */