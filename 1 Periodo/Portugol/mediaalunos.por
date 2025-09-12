programa
{
	
	funcao inicio()
	{
	
		real NF, med = 0
		 
		para(inteiro posicao = 1; posicao<=5; posicao++){
			escreva("Por favor insira as nota do " +posicao+ "° aluno: \n")
			leia(NF)
			med = med + NF
		}
		med = (med/5)
		limpa()
		escreva("A Média é: "+ med)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */