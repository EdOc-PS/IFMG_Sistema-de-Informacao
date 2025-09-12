programa
{
	
	funcao inicio()
	{	
		cadeia nome
		real freq, nota
		escreva("Ola, por favor informe o nome do aluno: ")
		leia(nome)
		escreva("Agora informe a nota total: ")
		leia(nota)
		escreva("Digite a frequência do aluno: ")
		leia(freq)
		limpa()
		se (nota >= 60 e freq >= 75){
			escreva("O aluno "+nome+" de nota "+ nota+ " pontos totais e com frequência de "+freq+"% esta aprovado!")
		}senao{
			escreva("O aluno "+nome+" de nota "+ nota+ " pontos totais e com frequência de "+freq+"% esta reprovado!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 476; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */