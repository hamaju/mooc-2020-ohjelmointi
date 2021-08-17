
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Resepti> reseptit = new ArrayList<>();
        
        System.out.print("Mistä luetaan? ");
        String tiedosto = lukija.nextLine();
        System.out.println("");
        System.out.println("Komennot:");
        System.out.println("listaa - listaa reseptit");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella");
        System.out.println("");
        
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String nimi = tiedostonLukija.nextLine();
                int keittoaika = Integer.valueOf(tiedostonLukija.nextLine());
                
                Resepti resepti = new Resepti(nimi, keittoaika);
                reseptit.add(resepti);
                
                while (tiedostonLukija.hasNextLine()) {
                    String aine = tiedostonLukija.nextLine();
                    resepti.lisaaRaakaAine(aine);
                    
                    // poistutaan toistolauseesta tyhjän rivin kohdalla,
                    // jonka jälkeen ulompi toistolause jatkaa
                    if (aine.isEmpty()) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        while (true) {
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();
            
            if (komento.equals("listaa")) {
                System.out.println("Reseptit:");
                for (Resepti resepti : reseptit) {
                    System.out.println(resepti);
                }

                System.out.println("");
            }
            
            if (komento.equals("hae nimi")) {
                System.out.print("Mitä haetaan: ");
                String haettava = lukija.nextLine();
                for (Resepti resepti : reseptit) {
                    if (resepti.getNimi().contains(haettava)) {
                        System.out.println(resepti);
                    }
                }
                
                System.out.println("");
            }
            
            if (komento.equals("hae keittoaika")) {
                System.out.print("Keittoaika korkeintaan: ");
                int haettava = Integer.valueOf(lukija.nextLine());
                for (Resepti resepti : reseptit) {
                    if (resepti.getKeittoaika() <= haettava) {
                        System.out.println(resepti);
                    }
                }
                
                System.out.println("");
            }
            
            if (komento.equals("hae aine")) {
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String haettava = lukija.nextLine();
                for (Resepti resepti : reseptit) {
                    if (resepti.getRaakaAineet().contains(haettava)) {
                        System.out.println(resepti);
                    } 
                }
                
                System.out.println("");
            }
            
            if (komento.equals("lopeta")) {
                break;
            }
        }
    }
}
