/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bead;

import java.util.ArrayList;



public class Rendezveny {
    //private Eloado e = new Eloado();
    private ArrayList <Eloado> e=new ArrayList<Eloado>();
    private String helyszin,nev,datum;
    
    public Rendezveny(String helyszin, String nev, String datum) {
        this.helyszin = helyszin;
        this.nev = nev;
        this.datum = datum;
    }
/*getter*/

    public ArrayList<Eloado> getEloado() {
        return e;
    }
    
    public String getHelyszin() {
        return helyszin;
    }

    public String getNev() {
        return nev;
    }

    public String getDatum() {
        return datum;
    }
/*setter*/ 
    public void setRendezvenyEloado(Eloado e){
        this.e.add(e);
    }

    public void setHelyszin(String helyszin) {
        this.helyszin = helyszin;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
    
}
