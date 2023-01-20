package main.java;

public class Spielwiese {
    public static void main(String[] args) {
    boolean a1, a2;
        a1 = false;
        a2 = true;
        System.out.println("a1 = a2 : " + (a1 = true));
        System.out.println("!(a1 = a2) : " + !(a1 = a2));
        System.out.println("a1 == a2 : " + (a1 == a2));
        System.out.println("!(a1 == a2) : " + !(a1 == a2));
    }
}
