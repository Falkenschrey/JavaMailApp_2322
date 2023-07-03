public class Haus {

    private int Hausnummer;

    private int Stockwerk;

    public Haus(int Hausnummer, int Stockwerk){
        this.Hausnummer = Hausnummer;
        this.Stockwerk = Stockwerk;
    }
    public void bauen(){
        System.out.println("Die Wielandstraße " + this.Hausnummer + " stockt auf das " + this.Stockwerk + ". stockwerk auf.");
    }
}