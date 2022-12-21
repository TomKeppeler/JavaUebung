import java.util.Scanner;

public class Messdaten {
    public static double temperaturInDurchshnitt(Scanner sc){
        int jahr, monat, tag;
        String messgroesse;
        double messwert;
        double summe=0.0;
        int anzahl = 0;
        double max = 0;
        String antwort = "hoechste Temperatur (";
        while (sc.hasNext()){
            jahr = sc.nextInt();
            monat = sc.nextInt();
            tag = sc.nextInt();
            messgroesse = sc.next();
            messwert = sc.nextDouble();
            if(messgroesse.equals("Temperatur")) {
               summe += messwert;
               anzahl++;
               if(messwert > max) {
                   max = messwert;
                   antwort += max + ") am " + tag + "." + monat + "." + jahr;
               }
            }
        }
        System.out.println(antwort);
        return anzahl > 0 ? summe/anzahl : 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner("2018 10 16 Luftdruck 1014,7 " +
                "2018 10 17 Niederschlag 1,3 " +
                "2018 10 15 Temperatur 18,2 " +
                "2018 10 16 Niederschlag 0,0 " +
                "2018 10 17 Temperatur 16,8");
        System.out.println(temperaturInDurchshnitt(sc));
    }
}
