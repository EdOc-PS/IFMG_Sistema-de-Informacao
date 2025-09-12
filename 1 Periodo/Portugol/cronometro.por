programa
{
	inclua biblioteca Util --> tempo
	funcao inicio()
	{
		inteiro n = 0, cont
		escreva("Seja bem-vindo ao cronometro!\n")
		
		para(cont=1; cont<=10; cont++){
			escreva(cont+"\n")
			tempo.aguarde(1000)
		}
		escreva("Você chegou a 10.")
		tempo.aguarde(1000)
		limpa()
		escreva("BUM!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */