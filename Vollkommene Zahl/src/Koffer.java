import java.util.Scanner;

public class Koffer {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        String Items;
        String Koffer = "";

        do {
            System.out.println("Was packst du ein? (gib 'fertig' ein zum Beenden.)");
            Items = eingabe.next();

            if (!Items.equalsIgnoreCase("fertig")) {
                if (! Koffer.isEmpty() ) Koffer = Koffer + ", ";
                Koffer = Koffer + Items;
            }
            System.out.println("Kofferinhalt: " + Koffer);
        }
        while (!Items.equalsIgnoreCase("fertig"));
        System.out.println("Koffer ist mit "+ Koffer +" fertig gepackt. Ab in den Urlaub!");
    }
}
