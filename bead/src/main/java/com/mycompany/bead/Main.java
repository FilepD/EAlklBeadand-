/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bead;

import java.io.File;
import java.nio.file.Paths;

/**
 *
 * @author Fábián Levente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Eloado e1 = new Eloado("jani",2,"tanc");
         Eloado e2 = new Eloado("panni",3,"tanc");
         Eloado e3 = new Eloado("pali",4,"tanc");
         Rendezveny r  = new Rendezveny("bp", "tanc", "asd");
         r.setRendezvenyEloado(e1);
         r.setRendezvenyEloado(e2);
         r.setRendezvenyEloado(e3);
         System.out.println("");
         Konfer k =new Konfer();
         r.setRendezvenyEloado(k);
         System.out.println("");
         jsonMove j = new jsonMove();
         j.move();
         System.out.println("teszt üzenet");
         File f = new File("newjson");
         System.out.println(f.getAbsolutePath());
         System.out.println(Paths.get("").toAbsolutePath());
    }
    
}
