
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int ika = 0;
        int suurin = 0;
        String nimi = "";
        String vanhin = "";

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(",");
            ika = Integer.valueOf(palat[1]);
            nimi = palat[0];
            int i = 0;
            while (i < palat.length) {
                if (suurin < ika) {
                    suurin = ika;
                    vanhin = nimi;
                }

                i++;
            }
        }

        System.out.println("Vanhimman nimi: " + vanhin);
    }
}
