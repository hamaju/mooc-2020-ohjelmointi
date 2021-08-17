
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int ika = 0;
        int suurin = 0;

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(",");
            ika = Integer.valueOf(palat[1]);
            int i = 0;
            while (i < palat.length) {
                if (suurin < ika) {
                    suurin = ika;
                }

                i++;
            }
        }

        System.out.println("Vanhimman ikä: " + suurin);
    }
}
