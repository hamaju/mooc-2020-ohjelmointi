/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Mittari {
    private int mitta;
    
    public Mittari() {
        this.mitta = 0;
    }
    
    public void lisaa() {
        if (this.mitta < 5) {
            mitta++;
        }
    }
    
    public void vahenna() {
        if (this.mitta > 0) {
            mitta--;
        }
    }
    
    public int mitta() {
        return mitta;
    }
    
    public boolean taynna() {
        if (this.mitta == 5) {
            return true;
        }
            
        return false;
    }
}
