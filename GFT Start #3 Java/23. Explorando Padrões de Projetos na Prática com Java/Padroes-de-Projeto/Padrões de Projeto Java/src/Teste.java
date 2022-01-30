import com.dio.gof.facade.Facade;
import com.dio.gof.singleton.SingletonEager;
import com.dio.gof.singleton.SingletonLazy;
import com.dio.gof.singleton.SingletonLazyHolder;
import com.dio.gof.strategy.*;

public class Teste {

    public static void main(String[] args) {

        //Teste relacionados ao Design Pattern do Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        //imprime endereço na memória
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        //deve voltar o mesmo endereço de memória
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        //imprime endereço na memória
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        //deve voltar o mesmo endereço de memória
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        //imprime endereço na memória
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        //deve voltar o mesmo endereço de memória
        System.out.println(lazyHolder);

        //Teste relacionados ao Design Patterb Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        //Teste relacionados ao Design Pattern Facade

        Facade facade = new Facade();
        facade.migrarCliente("Thalita", "00000-000");

    }
}
