programa
{
	
	funcao inicio()
	{
		real NT1, NT2, NT3, M
		escreva("Informe as notas do aluno: ")
		leia (NT1, NT2, NT3)
		M = (NT1+NT2+NT3)/3
		se(M>=60){
			escreva("O aluno foi aprovado")
		}senao{
			escreva("O aluno foi reprovado")
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */