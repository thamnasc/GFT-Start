//Tabuada do 9 com estrutura de repetição "faca enquanto"
//Autora: Thalita Maria do Nascimento

programa
{
	
	funcao inicio()
	{
		inteiro tabuada, contador, limite
		tabuada = 9
		contador = 0
		limite = 90
		
		faca {
			tabuada = 9 * contador
			
			//é possível usar + para concatenar variáveis na função escreva
			escreva("9 x " + contador + " = " + tabuada + "\n")
			
			//contador ++ equivale a contador = contador + 1
			contador ++
		} enquanto (tabuada < limite)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */