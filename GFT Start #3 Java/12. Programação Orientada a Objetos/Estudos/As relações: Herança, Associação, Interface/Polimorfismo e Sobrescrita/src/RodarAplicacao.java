public class RodarAplicacao {

    public static void main(String[] args) {

        //vetor do tipo ClasseMae
        //tem três objetos de três tipos
        //polimorfismo para new ClasseFilha1() e new ClasseFilha2()
        //trabalha com tipo da ClasseMae, mas instancia o objeto como ClasseFilha
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //for each chamando o método um de cada objeto
        //metodo1 está presente na ClasseMae e foi sobrescrito na ClasseFilha1 e ClasseFilha2

        /*sobrescrita com polimorfismo para dois seguintes casos:*/
        //o método do primeiro objeto se comportará de acordo com o que está na ClasseFilha1, no primeiro objeto
        //o método do segundo objeto se comportará de acordo com o que está na ClasseFilha2, no segundo objeto

        //para o terceiro objeto, o método se comportará como o qual da ClasseMae
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        //para o primeiro objeto, o método se comportará como está na ClasseMae: NÃO SE COMPORTA POLIMORFICAMENTE
        //para o segundo objeto, o método se comportará como está na ClasseFilha2: Sobrescrita com Polimorfismo
        //para o terceiro objeto, o método se comportará como o qual da ClasseMae
        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        //ocorre a SOBRESCRITA, porque trabalha diretamente com a ClasseFilha2
        //Sobrescrita pura
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
