package main;

import java.util.Random;
import java.util.Scanner;

public class CsigaVerseny {
    
    static final Scanner scn = new Scanner(System.in);
    static final Random rnd = new Random();

    private Csiga[] Csigak;
    private int korok;
    private Csiga nyertes;
    private String tipp;
    
    
    public CsigaVerseny() {
        Csigak = new Csiga[3];
        Csigak[0] = new Csiga("piros");
        Csigak[1] = new Csiga("kek");
        Csigak[2] = new Csiga("zold");
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
    public String tipp() {
        return tipp;
    }
    public void verseny() {
        System.out.println("Tippelj egy csigára (P, K, Z): ");
        String tipp = scn.nextLine();
        this.tipp = tipp;
        
        Csigak[0].mozog();
        Csigak[1].mozog();
        Csigak[2].mozog();
    }
    
    public void gyorsitas() {
        int gyorsit = rnd.nextInt(1, 4);
        Csigak[0].setGyorsito(true);
    }
    
}
