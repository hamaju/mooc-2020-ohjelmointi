
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
public class Huone {
    
    private ArrayList<Henkilo> henkilot;
    
    public Huone() {
        this.henkilot = new ArrayList<>();
    }
    
    public void lisaa(Henkilo henkilo) {
        this.henkilot.add(henkilo);
    }
    
    public boolean onTyhja() {
        return this.henkilot.isEmpty();
    }
    
    public ArrayList<Henkilo> getHenkilot() {
        return this.henkilot;
    }
    
    public Henkilo lyhin() {
        if (this.henkilot.isEmpty()) {
            return null;
        }
        
        Henkilo palautettava = this.henkilot.get(0);
        for (Henkilo henkilo: this.henkilot) {
            if (henkilo.getPituus() < palautettava.getPituus()) {
                palautettava = henkilo;
            }
        }
        
        return palautettava;
    }
    
    public Henkilo ota() {
        try {
            return lyhin();
        } finally {
            henkilot.remove(this.lyhin());
        }
        // parempi tapa:
        //Henkilo lyhin = lyhin();
        //this.henkilot.remove(lyhin);
        //return lyhin;
    }
}
