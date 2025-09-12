programa
{
	
	funcao inicio()
	{
		real SB, G, ST
		inteiro Dependente
		escreva("Informe o salário base: ")
		leia(SB)
		escreva("Informe a quantidade de dependente(s): ")
		leia(Dependente)
		escreva("Informe o valor da gratificação: ")
		leia(G)
		ST = SB + (G*0.05)
		escreva("O salário base do funcionário é: "+SB+ " com "+Dependente+ " dependente(s) e com o valor de R$ "+G+" gratificação") 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */