/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat;

/**
 *
 * @author Kelemen Tamás 1/14ED Adathordozo.java
 */

public class Adathordozo {
    private String nev;
    private int kapacitas;

    public int getKapacitas() {
        return kapacitas;
    }

    public Adathordozo(String nev, int kapacitas) {
        this.nev = nev;
        this.kapacitas = kapacitas;
    }
    
    @Override
    public String toString() {
        return nev + ", kapacitás = " + kapacitas;
    }
    
    public boolean nagyobbMint(Adathordozo adathordozo) {
        return (this.kapacitas > adathordozo.kapacitas) ? true : false;
    }
    
}
