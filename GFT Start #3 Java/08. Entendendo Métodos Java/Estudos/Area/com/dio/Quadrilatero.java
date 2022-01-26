package com.dio;

public class Quadrilatero {

    public static double area(double lado) {
        return (lado*lado);
    }

    public static double area(double lado1, double lado2) {
        return (lado1*lado2);
    }

    public static double area(double baseMenor, double baseMaior, double altura) {
        return ((baseMenor+baseMaior)*altura/2);
    }
    //o tipo de dado importa para a sobrecarga, a diferenciação é feita com float, neste caso
    public static float area(float diagonal1, float diagonal2) {
        return ((diagonal1+diagonal2)/2);
    }
}
