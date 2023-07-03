import java.util.Scanner;

/*Eingabe:

        Stunden, Minuten, Sekunden

        Ausgabe:

        Anzahl Sekunden


        oder umgekehrt:

        Eingabe:

        Anzahl Sekunden

        Ausgabe:

        Stunden, Minuten, Sekunden

 */
public class Zeitumrechnung {

    public static void main(String[] args) {
        //Eingabe
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Anzahl der Stunden ein: ");
        int h = eingabe.nextInt();

        System.out.print("Bitte geben Sie die Anzahl der Minuten ein: ");
        int m = eingabe.nextInt();

        System.out.print("Bitte geben Sie die Anzahl der Sekunden ein: ");
        int z2 = eingabe.nextInt();
        //Verarbeitung:
        int i= z2+(m*60)+(h*60*60);

        //Ausgabe
        System.out.println("Die angegebene Zeit entspricht " + i +" Sekunden.");
    }
}

