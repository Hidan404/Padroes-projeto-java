import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {

        //Testes padrao syngleton Design Pattern
        SyngletonEager eager = SyngletonEager.getInstaciLazy();
        System.out.println(eager);


        SyngletonLazy lazy = SyngletonLazy.getInstaciLazy();
        System.out.println(lazy);


        SyngletonLazyHolder lazyHolder = SyngletonLazyHolder.getInstaciLazy();
        System.out.println(lazyHolder);


        //Strategy
        Comportamento comportamento1 = new ComportamentoNormal();
        Comportamento comportamento2 = new ComportamentoDefensivo();
        Comportamento comportamento3 = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(comportamento1);
        robo.mover();
        robo.setStrategy(comportamento2);
        robo.mover();
        robo.setStrategy(comportamento3);
        robo.mover();
        
        System.out.println(1584);
       


    }
}
