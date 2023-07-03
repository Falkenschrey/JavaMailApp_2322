/*Eingabe: Zahl

        Ausgabe: ob richtige Zahl geraten wurde,

        wenn nicht, zurück zur Eingabe

        Ausnahme, bei Eingabe einer 0 beendet das Programm

        v2 Angabe ob Zahl zu groß oder zu klein ist
        v3 angabe von tipps ob eine richtige Zahl in der angabe drin ist und ob diese an der richtigen stelle ist oder nicht
*/

import java.util.Scanner;

public class Ratespiel {
    public static int dieGeheimeZahl = 2345;

    public static void main(String[] args) {

        // Prolog
        System.out.println("Ratespiel v3.0");
        System.out.println("Es wird nach einer Zahl gefragt,");
        System.out.println("wenn diese stimmt, ist das Programm zu Ende,");
        System.out.println("ansonsten wird weiter gefragt.");
        Scanner eingabe = new Scanner(System.in);

        dieGeheimeZahl = würfelEineZahlMitDerZifferanzahl(4);
//        System.out.println("Achtung, geheime Zahl lautet " + dieGeheimeZahl);

        boolean warDieZahlRichtigGeraten = false;
        int eingegebeneZahl;
        int anzahlDerRateversuche = 0;
        do {
            System.out.print("Bitte Tipp abgeben: ");
            eingegebeneZahl = eingabe.nextInt();
            if (eingegebeneZahl == 0) break;
            anzahlDerRateversuche++;
            warDieZahlRichtigGeraten = überprüfeZahl(eingegebeneZahl);
        } while ( ! warDieZahlRichtigGeraten );

        if (warDieZahlRichtigGeraten)
            System.out.println("Yeah, das ist die richtige Zahl!");
        else
            System.out.println("Schade, mehr Glück beim nächsten Mal.");
        System.out.println("Sie haben " + anzahlDerRateversuche + " Versuche gebraucht.");
    }

    private static int würfelEineZahlMitDerZifferanzahl(int anzahlZiffernFürGeheimeZahl) {
        do {
            dieGeheimeZahl = (int) (Math.random() * Math.pow(10, anzahlZiffernFürGeheimeZahl));
        } while ( istDieGeheimeZahlUngeeignet(anzahlZiffernFürGeheimeZahl) );
        return dieGeheimeZahl;
    }

    private static boolean istDieGeheimeZahlUngeeignet(int anzahlZiffernFürGeheimeZahl) {
        int anzahlUnterschiedlicherZiffern = 0;
        for (int ziffer=0; ziffer <= 9; ziffer++ )
            if (zifferInGeheimerZahlVorhanden(ziffer))
                anzahlUnterschiedlicherZiffern++;
        return (anzahlUnterschiedlicherZiffern != anzahlZiffernFürGeheimeZahl);
    }

    /* Übersicht, was diese Methode alles leisten soll:
       z.B. dieGeheimeZahl  = 753
            eingegebeneZahl = 123
            -> Hinweis      : eine Ziffer ist korrekt

       z.B. dieGeheimeZahl  = 753
            eingegebeneZahl = 321
            -> Hinweis      : eine Ziffer ist vorhanden

       z.B. dieGeheimeZahl  = 753
            eingegebeneZahl = 531
            -> Hinweis      : zwei Ziffern sind vorhanden

       z.B. dieGeheimeZahl  = 753
            eingegebeneZahl = 723
            -> Hinweis      : zwei Ziffern sind korrekt

       z.B. dieGeheimeZahl  = 753
            eingegebeneZahl = 731
            -> Hinweis      : eine Ziffer ist korrekt, eine Ziffer ist vorhanden

     */

    private static boolean überprüfeZahl(int eingegebeneZahl) {
        int anzahlKorrekterZiffern = 0;
        int anzahlVorhandenerZiffern = 0;
        int kopieDerEingegegebenZahl = eingegebeneZahl;
        int kopieDerGeheimenZahl = dieGeheimeZahl;

        while (eingegebeneZahl > 0) {
            int zifferDerGeheimenZahl = kopieDerGeheimenZahl % 10;
            int zifferDerEingegebenenZahl = eingegebeneZahl % 10;
            if (zifferDerGeheimenZahl == zifferDerEingegebenenZahl)
                anzahlKorrekterZiffern++;
            else if ( zifferInGeheimerZahlVorhanden(zifferDerEingegebenenZahl) )
                anzahlVorhandenerZiffern++;

            kopieDerGeheimenZahl /= 10;
            eingegebeneZahl /= 10;
        }
        System.out.println(anzahlKorrekterZiffern + " Ziffern sind korrekt");
        System.out.println(anzahlVorhandenerZiffern + " Ziffern sind vorhanden");

        return (kopieDerEingegegebenZahl == dieGeheimeZahl);
    }

    private static boolean zifferInGeheimerZahlVorhanden(int zifferDerZahl) {
        int kopieDerGeheimenZahl = dieGeheimeZahl;
        while (kopieDerGeheimenZahl > 0) {
            int zifferDerGeheimenZahl = kopieDerGeheimenZahl % 10;
            if (zifferDerGeheimenZahl == zifferDerZahl)
                return true;
            kopieDerGeheimenZahl /= 10;
        }
        return false;
    }
}




/*import java.util.Scanner;

public class Ratespiel {
    public static int GeheimeZahl=7134;
    public static void main(String[] args) {
        System.out.println("Welche Zahl suchen wir? Versuche dein Glück!");
        System.out.println("Ratespiel v3.0");
        Scanner eingabe = new Scanner(System.in);

    //Eingabe
        boolean richtigGeraten = false;
        int eingegebeneZahl;
        int versuche = 0;
        do {
            System.out.print("Bitte Tipp eingeben: ");
            eingegebeneZahl = eingabe.nextInt();
            if (eingegebeneZahl == 0) break;
            versuche++;
            richtigGeraten = ueberpruefeZahl(eingegebeneZahl);
        } while (!richtigGeraten);

        if (richtigGeraten)
            System.out.println("DAS HAT DIR DER TEUFEL GESAGT!!!");
        else
            System.out.println("Scheiße wenn man doof ist, mmmh?");
            System.out.println("Sie haben " + versuche + " Versuche gebraucht.");
    }

    private static boolean ueberpruefeZahl(int eingegebeneZahl) {
        int korrekteZahl=0;
        int vorhandeneZahl=0;
        int eingegebeneZahl2 = eingegebeneZahl;
        int GeheimeZahl2 = GeheimeZahl;

        while (eingegebeneZahl2 > 0) {
            int zifferGeheim = GeheimeZahl2 % 10;
            int zifferEingabe = eingegebeneZahl2 % 10;
            if (zifferGeheim == zifferEingabe)
                korrekteZahl++;
            else if (zifferGeheim(zifferEingabe))
                vorhandeneZahl++;

            GeheimeZahl2 /= 10;
            eingegebeneZahl2 /= 10;


        }
        System.out.println(korrekteZahl + " Ziffern sind korrekt.");
        System.out.println(vorhandeneZahl + " Ziffern sind vorhanden.");

        return (eingegebeneZahl == GeheimeZahl);
    }

    private static boolean zifferGeheim(int zifferEingabe) {
        int GeheimeZahl2 = GeheimeZahl;

        while (GeheimeZahl2 > 0) {
            int zifferGeheim = GeheimeZahl2 % 10;
             if (zifferGeheim == zifferEingabe)
                return true;
             GeheimeZahl2 /= 10;
        }
        return false;
    }
}

public class Ratespiel {
    public static void main(String[] args) {
        System.out.println("Welche Zahl suchen wir? Versuche dein Glück!");
        System.out.println("Ratespiel v2.0");
        Scanner eingabe = new Scanner(System.in);

        int eingegebeneZahl;
        int i=7134;
        do {
            System.out.print("Bitte Tipp eingeben: ");
            eingegebeneZahl = eingabe.nextInt();
            if (eingegebeneZahl == 0) {
                System.out.println("Scheiße wenn man doof ist, mmmh?");
                return;
                }
            else if (i > eingegebeneZahl) System.out.println("Das ist zu wenig");
            else if (i < eingegebeneZahl) System.out.println("Das ist zu viel");
        }while (eingegebeneZahl != i);
        System.out.println("DAS HAT DIR DER TEUFEL GESAGT!!!");
    }
}

public class Ratespiel {
    public static void main(String[] args) {
        System.out.println("Welche Zahl suchen wir? Versuche dein Glück!");
        System.out.println("Ratespiel v1.0");
        Scanner eingabe = new Scanner(System.in);

        int eingegebeneZahl;
        do {
            System.out.print("Bitte Tipp eingeben: ");
            eingegebeneZahl = eingabe.nextInt();
            if (eingegebeneZahl == 0) {
                System.out.println("Scheiße wenn man doof ist, mmmh?");
                return;
            }
        }while (eingegebeneZahl !=7134);
        System.out.println("DAS HAT DIR DER TEUFEL GESAGT!!!");

    }

}

*/