import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Schaltjahr-Checker!");
        System.out.println("Geben Sie die Jahreszahl ein:");
        Scanner scanner = new Scanner(System.in);
        int jahr = scanner.nextInt();
        if (jahr % 4 == 0) {
            System.out.println("Jo, ist ein Schaltjahr.");
        } else {
            System.out.println("Nope, ist kein Schaltjahr.");
        }


        for (int n = 1; n <= 100; n++){
            if (n % 2 == 1) {
                System.out.println(n + "... Weird");
            } else if (n % 2 == 0 && n >= 2 && n <= 5) {
                System.out.println(n + "... Not Wierd");
            } else if (n % 2 == 0 && n >= 6 && n <= 20) {
                System.out.println(n + "... Wierd");
            } else if (n % 2 == 0 && n >= 21){
                System.out.println(n + "... Not Wierd");
            }
        }
    }
}