
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int i = 1;
        int summa = 0;
        
        System.out.print("Mihin asti? ");
        int luku = Integer.valueOf(lukija.nextLine());
        
        while (i <= luku) {
            summa += i; // summa = summa + i;
            i++;
        }
        
        System.out.println("Summa on " + summa);
    }
}
