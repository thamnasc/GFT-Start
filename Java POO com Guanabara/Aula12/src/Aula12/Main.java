package Aula12;

public class Main {
    public static void main(String[] args) {

        //não é possível instanciar uma classe abstrata
//        Animal animal = new Animal();

        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        //polimorfismo de sobreposição:
        //mesmo método, mesmo nome, mas age de diferentes maneiras
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

        reptil.locomover();
        reptil.alimentar();
        reptil.emitirSom();

        peixe.locomover();
        peixe.alimentar();
        peixe.emitirSom();

        ave.locomover();
        ave.alimentar();
        ave.emitirSom();

        Canguru canguru = new Canguru();
        canguru.usarBolsa();
        //polimorfismo de sobreposição novamente
        canguru.locomover();

        Cachorro cachorro = new Cachorro();
        cachorro.enterrarOsso();
        cachorro.abanarRabo();
        cachorro.emitirSom();
        
        Tartaruga tartaruga = new Tartaruga();
        //polimorfismo de sobreposição novamente
        tartaruga.locomover();
    }
}
