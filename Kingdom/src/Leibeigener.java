public class Leibeigener extends Bauer{


    public Leibeigener(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int zuVersteuern() {
       return einkommen -12;
    }
}