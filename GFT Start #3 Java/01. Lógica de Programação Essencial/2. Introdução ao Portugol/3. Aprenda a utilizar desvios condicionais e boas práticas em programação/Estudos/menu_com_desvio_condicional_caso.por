//Menu de provedora de streaming utilizando desvio condicional "caso"
//Autora: Thalita Maria do Nascimento

programa
{
	
	funcao inicio()
	{
		escreva("1 - Abrir Netflix 2 - Abrir Amazon Prime 3 - Abrir HBO GO 4 - Sair")
		inteiro menu = 0
		escreva("\n" + "Sua opção: ")
		leia(menu)

		escolha (menu){
		caso 1: //testa se o valor é igual a 1
			escreva("OK. Abrindo Netflix....")
		pare
		
		caso 2:
			escreva("OK. Abrindo Amazon Prime....")
		pare
		
		caso 3:
			escreva("OK. Abrindo HBO GO....")
		pare
		
		caso 4:
			escreva("Saindo....")
		pare
		
		caso contrario: 
			escreva("Você deve escolher entre as opções de 1 a 4.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 32; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */