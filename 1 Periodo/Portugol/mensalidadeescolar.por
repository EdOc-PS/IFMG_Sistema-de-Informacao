programa
{
	
	funcao inicio()
	{	
		real mensal, valorF=0
		cadeia FP
			escreva("Por favor insira o valor da mensalidade escolar: R$: ")
			leia(mensal)
			faca{
				escreva("\nEscolha a forma de pagamento:\nD - Dinheiro\nP - PIX\nC - Cartão\nX - Cancelar\n")
				leia(FP)
					limpa()			
			}
			enquanto(FP!="D" e FP!="dinheiro" e FP!="Dinheiro" e FP!="P"  e FP!="pix" e FP!="Pix" e FP!="C" e FP!="cartão" e FP!="Cartão" e FP!="X" )
					
			se(FP=="D" ou FP=="d" ou FP=="dinheiro" ou FP=="Dinheiro"){
				valorF = ( mensal * 0.95)
				FP="Dinheiro"
					escreva("O valor da mensalidade do aluno é de R$: "+valorF+" na modalidade de pagamento: "+FP)
			}
				se(FP=="P" ou FP=="p" ou FP=="pix" ou FP=="PIX" ou FP=="Pix"){
					valorF = ( mensal * 0.90)
					FP="PIX"
						escreva("O valor da mensalidade do aluno é de R$: "+valorF+" na modalidade de pagamento: "+FP)
				}
					se(FP=="C" ou FP=="c" ou FP=="cartão" ou FP=="Cartão" ou FP=="cartao"){
						valorF = ( mensal * 1.07)
						FP="Cartão"
							escreva("O valor da mensalidade do aluno é de R$: "+valorF+" na modalidade de pagamento: "+FP)
					}
					se(FP =="X"){
						escreva("Cancelado!")	
					
					}
				
					
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */