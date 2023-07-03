import java.util.Scanner;

public class Würfel {
    public static void main(String[] args) {
        Scanner eingabe=new Scanner(System.in);
        int wuerfelzahl;
        int num;
        int summe;
        String weiter;

        do {
            num = 1;
            summe = 0;
            System.out.println("Mit wie vielen Würfeln möchten Sie würfeln?");
            wuerfelzahl = eingabe.nextInt();
            while (wuerfelzahl >= 1) {
                int augen = (int) (Math.random() * 6) + 1;
                System.out.println("Würfel " + num + ": " + augen);
                summe = summe + augen;
                wuerfelzahl--;
                num++;
            }
            System.out.println("Gesamtaugenzahl: " + summe);

            System.out.println("Weiterspielen?");
            weiter = eingabe.next();
        }
        while (weiter.equalsIgnoreCase("ja")||
                weiter.equalsIgnoreCase("j")||
                weiter.equalsIgnoreCase("yes")||
                weiter.equalsIgnoreCase("ye")||
                weiter.equalsIgnoreCase("y")
        );
    }
}

//(int) (Math.random()*6)+1)