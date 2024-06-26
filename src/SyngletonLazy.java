/**
 * Singleton "Preguiçcoso"
 * @author Ronald
 */

public class SyngletonLazy {

    private static SyngletonLazy instaciLazy;

    SyngletonLazy(){
        super();
    }

    public static SyngletonLazy getInstaciLazy(){
        if (instaciLazy == null) {
            @SuppressWarnings("unused")
            SyngletonLazy instaciLazy = new SyngletonLazy();
        }
        return instaciLazy;
    }
}
