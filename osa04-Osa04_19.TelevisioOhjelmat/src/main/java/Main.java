
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            
            System.out.print("Pituus: ");
            int pituus = Integer.valueOf(lukija.nextLine());
            
            ohjelmat.add(new TelevisioOhjelma(nimi, pituus));
        }
        
        System.out.println();
        
        System.out.print("Ohjelman maksimipituus? ");
        int maksimi = Integer.valueOf(lukija.nextLine());
        
        for (TelevisioOhjelma ohjelma: ohjelmat) {
            if (ohjelma.getPituus() <= maksimi) {
                System.out.println(ohjelma);
            }
        }
    }
}
