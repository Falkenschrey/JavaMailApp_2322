import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public abstract class Einwohner {

    String name;
    int einkommen;

    public Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }
    public int steuer() {
        if (zuVersteuern() <= 0) {return 1;}
        else {return zuVersteuern()/10;}
    }

    public int zuVersteuern() {
        return einkommen;
    }
}