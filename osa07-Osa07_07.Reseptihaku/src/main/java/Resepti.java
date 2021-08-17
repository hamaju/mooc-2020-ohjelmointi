
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Resepti {
    
    private String nimi;
    private int keittoaika;
    private ArrayList<String> aineet;
    
    public Resepti(String nimi, int keittoaika) {
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        this.aineet = new ArrayList<>();
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getKeittoaika() {
        return this.keittoaika;
    }
    
    public ArrayList getRaakaAineet() {
        return this.aineet;
    }
    
    public void lisaaRaakaAine(String aine) {
        this.aineet.add(aine);
    }
    
    @Override
    public String toString() {
        return this.nimi + ", keittoaika: " + keittoaika;
    }
}
