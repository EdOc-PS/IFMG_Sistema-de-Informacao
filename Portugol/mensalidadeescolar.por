programa
{
	
	funcao inicio()
	{	
		real mensal, valorF = 0
		cadeia FP
			escreva("Por favor insira o valor da mensalidade escolar: ")
			leia(mensal)
				escreva("\nEscolha a forma de pagamento:\nD - Dinheiro\nP - PIX\nC - Cartão\n")
				leia(FP)
					limpa()
					
			se(FP=="D" ou FP=="dinheiro" ou FP=="Dinheiro"){
				valorF = ( mensal * 0.95)
				FP="Dinheiro"
			}
				se(FP=="P" ou FP=="pix" ou FP=="PIX" ou FP=="Pix"){
					valorF = ( mensal * 0.90)
					FP="PIX"
				}
					se(FP=="C" ou FP=="cartão" ou FP=="Cartão" ou FP=="cartao"){
						valorF = ( mensal * 1.07)
						FP="Cartão"
					}
					
				
					
			escreva("O valor da mensalidade do aluno é de R$: "+valorF+" na modalidade de pagamento: "+FP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 613; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */