
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String merkkijono = lukija.nextLine();
            if (merkkijono.equals("")) {
                break;
            }
            
            String[] palat = merkkijono.split(" ");
            int vika = palat.length - 1;
            System.out.println(palat[vika]);
        }
    }
}
