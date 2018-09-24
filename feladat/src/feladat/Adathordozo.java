/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat;

/**
 *
 * @author kelement
 */
public class Adathordozo {
    String nev;
    int kapacitas;

    public Adathordozo(String nev, int kapacitas) {
        this.nev = nev;
        this.kapacitas = kapacitas;
    }
    
    @Override
    public String toString() {
        return nev + " " + kapacitas;
    }
    
    public String nagyobbMint(Adathordozo adathordozo) {
        return (this.kapacitas > adathordozo.kapacitas) ? "Nagyobb" : "Kisebb";
    }
    
}
