public class exemplul4 {

    // Scriee o metoda care primeste ca parametru o luna calendaristica
    // afiseaza anotimpul corespunzator
    // de 4 ori , luna diferita;
    public static void main(String[] args) {

       afiseazaAnotimp("Decembrie");
       afiseazaAnotimp("Aprilie");
       afiseazaAnotimp("August");
       afiseazaAnotimp("Noiembrie");

    }

   public static void afiseazaAnotimp(String luna) {
       switch (luna) {
           case "Ianuarie", "Decembrie", "Februarie":
               System.out.println("Anotimpul este: iarna");
               break;
           case "Martie", "Aprilie", "Mai":
               System.out.println("Anotimpul este: primvara");
               break;
           case  "Iunie", "Iulie", "August":
               System.out.println("Anotimpul este: vara");
               break;
           case "Septembrie", "Octombrie", "Noiembrie":
               System.out.println("Anotimpul este: Toamna");
               break;
           default:
               System.out.println("Luna invalida!");
       }
   }


}
