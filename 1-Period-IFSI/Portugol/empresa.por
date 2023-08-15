//A empresa MAM Business necessita de um programa para o gerenciamento de sua folha de
//pagamento e pode te contratar para ser o(a) programador(a) responsável. Assim, elabore um
//programa que leia o código, o nome, o gênero (F/M), a idade, a função e o salário de cada
//funcionário. O gestor precisa saber:
//a. O nome, salário e função do funcionário com maior salário.
//b. O nome, salário e função do funcionário com menor salário.
//c. O salário médio da empresa.
//d. O salário médio dos salários dos homens.
//e. O salário médio dos salários das mulheres.
//f. Qual a diferença do salário médio das mulheres em relação ao salário médio geral.
//A condição de parada, será quando o usuário informar o código 0 para um funcionário.
programa
{
	
	funcao inicio()
	{
		inteiro codigo, idade, cont=1
		real salario, maiorsalario=0.0, menorsalario=0.0, media=0.0, mediaM=0.0, mediaF=0.0
		cadeia nome, genero, funcaos, maiornome="", maiorfuncaos="", menornome="", menorfuncaos=""

		faca{
		escreva("Ola, informe primeiro o nome do funcionário: ")
		leia(nome)
			escreva("\nAgora informe o codigo do "+nome+": ")
			leia(codigo)
				escreva("\nPor favor informe o genero (M/F): ")
				leia(genero)
					escreva("\nA idade do "+nome+ ": ")
					leia(idade)
						escreva(" anos.\nInforme a funcionalidade na empresa: ")
						leia(funcaos)
							escreva("Por fim, o sálario do(a) "+nome+": ")
							leia(salario)
		limpa()

		se(salario>=maiorsalario){
			se(cont==1){
				menorsalario=salario	
			}
			 maiorsalario=salario
			 	maiornome=nome
			 		maiorfuncaos=funcaos
		}

		se(salario<menorsalario){
			 menorsalario=salario
			 	menornome=nome
			 		menorfuncaos=funcaos
		}
		media=media+salario
			cont++
		}enquanto()
		media=media/cont
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1711; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */