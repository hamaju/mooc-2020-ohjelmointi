/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Harjoitusapuri {
    
    private int ika;
    private int leposyke;
    
    public Harjoitusapuri(int ika, int leposyke) {
        this.ika = ika;
        this.leposyke = leposyke;
    }
    
    public double tavoitesyke(double prosenttiaMaksimista) {
        // tavoitesyke: (maksimisyke - leposyke) * (tavoitesykeprosentti) + leposyke
        // maksimisyke: 206.3 - (0.711 * ikä)
        return ((206.3 - (0.711 * this.ika)) - this.leposyke) * 
                prosenttiaMaksimista + this.leposyke;
    }
}
