
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
public class Tekstikayttoliittyma {
    
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.print("Komento: ");
            String komento = lukija.nextLine();
            
            if (komento.equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
            } 
            
            if (komento.equals("lisaa")) {
                System.out.print("Sana: ");
                String sana = lukija.nextLine();
                System.out.print("Käännös: ");
                String kaannos = lukija.nextLine();
                
                this.sanakirja.lisaa(sana, kaannos);
            } 
            
            if (komento.equals("hae")) {
                System.out.print("Haettava: ");
                String haettava = lukija.nextLine();
                String kaannos = this.sanakirja.kaanna(haettava);
                
                if (kaannos == null) {
                    System.out.println("Sanaa " + haettava + " ei löydy");
                } else {
                    System.out.println("Käännös: " + kaannos);
                }
            }
            
            else {
                System.out.println("Tuntematon komento");
            }
        }
    }
}
