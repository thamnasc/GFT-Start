package aula3;

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Rosa";

        //carga pode ser alterado sendo protected
        //porque a classe main está instanciando o objeto
        //então tem acesso a ele
        c1.carga = 97;

        //private: main não tem acesso
//                c1.rabiscar();
//                c1.ponta = 0.7f;
//        c1.tampada = true;

        c1.tampar();
        c1.status();


        Caneta c2 = new Caneta();
        c2.cor = "Roxa";
        c2.destampar();
//        c2.rabiscar();
    }
}
