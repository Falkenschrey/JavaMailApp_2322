import java.util.Scanner;

public class Kreisfläche {

    public static void main (String[] args) {
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Bitte geben Sie den Radius ein: ");
        float radius = eingabe.nextFloat();

        float kreisfläche = (float) (3.1415 * radius * radius);

        System.out.println("Die Kreisfläche beträgt: " + kreisfläche);
    }
}