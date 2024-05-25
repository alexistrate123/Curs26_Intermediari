public class Exemplul3 {
    public static void main(String[] args) {

        prezinta();
        prezinta();
        prezinta();
        // prezintaPersoana("Alex", 23);
        // prezintaPersoana("Izabela", 32);
        prezintaPersoana(23, "Alex");
        prezintaPersoana(32, "Izabela");

       calculeazaMedia(56.20 , 78.87, 85.89, 10.00);
       calculeazaMedia(89.29 , 94.87, 65.89, 70.00);
       calculeazaMedia(69.80 , 98.87, 75.89, 10.00);
    }

    // Scrie o metoda fara parametrii care se cheama prezinta
    // care afiseaza salut ma numesc alex si am 23 de ani;
    // de 3 ori in main;


    // scrie o metoda care se va chema : prezintaPersoana ;
    // Si afiseaza : Salut, ma numesc ... si am ... de ani;
    // apeleaza metoda de 3 ori in main.

    public static void prezinta() {
        System.out.println("Salut numele meu este Alex si am 23 de ani.");
    }


    public static void prezintaPersoana(int ani, String nume) {
        System.out.println("Salut, ma numesc " + nume + " si am " + ani + " de ani.");
    }

    // Scrie o metoda calculeazaMedia;
    // care primeste ca parametrii 4 numere de tip double;
    // afiseaza de 3 ori in  main cu valori diferite.

    public static void calculeazaMedia(double x, double y, double z, double t) {
        double rezultat = (x + y + z + t)/4;
        System.out.printf("Media notelor este: %.2f\n",rezultat) ;

    }



}
