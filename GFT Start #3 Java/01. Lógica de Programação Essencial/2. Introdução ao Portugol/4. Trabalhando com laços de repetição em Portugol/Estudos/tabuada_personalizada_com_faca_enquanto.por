//O programa executa a tabuada e o limite que o usuário solicitar, feito com estrutura de repetição "faca enquanto"
//Autora: Thalita Maria do Nascimento

programa
{
	
	funcao inicio()
	{
		inteiro tabuada, resultado, contador, limite
		
		escreva("Escolha a tabuada que deseja: ")
		leia(tabuada)

		resultado = 0
		contador = 0
		limite = tabuada * 10
		
		faca {
			//é possível usar + para concatenar variáveis na função escreva
			escreva(+ "\n" + tabuada + " x " + contador + " = " + resultado)
			
			//contador ++ equivale a contador = contador + 1
			contador ++

			resultado = tabuada * contador
		} enquanto (resultado <= limite)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */