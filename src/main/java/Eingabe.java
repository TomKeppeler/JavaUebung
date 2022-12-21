import java.util.Scanner;

public class Eingabe {
  public static double durchschnitt(Scanner sc) {
      double summe = 0.0;
      int anzahl = 0;
      while(sc.hasNext()) {
          summe += sc.nextDouble();
          anzahl++;
      }
      return anzahl > 0 ? summe/anzahl : 0.0;
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner("");
        System.out.println(durchschnitt(sc));
    }
}
