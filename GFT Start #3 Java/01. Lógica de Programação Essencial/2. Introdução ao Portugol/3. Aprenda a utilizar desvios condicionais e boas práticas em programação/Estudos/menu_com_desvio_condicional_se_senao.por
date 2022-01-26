//Menu para serviços de streaming utilizando estrutura condicional se-senao
//Autora: Thalita Maria do Nascimento

programa
{
	
	funcao inicio()
	{
		escreva("1 - Abrir Netflix 2 - Abrir Amazon Prime 3 - Abrir HBO GO 4 - Sair")
		inteiro menu = 0
		
		//escreva("\n" + "Sua opção: ") funciona da mesma forma que a quebra de linha (\n) no caso abaixo
		escreva("\nSua opção: ") 
		leia(menu)

		se (menu == 1) {
			escreva("Ok! Abrir Netflix!")
		}

		se (menu == 2) {
			escreva("Ok! Abrir Amazon Prime!")
		}

		se (menu == 3) {
			escreva("Ok! Abrir HBO GO!")
		}

		se (menu == 4) {
			escreva("Saindo......")
		}
		
		senao { //para qualquer outro valor que o usuário escrever
			escreva("Por favor, escolha entre as opções de 1 a 4.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 746; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */