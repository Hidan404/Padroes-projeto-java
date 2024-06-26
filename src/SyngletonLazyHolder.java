/**
 * Syngleton "preguiçoso mais eficaz"
 * @author ronald
 */


public class SyngletonLazyHolder {
    
    private static class InnerSyngletonLazyHolder {
        public static SyngletonLazyHolder instaciLazy = new SyngletonLazyHolder();
        
    }

    private  SyngletonLazyHolder(){
        super();
    }

    public static SyngletonLazyHolder getInstaciLazy(){
    
        return InnerSyngletonLazyHolder.instaciLazy;
    }
}
