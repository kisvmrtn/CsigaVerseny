
package main;

import java.util.Random;


public class Csiga {
    
    static final Random rnd = new Random();
    
    private String szin;
    private String szinKod;
    private String pozicio;
    private boolean gyorsito;
    
    public Csiga(String szin, String szinKod) {
        this.szin = szin;
        this.szinKod = szinKod;
        this.pozicio = "";
    }
    public String getSzin() {
        return szin;
    }
    public String getSzinKod() {
        return szinKod;
    }
    
    public String getPozicio() {
        return this.pozicio;
    }
    public void setPozicio(String pozicio) {
        this.pozicio += pozicio;
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
            egyseg += "|";
        } else {
            egysSzam = rnd.nextInt(0, 4);
            for (int i = 0; i < egysSzam; i++) {
                egyseg += "-";
            }
            egyseg += "|";
        }
        this.pozicio += egyseg;
    }
}
