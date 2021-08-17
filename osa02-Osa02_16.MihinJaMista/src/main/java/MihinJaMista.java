
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.print("Mihin asti? ");
        int loppu = Integer.valueOf(lukija.nextLine());
        System.out.print("Mistä lähtien? ");
        int alku = Integer.valueOf(lukija.nextLine());
        
        while (alku <= loppu) {
            System.out.println(alku);
            alku++;
        }
    }
}
