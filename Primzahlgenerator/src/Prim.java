public class Prim {
private int startwert;

    public Prim(int startwert) {
        this.startwert = startwert;
    }

    public boolean pruefeaufprim (int zahl) {
        for (int teiler=2; teiler<zahl; teiler++) {
            int rest = zahl % teiler;
            if (rest == 0) return false;
        }
        return true;
    }

    // gib n
    public int generiere() {
        do {
            startwert++;
        }
        while (!pruefeaufprim(startwert));
        return startwert;
    }
}
