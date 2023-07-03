public class Model {

    private String name;
    private int movement;
    private int leadership;
    private int health;
    private int strength;
    private int cost;

    public Model(String name, int movement, int leadership, int health, int strength, int cost){
        this.name = name;
        this.movement = movement;
        this.leadership = leadership;
        this.health = health;
        this.strength = strength;
        this.cost = cost;
    }
    public int getModelcost () {return this.cost;}
}
