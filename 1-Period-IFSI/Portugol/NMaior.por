programa
{
	
	funcao inicio()
	{
		real N1, N2
		escreva("Informe 2 numeros: ")
		leia (N1, N2)
		se(N1>=N2){
			se(N1>N2){
			escreva(N1+" é maior.")
			}
			se(N1==N2){
				escreva("Os numeros são iguais.")
			}
		}
		senao{
			escreva(N2+" é o maior.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */