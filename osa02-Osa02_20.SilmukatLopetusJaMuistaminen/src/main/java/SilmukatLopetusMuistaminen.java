
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int lukuja = 0;
        int parillisia = 0;
        int parittomia = 0;
        
        System.out.println("Syötä luvut:");
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                System.out.println("Kiitos ja näkemiin!");
                break;
            }
            
            if (luku % 2 == 0) {
                parillisia++;
            } else if (luku > 0 && luku % 2 != 0) {
                parittomia++;
            }
            
            summa += luku; // summa = summa + luku;
            lukuja++;
        }
        
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukuja);
        System.out.println("Keskiarvo: " + 1.0 * summa / lukuja);
        System.out.println("Parillisia: " + parillisia);
        System.out.println("Parittomia: " + parittomia);
    }
}
