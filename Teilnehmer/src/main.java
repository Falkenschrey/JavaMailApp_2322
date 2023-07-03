public class main {
    public static void main(String[] args) {
        Teilnehmer one = new Teilnehmer("Hirsch", "Harry", 69, "FIA");
        Teilnehmer two = new Teilnehmer("Mies", "Michael", 22, "FIA", "Krebs");
        one.status();
        two.status();
        two.setSternzeichen("deine Mudder");
        two.status();
        System.out.println(one.getSternzeichen());

    }
}
