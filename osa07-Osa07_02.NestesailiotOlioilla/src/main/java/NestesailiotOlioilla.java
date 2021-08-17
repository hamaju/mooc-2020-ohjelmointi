
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio eka = new Sailio();
        Sailio toka = new Sailio();
        
        while (true) {
            System.out.println("Ensimmäinen: " + eka);
            System.out.println("Toinen: " + toka);
            System.out.print("> ");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            
            String[] osat = luettu.split(" ");

            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);
            
            if (komento.equals("lisaa")) {
                eka.lisaa(maara);
            }
            
            if (komento.equals("siirra")) {
                if (maara > eka.sisalto()) {
                    maara = eka.sisalto();
                }
                
                eka.poista(maara);
                toka.lisaa(maara);
            }
            
            if (komento.equals("poista")) {
                if (maara > toka.sisalto()) {
                    maara = toka.sisalto();
                }
                
                toka.poista(maara);
            }
        }
    }
}
