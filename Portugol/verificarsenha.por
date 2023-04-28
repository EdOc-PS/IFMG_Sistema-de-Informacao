programa
{
	inclua biblioteca Util --> tempo
	funcao inicio()
	{	
		inteiro cont=0
		cadeia senha, vsenha="pre"
		faca{
		se(cont!= 0){
			escreva("senha inválida, tente novamente!\n")
			 cont--
			   tempo.aguarde(1000)
			     limpa()
		}
		escreva("Por favor informe a sua senha:\n")
		  leia(senha)
		    cont++
		}enquanto(senha!=vsenha)
			escreva("A senha correta")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */