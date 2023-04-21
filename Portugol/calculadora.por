programa
{
	
	funcao inicio()
	{
		cadeia sinal
		real X, Y, resultado
		
		escreva("Bem-vindo(a) a *CALCULADORA* \nEscolha a forma logica da operação: \n")
			escreva("(1)+ - Adição\n(2)- - Subtração\n(3)* - Multiplicação\n(4)/ - Divisão\n")
		leia(sinal)
			limpa()
		escreva("Informe o primeiro digito: ")
			leia(X)
		escreva("Informe o segundo digito: ")
			leia(Y)


		se(sinal=="1" ou sinal=="+"){
			resultado=X+Y
				escreva("O resultado é: "+resultado)
		}
		senao se(sinal=="2" ou sinal=="-"){
			resultado=X-Y
				escreva("O resultado é: "+resultado)
		}
		senao se(sinal=="3" ou sinal=="-"){
			resultado=X*Y
				escreva("O resultado é: "+resultado)
		}
		senao se(sinal=="4" ou sinal=="/"){
			resultado=X/Y
				se (Y==0){
					escreva("Operação inválida.")
				}senao
				escreva("O resultado é: "+resultado)
		}senao{
			escreva("Operação inválida.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 106; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */