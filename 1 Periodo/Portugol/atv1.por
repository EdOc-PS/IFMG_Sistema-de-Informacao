programa
{
	
	funcao inicio()
	{
	  real V, VF
	  cadeia FP
	  escreva("Digite o valor da compra: ") 
	  leia(V)
	  escreva("\nDigite a forma de Pagamento (A para pagamentos à vista e P para a Prazo): ")
	  leia(FP)
	  se(FP == "A" ou FP == "P"){
	  se(FP == "A"){
	  	VF = V * 0.9
	  	FP = "vista"
	  }
	  senao{
	  	VF = V *0.95
	  	FP = "prazo"
	  }
	  escreva("\nO valor da sua compra é: " + V + " \nNa forma de pagamento à " + FP + " ficara como: " + VF)
	}
	senao{
		escreva("Forma de pagamento indisponivel")
	}
 }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */