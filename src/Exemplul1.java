public class Exemplul1 {

    public static void main(String[] args) {


     saluta();
     saluta();

     repetaText();
     repetaText();

     adunaNumere();
     adunaNumere();

        System.out.println(inmultesteNumere());


        System.out.println(inmultesteNumere()+inmultesteNumere());


    }


    public static void saluta() {

        System.out.println("Alex te saluta!");

    }

    public static void repetaText() {

        for (int i = 0; i <+ 10 ; i++) {
            System.out.println("I love Java!");
        }

    }

    public static void adunaNumere() {
        System.out.println(2+3);


    }

   public static int inmultesteNumere() {
   int x = 20;
   int y = 3;
   int rezultat = x * y;
   return rezultat;
   }
}
