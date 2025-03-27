
package main;

public class Jatek {
    private static final String CSIGA = "\\xF0\\x9F\\x90\\x8C";
    public static void main(String[] args) {
        System.out.println(CSIGA);
        
        CsigaVerseny v1 = new CsigaVerseny();
        v1.verseny();
        
    }
}
