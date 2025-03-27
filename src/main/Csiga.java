
package main;

import java.util.Random;


public class Csiga {
    
    static final Random rnd = new Random();
    
    private String szin;
    private String pozicio;
    private int sebesseg;
    private boolean gyorsito;
    
    public Csiga(String szin) {
        this.szin = szin;
    }
    
    public String getSzin() {
        return szin;
    }
    
    public String getPozicio() {
        return this.pozicio;
    }
    public void setPozicio(String pozicio) {
        this.pozicio += pozicio;
    }
    public int getSebesseg() {
        return sebesseg;
    }
    public void setSebesseg(int sebesseg) {
        this.sebesseg = sebesseg;
    }
    public boolean getGyorsito() {
        return gyorsito;
    }
    public void setGyorsito(boolean gyorsito) {
        this.gyorsito = gyorsito;
    }
    
    public void mozog() {
        int egysSzam;
        String egyseg = "";
        if (this.gyorsito) {
            egysSzam = rnd.nextInt(0, 7);
            for (int i = 0; i < egysSzam; i++) {
            egyseg += "=";
            }
        } else {
            egysSzam = rnd.nextInt(0, 4);
            for (int i = 0; i < egysSzam; i++) {
                egyseg += "-";
            }
        }
        this.pozicio += egyseg;
        System.out.println(this.pozicio);
    }
}
