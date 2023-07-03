public class Adel extends Einwohner{

    public Adel(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int steuer() {
        if (einkommen/10 <= 20) {return 20;}
        else {return ((einkommen / 10));}
    }
}
