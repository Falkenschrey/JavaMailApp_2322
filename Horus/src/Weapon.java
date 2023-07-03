import java.sql.SQLOutput;

public class Weapon {
    private String name;
    private String type;
    private int reichweite;
    private int staerke;
    private int armourpircing;
    private int cost;

    public Weapon(String name, String type, int reichweite, int staerke, int armourpircing, int cost){
        this.name = name;
        this.type = type;
        this.reichweite = reichweite;
        this.staerke = staerke;
        this.armourpircing = armourpircing;
        this.cost = cost;
    }

    public int getWeaponcost () {return this.cost;}
}
