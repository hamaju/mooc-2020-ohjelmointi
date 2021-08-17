/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Kirja {
    
    private String nimi;
    private int sivumaara;
    private int julkaisuvuosi;

    public Kirja(String nimi, int sivumaara, int julkaisuvuosi) {
        this.nimi = nimi;
        this.sivumaara = sivumaara;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getSivumaara() {
        return sivumaara;
    }
    
    public int getJulkaisuvuosi () {
        return julkaisuvuosi;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.sivumaara + " sivua, " + this.julkaisuvuosi;
    }
}
