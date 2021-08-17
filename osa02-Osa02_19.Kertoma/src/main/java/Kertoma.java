
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna luku: ");
        int luku = Integer.valueOf(lukija.nextLine());

        int kertoma = 1;
        int i = 1;
        
        while (i <= luku) {
            kertoma *= i; // kertoma = kertoma * i;
            i++;
        }
        
        System.out.println("Kertoma on " + kertoma);
    }
}
