import java.util.Scanner;

/* Eingabe:

        Positive ganze Zahl eingeben
        z.B. 1234

        Ausgabe:

        Quersumme der Ziffern der Zahl
        z.B. 10

        Für Fortgeschrittene:

        mit Zerlegung in die einzelnen Ziffern
        z.B. 4 + 3 + 2 + 1 = 10
         int neuezahl = zahl/10;
            int rest = zahl - neuezahl *10; // sowas gibt es schon

*/

public class Quersumme {
    public static void main(String[] args) {
        //Eingabe
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine positive Zahl ein: ");
        int zahl = eingabe.nextInt();

        int summe = 0;                        // "akkumulator"
        while (zahl > 0) {
            int ziffer = zahl % 10;          // "modulo"
            summe = summe + ziffer;
            zahl = zahl / 10;               //ganzzahlige division

            // optischer Schnickschnack
            System.out.print(ziffer);
            if (zahl > 0) System.out.print(" + ");
            else System.out.print(" = ");
        }
        System.out.println(summe);
    }
}