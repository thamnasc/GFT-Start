public class Calculadora implements OperacaoMatematica {

    //é necessário implementar todos os métodos da interface

    @Override //sobrescreve os métodos da interface, proveu as implementações dos métodos
    public void somar(double a, double b) {
        System.out.println("Soma: " + (a + b));
    }

    @Override
    public void substrair(double a, double b) {
        System.out.println("Subtracao: " + (a - b));
    }

    @Override //indica erro se não colocar public
    public void multiplicar(double a, double b) {
        System.out.println("Multiplicacao: " + (a * b));
    }

    public void dividir(double a, double b) {
        System.out.println("Divisão: " + (a / b));
    }
}
