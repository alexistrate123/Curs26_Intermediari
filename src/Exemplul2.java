public class Exemplul2 {
    public static void main(String[] args) {

    bark();

    bark("Alex");
    bark("Antonio");
    bark("Andrei");
   aduna(20, 23);
   aduna(2, 4);
   aduna(29, 15);
    }



    public static void bark() {

        System.out.println("Cainele Grivei latra.");

    }

   public static void bark(String nume) {
       System.out.println("Cainele nostru Grivei il latra pe " + nume);
   }

public static void aduna(int x, int y) {
    System.out.println(x + y);

}










}
