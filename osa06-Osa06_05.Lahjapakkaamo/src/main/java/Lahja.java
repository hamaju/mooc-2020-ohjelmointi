/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Lahja {
    
    private String nimi;
    private int paino;
    
    public Lahja(String nimi, int paino) {
        this.nimi = nimi;
        this.paino = paino;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getPaino() {
        return this.paino;
    }
    
    public String toString() {
        return "nimi" + "(" + this.paino + ")";
    }    
}
