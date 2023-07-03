//Einzahlen
//Dispokredit (So lange guthaben größer 0 keine Gebüren, sobald Guthaben kleiner 0 5% Gebühr. Maximum 500€
//Kreditlimit erhöhen
//Überzugszinsen erhöhen.
//V3.0
import java.util.Scanner;

public class GuthabenAuszahlung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double guthaben = 2000.00;
        double kreditlimit = 500.00;
        double überzugsgebühr = 0.10;
        double überzugszinsen = 12.0/100;
        double betrag;

        Hauptschleife:
        while (true) {
            System.out.println("Ihr Guthaben beträgt " + guthaben + " EUR.");
            System.out.println("Ihr Kreditlimit liegt bei " + kreditlimit + " EUR.");

            System.out.println("Hauptmenu");
            System.out.println("---------");
            System.out.println("1 - Einzahlen");
            System.out.println("2 - Abheben");
            System.out.println("3 - Kreditlimit erhöhen");
            System.out.println("4 - Überzugszinsen erheben");
            System.out.println("5 - Beenden");
            System.out.print("Ihre Auswahl: ");
            int auswahl = eingabe.nextInt();

            switch (auswahl) {
                case 1 :
                    System.out.println("Wieviel möchten Sie einzahlen?");
                    betrag = eingabe.nextDouble();
                    if (betrag < 0) {
                        System.out.println("Negative Beträge sind nicht zulässig");
                        continue;
                    }
                    guthaben = guthaben + betrag;
                    System.out.println("Der Betrag von " + betrag + " EUR wurde eingezahlt.");
                    break;
                case 2:
                    System.out.println("Wieviel möchten Sie abheben?");
                    betrag = eingabe.nextDouble();
                    if (betrag < 0) {
                        System.out.println("Negative Beträge sind nicht zulässig");
                        continue;
                    }
                    if (betrag <= guthaben) {
                        System.out.println("Der Betrag von " + betrag +
                                " EUR kann ausgezahlt werden.");
                        // guthaben = guthaben - betrag;
                        guthaben -= betrag; // gleiche wie eine zeile darüber
                    } else if (betrag <= guthaben + kreditlimit) {
                        System.out.println("Der Betrag von " + betrag +
                                " EUR kann mit Hilfe des Kreditlimits ausgezahlt werden");
                        guthaben = guthaben - betrag;
                        guthaben = guthaben - überzugsgebühr;
                    } else {
                        System.out.println("Zu wenig Guthaben und Kreditlimit vorhanden." +
                                " Auszahlung nicht möglich!");
                    }
                    break;
                case 3:
                case 4:
                    System.out.println("Diese Funktion ist noch nicht implementiert!");
                    break;
                case 5:
                    break Hauptschleife;
            }
            System.out.println(

            );
        }
        System.out.println("Vielen Dank und Auf Wiedersehen!");
    }
}













/*V2.0
import java.util.Scanner;

public class GuthabenAuszahlung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double guthaben = 2500.00;
        double anzeige = guthaben - 500;
        double betrag;
        System.out.println("Ihr Guthaben beträgt " + anzeige + "0€.");

        while (true) {
            System.out.println("Hauptmenu");
            System.out.println("---------");
            System.out.println("1 - Einzahlen");
            System.out.println("2 - Abheben");
            System.out.println("3 - Kreditlimit erhöhen");
            System.out.println("4 - Überzugszinsen erheben");
            System.out.println("5 - Beenden");
            System.out.print("Ihre Auswahl: ");
            int auswahl = eingabe.nextInt();

            if (auswahl == 5) break;
            if (auswahl != 1 && auswahl != 2 && auswahl != 3 && auswahl != 4) continue;

            if (auswahl == 1) {
                System.out.println("Wieviel möchten Sie einzahlen?");
            }
            else {
                System.out.println("Wieviel möchten Sie abheben?");
            }
            betrag = eingabe.nextDouble();

            if (betrag < 0) {
                System.out.println("Nö, einfach nö!");
                continue;
            }

            if (auswahl == 2) {
                if (betrag <= guthaben) {
                    System.out.println("Der Betrag von " + betrag + "0€ kann ausgezahlt werden.");
                    // guthaben = guthaben - betrag;
                    guthaben -= betrag; // gleiche wie eine zeile darüber
                    anzeige = guthaben - 500;
                    if (guthaben < 500) {
                        double betrag2 = betrag *0.12;
                        System.out.println("Sie haben kein ausreichendes Guthaben");
                        System.out.println("Gebühren für Dispokredit betragen 5%. Der Betrag von " + betrag2 + "0€ wird zusätzlich von Ihrem Konto abgezogen.");
                        guthaben -= betrag2;
                        anzeige = guthaben - 500;
                    }
                }
                else {
                    System.out.println("Zu wenig Guthaben vorhanden und Dispokredit ausgereizt. Auszahlung nicht möglich!");
                }
            }
            else {
                guthaben = guthaben + betrag;
                anzeige = guthaben - 500;
                System.out.println("Der Betrag von " + betrag + "0€ wurde eingezahlt.");
            }

            System.out.println("Ihr Guthaben beträgt " + anzeige + "0€.");
        }
        System.out.println("Vielen Dank und Auf Wiedersehen!");
    }
}




/*import java.util.Scanner;
//V1.0
public class GuthabenAuszahlung {
    public static void main(String[] args) {
        Scanner eingabe=new Scanner(System.in);
        while (true) {
            double guthaben = 2000;
            System.out.println("Was möchten Sie tun?");
            System.out.println("1 - Abheben");
            System.out.println("2 - Einzahlen");
            System.out.println("3 - Beenden");
            System.out.println("Ihre Auswahl: ");
            int auswahl = eingabe.nextInt();

            if (auswahl == 3) break;
            if (auswahl != 1 && auswahl !=2)
                continue;

            if (auswahl == 1) {
                System.out.println("Ihr aktuelles Guthaben beträgt " + guthaben + "0€. Wie viel möchten Sie abheben? ");
                double betrag = eingabe.nextDouble();
                if (betrag == 0) break;

                if (betrag < 0) {
                    System.out.println("Nö! Einfach Nö!");
                    continue;
                }

                if (betrag <= guthaben) {
                    //guthaben = guthaben - betrag;
                    guthaben -= betrag; // Des gleiche wie oben
                    System.out.println(betrag + "0€ kann ausgezahlt werden.");
                    System.out.println("Auszahlung:" + betrag + "0€");
                    System.out.println("Ihr neues Guthaben beträgt " + guthaben + "0€.");
                } else {
                    System.out.println("Sie haben nicht genug Guthaben.");
                    System.out.println("Ihr Guthaben beträgt " + guthaben + "0€.");
                }

            }

            if (auswahl == 2) {
                System.out.println("Ihr aktuelles Guthaben beträgt " + guthaben + "0€. Wie viel möchten Sie einzahlen?");
                double betrag = eingabe.nextDouble();
                if (betrag == 0) break;

                if (betrag < 0) {
                    System.out.println("Nö! Einfach Nö!");
                    continue;
                }
                    //guthaben = guthaben + betrag;
                guthaben += betrag; // Des gleiche wie oben
                System.out.println("der Betrag von " + betrag + "0€ wurde eingezahlt.");
                System.out.println("Ihr neues Guthaben beträgt " + guthaben + "0€.");
            }
        }
    }
}
*/