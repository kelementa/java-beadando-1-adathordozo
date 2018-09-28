/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat;

import java.util.ArrayList;

/**
 *
 * @author Kelemen Tamás 1/14ED
 */
public class Feladat {
    
    static ArrayList<Adathordozo> adathordozo = new ArrayList<>();
    static Adathordozo adathordozo2[] = new Adathordozo[4];
    
    static void feltoltes() {
        // tömb feltöltése
        System.out.println("tömbök feltöltése...");
        adathordozo.add(new Merevlemez(1000, 5400));
        adathordozo.add(new Merevlemez(500, 7200));
        adathordozo.add(new Pendrive(32, 2));
        adathordozo.add(new Pendrive(128, 3));
        
        adathordozo2[0] = new Merevlemez(1000, 5400);
        adathordozo2[1] = new Merevlemez(500, 7200);
        adathordozo2[2] = new Pendrive(32, 2);
        adathordozo2[3] = new Pendrive(128, 3);
    }
    
    static void listazas() {
        // tömb tartalmának kirása
        System.out.println("tömbök listázása: ");
        for (int i = 0; i < adathordozo.size(); i++) {
            System.out.println(adathordozo.get(i).toString());
        }
        
        for (int i = 0; i < adathordozo2.length; i++) {
            System.out.println(adathordozo2[i].toString());
        }
    }
    
    
    static void legnagyobb() {
        // a legnagyobb adathordozó meghatározása
        System.out.println("a legnagyobb méretű elem: ");
        int legnagyobb = 0;
        for (int i = 0; i < adathordozo.size(); i++) {
            if (adathordozo.get(i).getKapacitas() > adathordozo.get(legnagyobb).getKapacitas()) {
                System.out.println(adathordozo.get(i).getKapacitas());
                legnagyobb = i;
                System.out.println(legnagyobb);
            }
        }
        System.out.println("A legnagyobb: " + adathordozo.get(legnagyobb).toString()); 
        
        int max = 0;
        for (int i = 0; i < adathordozo2.length; i++) {
            if (adathordozo2[i].getKapacitas() > adathordozo2[max].getKapacitas()) {
                System.out.println(adathordozo2[i].getKapacitas());
                max = i;
                System.out.println(max);
            }
        }
        System.out.println("A legnagyobb: " + adathordozo2[max].toString());
    }
    
    static void csakPendrive() {
        // csak a pendrive-ok listázása
        System.out.println("csak a pendriveok listázása: ");
        for (int i = 0; i < adathordozo.size(); i++) {
            if (adathordozo.get(i) instanceof Pendrive) {
                System.out.println(adathordozo.get(i).toString());
            }
        }
        
        for (int i = 0; i < adathordozo2.length; i++) {
            if (adathordozo2[i] instanceof Pendrive) {
                System.out.println(adathordozo2[i].toString());
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        feltoltes();
        listazas();
        legnagyobb();
        csakPendrive();
        
        
    }
    
}
