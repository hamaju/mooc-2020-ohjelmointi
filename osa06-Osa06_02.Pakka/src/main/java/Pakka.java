
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
public class Pakka {
    
    private ArrayList<String> pakka;
    
    public Pakka() {
        this.pakka = new ArrayList<>();
    }
    
    public boolean onTyhja() {
        return this.pakka.isEmpty();
    }
    
    public void lisaa(String arvo) {
        this.pakka.add(arvo);
    }
    
    public ArrayList<String> arvot()  {
        return this.pakka;
    }
    
    public String ota() {
        try {
            return this.pakka.get(this.pakka.size() - 1);
        } finally {
            this.pakka.remove(this.pakka.size() - 1);
        }
        //return this.pakka.remove(this.pakka.size() - 1);
    }
}
