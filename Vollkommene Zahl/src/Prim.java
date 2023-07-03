//Aufgabe:
//Es soll eine Zahl eingegeben werden, und als Ergebnis mitgeteilt werden, ob es sich um eine Primzahl handelt oder nicht.
//Lösungsvorschlag:
//(dazu benutzen wir die Methode, die wir für die vollkommene Zahl enworfen haben)

import java.util.Scanner;

public class Prim {
    // Variante 1
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte zu prüfenden Zahl eingeben: ");
        int zahl = eingabe.nextInt();
        int zahltest = 20;
        while (zahltest > 0) {
            if (istPrimzahl(zahl)) {
                System.out.println(zahl);
                zahltest--;
            }
            zahl++;
        }
    }

    private static boolean istPrimzahl(int zahl) {
        int summe = 0;
        for ( int teiler = 1; teiler < zahl; teiler++ ) {
            if (zahl % teiler == 0) {

                // alle Teiler aufaddieren !!
                summe = summe + teiler;
            }
        }

        if ( summe == 1 )
            return true;
        else
            return false;
        }
    }
