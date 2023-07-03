/*      In einem mittelalterlichen Königreich wird das Steuerwesen auf IT umgestellt. Die verschiedenen Bevölkerungsgruppen
werden durch nachfolgende Klassenhierarchie modelliert. Das Attribut einkommen ist das Jahreseinkommen des Einwohners.
        Implementieren Sie die Klassenhierarchie samt der Methoden zuVersteuern() und steuer(), die für jeden Einwohner
        korrekte Werte gemäß königlicher Vorschriften liefern:

        Sofern das Gesetz nichts Anderes sagt, hat jeder Einwohner sein gesamtes Einkommen zu versteuern. Jeder
        Einwohner hat 10 % seines zu versteuernden Einkommens als Steuer zu entrichten. Der Steuerbetrag wird auf
        ganze Taler abgerundet, jedoch beträgt die Steuer immer mindestens 1 Taler.
        Das zu versteuernde Einkommen des Königs ist 0 - er zahlt somit 1 Taler.
        Für Angehörige des Adels beträgt die Steuer mindestens 20 Taler.
        Für Bauern gibt es keine speziellen Regeln.
        Bei Leibeigenen sind 12 Taler des Jahreseinkommens steuerfrei.

        Grundregel 1 soll direkt in der Klasse Einwohner implementiert werden – und in den Unterklassen gegebenenfalls
        überschrieben werden. In der Methode steuer() wird die Methode zuVersteuern() zweckmäßigerweise verwendet.
        Verwenden Sie zum Testen eine ausführbare Klasse Königreich. Das Programm soll laufen, bis es der Benutzer
        beendet. Bei jedem Durchgang kann der Benutzer vorgeben:

        Bevölkerungsgruppe, Namen und Einkommen des Individuums.

        Es wird dann für das entsprechende Objekt die Höhe der zu entrichtenden Steuer ausgegeben.


        */


import java.util.Objects;
import java.util.Scanner;

public class Königreich {

    private static boolean Sonderzeichen(String name) {
        for (int i=0; i < name.length(); i++) {
            char zeichen = name.charAt(i);
            if("0123456789-+/*!§$%&/()[]{}^°~#€@<>'\"\\".indexOf(zeichen) >= 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        while (true) {
            String name;
            Einwohner EW = null;
            System.out.println("Bitte geben sie die gefragten Informationen ein. Zum beenden der Anwendung geben Sie 'Beenden' ein.");
            System.out.println("Welchem Stand gehört der Bürger an?");
            String stand = eingabe.next();
            if (!(stand.equalsIgnoreCase("könig") || stand.equalsIgnoreCase("Adel") ||
                    stand.equalsIgnoreCase("Bauer") || stand.equalsIgnoreCase("Leibeigener"))) {
                System.out.println("Diesen Stand gibt es im Königreich nicht.");
                continue;
            }
            if (stand.equalsIgnoreCase("beenden")) {
                break;
            }
            do {
                System.out.println("Name des Bürgers?");
                name = eingabe.next();
            } while (Sonderzeichen(name));
                if (name.isEmpty()) break;
            if (name.equalsIgnoreCase("beenden")) {break;}
            System.out.println("Wie hoch ist das jährliche Einkommen des Bürgers");
            int einkommen = eingabe.nextInt();
            if (stand.equalsIgnoreCase("König")) {
                EW = new König(name, einkommen);
            }
            else if (stand.equalsIgnoreCase("Adel")) {
                EW = new Adel(name, einkommen);
            }
            else if (stand.equalsIgnoreCase("Bauer")) {
                EW = new Bauer(name, einkommen);
            }
            else if (stand.equalsIgnoreCase("Leibeigener")) {
                EW = new Leibeigener(name, einkommen);
            }
            System.out.println(name + " muss " + EW.steuer() + " Taler an Steuern entrichten.");
        }
    }
}