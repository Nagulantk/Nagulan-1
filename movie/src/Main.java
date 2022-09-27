import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> movie = new ArrayList<String>();

        movie.add("mersal");
        movie.add("velaikaran");
        movie.add("rajinimurugan");
        movie.add("manithan");
        movie.add("pokkiri");
        movie.add("vikram");
        movie.add("vethalam");
        movie.add("vikramvetha");
        movie.add("thanioruvan");
        movie.add("ponniyinselvan");
        movie.add("cobra");
        movie.add("thillumullu");
        movie.add("enthiran");
        movie.add("maamanithan");
        movie.add("thor");
        movie.add("tomandjerry");
        movie.add("sarkar");
        movie.add("thupakki");
        movie.add("nanban");
        movie.add("Komban");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the movie number:(1to10)");
        int a = input.nextInt();
        String Moviename = movie.get(a - 1);

        int l = Moviename.length();

        char[] Movie = Moviename.toCharArray();
        char[] mo = new char[l];
        int i, j;
        boolean u = true;
        for (j = 0; j < l; j++) {
            mo[j] = '_';
        }
        for (i = 1; i <= 10; i++) {
            System.out.println("Enter a character:");
            char m = input.next().charAt(0);
            for (j = 0; j < l; j++) {
                if (m == Movie[j] && (mo[j] == '_')) {
                    mo[j] = m;
                }


            }
            System.out.println(mo);
            String s = mo.toString();
            if (s.equals(Moviename)) {
                System.out.println("You won");
                u = false;

            }


        }
        String s = mo.toString();
        if (u) {
            if (s.equals(Moviename)) {
                System.out.println("You won");
            } else {
                System.out.println("You lost");
            }
        }
    }
    }