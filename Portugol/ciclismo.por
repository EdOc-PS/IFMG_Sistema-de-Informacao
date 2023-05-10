//No mês de maio acontecerá em Ouro Branco a Maratona Internacional Estrada Real, um
//evento de ciclismo internacional. Assim, necessita-se um programa para ler o numeral de
//cada atleta e o seu tempo. Calcular e exibir o numeral e o tempo do atleta campeão. Após a
//leitura dos dados de um atleta, o programa deverá perguntar se o usuário deseja continuar
//(s/n).

//Altere o programa anterior para calcular e exibir o numeral e o tempo dos 2 primeiros
//colocados.

programa
{
	
	funcao inicio()
	{
		inteiro natleta, natletacamp=0, natleta2l=0,cont=1
		cadeia nomeatleta="", nomeatletacamp="",nomeatleta2l="", continuar=""
		real tempo, maiortempo=0.0, menortempo=0.0


		faca{
		escreva("Informe o nome do ciclista: ")
			leia(nomeatleta)
				escreva("Informe o numero do "+nomeatleta+": ")
					leia(natleta)
						escreva("Informe o tempo do "+nomeatleta+" em minutos: ")
							leia(tempo)
		se(tempo>maiortempo){
			se(cont==1){
				menortempo=tempo
					cont++
			}
		}
		se(tempo<=menortempo){
			menortempo=tempo
				natletacamp=natleta
					nomeatletacamp=nomeatleta
		}
		escreva("Deseja continuar?\n")
			leia(continuar)		
	}enquanto(continuar == "Sim" ou continuar == "sim" ou continuar == "s")
		se(continuar == "não" ou continuar == "nao" ou continuar == "n"){
			escreva("O campeão foi "+nomeatletacamp+".\nNumero: "+natletacamp+".\nTempo: "+menortempo+" minuto(s)." )
		}senao{
			escreva("Objeto inserido é inválido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1082; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */