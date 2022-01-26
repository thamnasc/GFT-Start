//Exercício: armazenar Nome, Cidade e Telefone em matriz e imprimir num loop faca-enquanto
//Autora: Thalita Maria do Nascimento

programa
{
	
	funcao inicio()
	{
		cadeia dados_pessoais[][] = {{"João", "São Paulo", "(11) 9999-5241"}, 
		{"Maria", "Ribeirão Preto", "(16) 9999-8596"}, 
		{"Ana", "Manaus", "(92) 9999-8574"}}
		
		inteiro contador = 0

		faca{

			escreva("\n" + "Nome: " + dados_pessoais[contador][0] + " Cidade: " + dados_pessoais[contador][1] + " Telefone: " + dados_pessoais[contador][2])
			contador++
			
		} enquanto (contador <= 2) //0 a 2 = 3 linhas de dados pessoais
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */