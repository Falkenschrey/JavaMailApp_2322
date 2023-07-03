



//#1

public class Zahl {

    public static void main(String[] args) {

        System.out.println("Liste der vollkommenen Zahlen:");
        for (int zahl = 2; zahl < 1_000_000; zahl++) {
            if (istZahlVollkommen(zahl))
                System.out.println(zahl);
        }
    }

    private static boolean istZahlVollkommen(int zahl) {
        int summe = 0;
        for (int teiler = 1; teiler < zahl; teiler++) {
            if (zahl % teiler == 0) {
                //System.out.println(teiler);
                summe = summe + teiler;
            }
        }
        if (summe == zahl)
            return true;
        else
            return false;
    }
}


/*//#1.1
import java.util.Scanner;

public class Zahl {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte zu prüfende Zahl eingeben: ");
        int zahl = eingabe.nextInt();

        int summe = 0;
        for (int teiler = 1 ;teiler < zahl ; teiler++) {
            if (zahl % teiler == 0) {
                System.out.println(teiler);
                summe = summe + teiler;
            }
        }
        System.out.println("Die summe aller Teiler ist " + summe);
        if (summe == zahl)
            System.out.println("Die Zahl ist vollkommen!");
        else
            System.out.println("Die Zahl ist Rotz...");
        if (summe == 1)
            System.out.print(" Und vor allem 'ne Primzahl du Schmock.");

    }
}


//#2
    public static void main(String[] args) {

        long startZeit = System.currentTimeMillis();

        int zehner, einser;
        for (zehner=1; zehner<=9; zehner++) {
            for (einser = 0; einser <= 9; einser++) {
                int dezimal = zehner * 10 + einser;
                int hexadezimal = einser * 16 + zehner;
                if (dezimal == hexadezimal) {
                    int hexa2 = hexadezimal * 10 / 15;
                    System.out.println("Symetrische Zahlen im Bereich 10 - 99 sind: " + dezimal + " + 0x" + hexa2);
                }
            }
        }
        long endeZeit = System.currentTimeMillis();
        long zeitdifferenz = endeZeit - startZeit;
        System.out.println(zeitdifferenz +"ms benötigt.");
    }
}*/
