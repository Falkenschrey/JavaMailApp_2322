public class Teilnehmer {

    public String name;

    private String vorname;

    public int alter;

    private String klasse;

    private String sternzeichen;

    public Teilnehmer(String name, String vorname, int alter, String klasse){
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.klasse = klasse;
        this.sternzeichen = "Volldepp";
    }
    public Teilnehmer(String name, String vorname, int alter, String klasse, String sternzeichen){
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.klasse = klasse;
        this.sternzeichen = sternzeichen;

    }
    public void status(){
        System.out.println(this.name + ", " + this.vorname + " vom Sternzeichen " + this.sternzeichen + " ist zu doof zum scheißen...");
    }
    public void setSternzeichen (String sternzeichen){
        this.sternzeichen = sternzeichen;
    }
    public String getSternzeichen (){
        return this.sternzeichen;
    }
}
