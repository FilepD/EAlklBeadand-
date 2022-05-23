/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bead;

/**
 *
 * @author Fábián Levente
 */
public class Eloado implements Beszel {
    private String név;
    private int időtartam; // percben
    private String téma;

    public Eloado(String név, int időtartam, String téma) {
        this.név = név;
        this.időtartam = időtartam;
        this.téma = téma;
    }
        
    public String getNév() {
        return név;
    }


    public int getIdőtartam() {
        return időtartam;
    }

    public void setIdőtartam(int időtartam) {
        this.időtartam = időtartam;
    }

    public String getTéma() {
        return téma;
    }

    public void setTéma(String téma) {
        this.téma = téma;
    }
    public void kiabál(){
        System.out.println("");
    }
    public void motyog(){
        System.out.println("");
    }
}
