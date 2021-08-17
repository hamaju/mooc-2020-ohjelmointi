
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        ArrayList<Lintu> linnut = new ArrayList<>();
        
        System.out.println("Komennot:");
        System.out.println("Lisaa - lisää linnun");
        System.out.println("Havainto - lisää havainnon");
        System.out.println("Tilasto - tulostaa kaikki linnut");
        System.out.println("Nayta - tulostaa yhden linnun");
        System.out.println("Lopeta - lopettaa ohjelman");
        System.out.println("");
        
        while (true) {
            System.out.print("? ");
            String komento = lukija.nextLine();
            
            if (komento.equals("Lisaa")) {
                System.out.print("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.print("Latinankielinen nimi: ");
                String latinankielinenNimi = lukija.nextLine();
                
                Lintu lintu = new Lintu(nimi, latinankielinenNimi);
                linnut.add(lintu);
            }
            
            if (komento.equals("Havainto")) {
                System.out.print("Mikä havaittu? ");
                String havaittu = lukija.nextLine();
                
                if (!linnut.contains(havaittu)) {
                    System.out.println("Ei ole lintu!");
                }
                
                for (Lintu lintu : linnut) {
                    if (havaittu.equals(lintu.getNimi())) {
                        lintu.havainto();
                    }
                }
            }    
            
            if (komento.equals("Tilasto")) {
                for (Lintu lintu : linnut) {
                    System.out.println(lintu);
                }
            }
            
            if (komento.equals("Nayta")) {
                System.out.print("Mikä? ");
                String naytettava = lukija.nextLine();
                
                for (Lintu lintu : linnut) {
                    if (lintu.getNimi().contains(naytettava)) {
                        System.out.println(lintu);
                    }
                }
            }
            
            if (komento.equals("Lopeta")) {
                break;
            }
        }
    }
}
