
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String joukkue = lukija.nextLine();

        int otteluita = 0;
        int voittoja = 0;
        int tappioita = 0;

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] palat = rivi.split(",");
                String kotiJoukkue = palat[0];
                String vierasJoukkue = palat[1];
                int kotiPisteet = Integer.valueOf(palat[2]);
                int vierasPisteet = Integer.valueOf(palat[3]);

                // koti
                if (joukkue.equals(palat[0])) {
                    if (kotiPisteet > vierasPisteet) {
                        voittoja++;
                    } else {
                        tappioita++;
                    }

                    otteluita++;
                }
                // vieras
                if (joukkue.equals(palat[1])) {
                    if (vierasPisteet > kotiPisteet) {
                        voittoja++;
                    } else {
                        tappioita++;
                    }
                    
                    otteluita++;
                }
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        System.out.println("Otteluita: " + otteluita);
        System.out.println("Voittoja: " + voittoja);
        System.out.println("Tappioita: " + tappioita);
    }
}
