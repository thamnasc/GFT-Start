//Estudo de Matrizes
//Autora: Thalita Maria do Nascimento
programa
{
	
	funcao inicio()
	{
		//não indica o índice para que seja identificado automaticamente
		//"100" precisa estar entre aspas porque é do tipo cadeia
		cadeia cesta[][] = {{"Pera", "100"}, {"Banana", "25"}, {"Cereja", "300"}, {"Laranja", "1"}}

		inteiro contador = 0
		
		//Imprime 	Produto: Pera Quantidade: 100
		escreva("Produto: ")
		escreva(cesta[0][0])
		escreva(" Quantidade: ")
		escreva(cesta[0][1])

		//Imprime 	Produto: Banana Quantidade: 25
		escreva("\nProduto: ")
		escreva(cesta[1][0])
		escreva(" Quantidade: ")
		escreva(cesta[1][1])

		//Imprime todas as combinações
		faca{
	
			escreva("\n" + "Produto: " + cesta[contador][0] + " Quantidade: " + cesta[contador][1])
			contador ++
		}enquanto (contador <= 3)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 58; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */