package main;

import java.util.Random;
import java.util.Scanner;

public class CsigaVerseny {
    
    static final Scanner scn = new Scanner(System.in);
    static final Random rnd = new Random();
    
    private int gyorsitIndex;
    private Csiga[] Csigak;
    private int korok;
    private Csiga nyertes;
    private String tipp;
    
    
    public CsigaVerseny() {
        Csigak = new Csiga[3];
        Csigak[0] = new Csiga("Piros", "\033[31m");
        Csigak[1] = new Csiga("Kék","\033[34m");
        Csigak[2] = new Csiga("Zöld","\033[32m");
    }
    
    
    public Csiga[] getCsigak() {
        return this.Csigak;
    }
    public int getKorok() {
        return korok;
    }
    public Csiga getNyertes() {
        return nyertes;
    }
    public void setNyertes(Csiga nyertes) {
        this.nyertes = nyertes;
    }
    public String getTipp() {
        return tipp;
    }
    public void verseny(int korSzam) {
        
        System.out.println("Tippelj egy csigára (P, K, Z): ");
        String tipp = scn.nextLine();
        this.tipp = tipp;
        
        for (int i = 0; i < korSzam; i++) {
            gyorsitas();
            Csigak[0].mozog();
            Csigak[1].mozog();
            Csigak[2].mozog();
        }
        System.out.printf("%s %s 🐌 (%d)\n",Csigak[0].getSzinKod(), Csigak[0].getPozicio(), (Csigak[0].getPozicio().length()-10));
        System.out.printf("%s %s 🐌 (%d)\n",Csigak[1].getSzinKod(), Csigak[1].getPozicio(), (Csigak[1].getPozicio().length()-10));
        System.out.printf("%s %s 🐌 (%d)\n",Csigak[2].getSzinKod(), Csigak[2].getPozicio(), (Csigak[2].getPozicio().length()-10));
        tippErtekeles();
    }
    
    public void tippErtekeles() {
        setNyertes(Csigak[0]);
        int cst = 0;
        switch(this.tipp) {
            case "K":
                cst = 1;
                break;
            case "Z":
                cst = 2;
                break;
        }
        
        for (int i = 1; i < Csigak.length; i++) {
            if (Csigak[i].getPozicio().length() > nyertes.getPozicio().length()) {
                setNyertes(Csigak[i]);
            }
        }
        if (Csigak[cst] == nyertes) {
            System.out.printf("\033[0m" + "Nyertes tipp! Győztes: %s%s\n", nyertes.getSzinKod(), nyertes.getSzin());
        } else {
            System.out.printf("\033[0m" + "Vesztes fogadás. Tipped: %s%s" + "\033[0m" + " Győztes: %s%s\n", Csigak[cst].getSzinKod(), Csigak[cst].getSzin(), nyertes.getSzinKod(), nyertes.getSzin());
        }
    }
    
    public void gyorsitas() {
        if (gyorsitIndex >= 0 && gyorsitIndex < Csigak.length) {
            Csigak[gyorsitIndex].setGyorsito(false);
        }
        
        gyorsitIndex = rnd.nextInt(0, 5);
    
        if (gyorsitIndex < Csigak.length) {
            Csigak[gyorsitIndex].setGyorsito(true);
        }
        
    }
    
}
