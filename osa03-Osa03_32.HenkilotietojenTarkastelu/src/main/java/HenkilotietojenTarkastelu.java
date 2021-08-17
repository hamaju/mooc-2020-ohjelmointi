
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int syntymavuosienSumma = 0;
        int syntymavuosienLkm = 0;
        String nimi = "";
        String pisin = "";

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(",");
            nimi = palat[0];
            int i = 0;
            while (i < palat.length) {
                if (nimi.length() > pisin.length()) {
                    pisin = nimi;
                }

                i++;
            }
            
            syntymavuosienSumma += Integer.valueOf(palat[1]);
            syntymavuosienLkm++;
        }

        System.out.println("Pisin nimi: " + pisin);

        if (syntymavuosienLkm > 0) {
            System.out.println("Syntymävuosien keskiarvo: " + (1.0 * syntymavuosienSumma / syntymavuosienLkm));
        } else {
            System.out.println("Ei syötteitä.");
        }
    }
}
