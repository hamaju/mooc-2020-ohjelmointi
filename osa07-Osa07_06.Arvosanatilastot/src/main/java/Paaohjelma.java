
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        Arvosanarekisteri rekisteri = new Arvosanarekisteri();
        
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");

        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }
            
            if (luettu >= 0 && luettu <= 100) {
                rekisteri.lisaa(luettu);
            }
        }
        
        System.out.println("Pisteiden keskiarvo (kaikki): " + rekisteri.osallistujienKeskiarvo());
        System.out.println("Pisteiden keskiarvo (hyväksytyt): " + rekisteri.hyvaksyttyjenKeskiarvo());
        System.out.println("Hyväksymisprosentti: " + rekisteri.hyvaksymisprosentti());
        System.out.println("Arvosanajakauma:");
        for (int arvosana = 0; arvosana <= 5; arvosana++) {
            int tahtia = rekisteri.arvosananSaaneidenLkm(arvosana);
            System.out.print(arvosana + ": ");
            tulostaTahtia(tahtia);
            System.out.println("");
        }
    }
    
    public static void tulostaTahtia(int tahtia) {
        for (int i = 0; i < tahtia; i++) {
            System.out.print("*");
        }
    }
}
