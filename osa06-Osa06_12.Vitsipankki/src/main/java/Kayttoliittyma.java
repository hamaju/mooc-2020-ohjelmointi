
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Kayttoliittyma {

    private Vitsipankki pankki;
    private Scanner lukija;
    
    public Kayttoliittyma(Vitsipankki pankki, Scanner lukija) {
        this.pankki = pankki;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.println("Komennot:");
            System.out.println(" 1 - lisää vitsi");
            System.out.println(" 2 - arvo vitsi");
            System.out.println(" 3 - listaa vitsit");
            System.out.println(" X - lopeta");
            
            String komento = lukija.nextLine();
            
            if (komento.equals("X")) {
                break;
            }
            
            if (komento.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsi = lukija.nextLine();
                pankki.lisaaVitsi(vitsi);
            } else if (komento.equals("2")) {
                System.out.println("Arvotaan vitsi.");
                System.out.println(pankki.arvoVitsi());
            }
            
            if (komento.equals("3")) {
                System.out.println("Tulostetaan vitsit.");
                pankki.tulostaVitsit();
            }
        }
    }
}
