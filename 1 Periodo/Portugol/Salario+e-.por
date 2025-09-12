//Elabore um algoritmo que leia nome e salário de N funcionários.
//Ao final da leitura, deve ser informado na tela o nome e o salário do funcionário com maior salário da empresa
//e depois, o nome e o salário do funcionário com menor salário.

programa
{
	
	funcao inicio()
	{
		cadeia nome, maiorn="", menorn=""
		inteiro Nf, contf=1, cont2=1
		real salario, maiors=0.0, menors=0.0

		escreva("Com quantos funcionarios serão realizados a pesquisa? ")
		  leia(Nf)
		
		para(contf; contf<=Nf; contf++){
		escreva("Informe o nome do "+contf+"° funcionario: ")
			leia(nome)
		  escreva("Agora informe seu salário: ")
			  leia(salario)
			    limpa()

		se(salario>maiors){
			se(cont2==1){
			menors=salario
			cont2++	
			}
			 maiors=salario
			  maiorn=nome
		}
			se(salario<menors){
				menors=salario
			  	 menorn=nome 
		  }
		}
		escreva("De acordo com a pesquisa: \nO maior salário da empresa é do "+maiorn+" com R$:"+maiors
		+". \nO menor salário da empresa é do "+menorn+" com R$:"+menors+".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 690; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */