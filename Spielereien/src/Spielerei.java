public class Spielerei {

    /* Methoden: Unterprogramme, Prozeduren, Funktionen, Subroutinen, (Report)
     *
     * Motivation:
     * - Mehrfach vorkommender Programmcode zusammenfassen
     * (Platz sparen, zur Wiederverwendung, Übersicht zu wahren)
     *  -> DRY (Don't repeat yourself)
     *  -> KISS (Keep it simple stupid)
     * - Einführung einer domainspezifischen Sprache
     * (Namen der Methoden erklären den Vorgang im Programm)
     * - Abstraktion bzw. Delegation von komplexen Aufgaben
     * (Top-Down-Entwurf entlastet den Entwickler von aktuell störenden Aufgaben)
     *
     * Aufbau von Methoden:
     * 2 Teile: Methodenkopf + Methodenrumpf
     * Methodenkopf: Modifikatoren + Datentyp + Namen + Parameter (in Klammern)
     * Methodenrumpf: das Zeug in den geschweiften Klammern {...}
     * Methodensignatur: Namen + Parameter
     * Modifikatoren : public static
     *
     * Beispiel aus der Mathematik
     * y = f(x)
     * f(x) = x*x
     * Funktion quadriert den übergebenen Parameter
     * y = f(2) = 4
     *
     */

    public static int f( int x ) {
        int berechnungsErgebnis = x * x;
        return berechnungsErgebnis;
    }

    public static int Boerb (int coi, int nuf) {
        if (nuf == 0) {
            return coi;         // Methode wird beendet, ergebnis steht fest
        }
        return coi + nuf;
    }

    public static void machmal() {
        System.out.println("Ich schussel mal was zusammen...");
        int y = f(3);
        System.out.println("Blubb ist " + y);
        int summe = Boerb(42,69);
        System.out.println("Set Volume at " + summe);
        }

    public static void AAAARGH() {
        System.out.println("WAAAAAGH!!!");
    }
        public static void main(String[] args){

        //Datentypen
        byte by = 127;
        by++;

        short sh = 32767;
        sh++;

        int in = Integer.MAX_VALUE;
        in++;

        long lo = Long.MAX_VALUE;
        lo++;

        machmal();
        AAAARGH();
        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lo);

        //Rechnen
        int a = 3;
        int b = a + 2;
        float c = b / a;
        float d = b % a;
        float fl = b / a;
        double dd = a + 0.5f;

        machmal();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(fl);
        System.out.println(dd);

        int aa =2;
        int bb =4;
        int cc = ++aa * bb--;

        machmal();
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);

        aa /= 3;   // gleiche wie: aa = aa / 3;
        bb *= 2;   // gleiche wie: bb = bb * 2;

        float betrag = 0.1f;
        float endbetrag = 0.0f;
        for (int i=0 ; i<10_000_000 ; i++){
            endbetrag += betrag;
        }
        machmal();
        AAAARGH();
        System.out.println(endbetrag);

        double doublebetrag = 0.1f;
        double doubleendbetrag = 0.0f;
        for (int i=0 ; i<10_000_000 ; i++){
            doubleendbetrag += doublebetrag;
        }
        machmal();
        AAAARGH();
        System.out.println(doubleendbetrag);
    }
}
