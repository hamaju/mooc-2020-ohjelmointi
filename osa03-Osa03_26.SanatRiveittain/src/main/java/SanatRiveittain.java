
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String merkkijono = lukija.nextLine();
            if (merkkijono.equals("")) {
                break;
            }
            
            String[] palat = merkkijono.split(" ");
            for (int i = 0; i < palat.length; i++) {
                System.out.println(palat[i]);
            }
        }
    }
}
