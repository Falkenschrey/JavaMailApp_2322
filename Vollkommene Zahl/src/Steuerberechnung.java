import java.util.Scanner;

public class Steuerberechnung {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Bruttogehalt ein: ");
        double Brutto = eingabe.nextDouble();
        double Steuer = Brutto *0.2;
        double Netto = Brutto - Steuer;
        System.out.println("Das Nettogehalt beträgt " + Netto + "€. Die Steuerlichen Abgaben sind " + Steuer +"€.");
    }
}
