/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Laskuri {
    
    private int arvo;
    
    public Laskuri(int alkuarvo) {
        this.arvo = alkuarvo;
    }
    
    public Laskuri() {
        this.arvo = 0;
    }
    
    public int arvo() {
        return arvo;
    }
    
    public void lisaa() {
        this.arvo++;
    }
    
    public void vahenna() {
        this.arvo--;
    }
    
    public void lisaa(int lisays) {
        if (lisays >= 0) {
            this.arvo += lisays; 
        }
    }
    
    public void vahenna(int vahennys) {
        if (vahennys >= 0) {
            this.arvo -= vahennys;
        }
    }
}
