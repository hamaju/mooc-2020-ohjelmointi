/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Esine {
    
    private String tunnus;
    private String nimi;
    
    public Esine(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    
    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        }
        
        if (!(verrattava instanceof Esine)) {
            return false;
        }

        Esine verrattavaEsine = (Esine) verrattava;

        // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
        return this.tunnus.equals(verrattavaEsine.tunnus);
    }
    
    @Override
    public String toString() {
        return this.tunnus + ": " + this.nimi;
    }
}
