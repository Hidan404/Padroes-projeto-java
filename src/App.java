public class App {
    public static void main(String[] args) throws Exception {
        SyngletonEager eager = SyngletonEager.getInstaciLazy();
        System.out.println(eager);


        SyngletonLazy lazy = SyngletonLazy.getInstaciLazy();
        System.out.println(lazy);


        SyngletonLazyHolder lazyHolder = SyngletonLazyHolder.getInstaciLazy();
        System.out.println(lazyHolder);
    }
}
