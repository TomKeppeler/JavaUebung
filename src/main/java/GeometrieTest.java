import java.util.Scanner;

public class GeometrieTest {
    public static boolean test(){
        return flaecheTest()
                & umfangTest();
    }

    private static boolean umfangTest() {
    }

    private static boolean flaecheTest() {
        return flaecheCheck(0, 0, 0) 
                & flaecheCheck(1, 2, 2);
    }

    private static boolean flaecheCheck(double a, double b, double erw) {
        double erg = Geometrie.flaecheREck(a,b);
        boolean istKorrekt = (erw == erg);
        if(!istKorrekt) {
            System.out.println("falsch");
        }
        return istKorrekt;
    }
}
