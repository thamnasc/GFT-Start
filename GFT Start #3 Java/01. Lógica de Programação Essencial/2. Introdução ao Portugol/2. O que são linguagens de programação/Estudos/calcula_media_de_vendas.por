programa
{
	
	funcao inicio()
	{
		real janeiro, fevereiro, marco, abril, total, media

		escreva("Informe o total de vendas no mes de janeiro. R$")
		leia(janeiro)
		escreva("Informe o total de vendas no mes de fevereiro. R$")
		leia(fevereiro)
		escreva("Informe o total de vendas no mes de marco. R$")
		leia(marco)
		escreva("Informe o total de vendas no mes de abril. R$")
		leia(abril)

		total = janeiro + fevereiro + marco + abril
		media = total / 4

		escreva("O total de suas vendas foi R$" + total + ". A media de suas vendas foi R$" + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */