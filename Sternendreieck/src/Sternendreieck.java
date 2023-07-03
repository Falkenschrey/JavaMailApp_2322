import java.util.Scanner;

/*

Eingabe:
Abfrage, Anzahl der Zeilen

Ausgabe bei 5 Zeilen:
* * * * *
 * * * *
  * * *
   * *
    *
 */

public class Sternendreieck {
    public static void main(String[] args) {
        //Eingabe
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Anzahl der Zeilen ein: ");
        int z = eingabe.nextInt();
        int l = 0;

        //Verarbeitung
        while (z != 0){
            for (int i = 0; i < l; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < z; i++) {
                System.out.print("* ");
            }
            System.out.println("");
            l++;
            z--;
        }
    }
}

        //Ausgabe
        //System.out.println("Dein Dreieck:";









