/**
 * Syngleton "Apressado"
 * @author Ronald
 */


public class SyngletonEager {

    private static SyngletonEager instaciLazy = new SyngletonEager();

    private  SyngletonEager(){
        super();
    }

    public static SyngletonEager getInstaciLazy(){
        
        return instaciLazy;
    }
}
