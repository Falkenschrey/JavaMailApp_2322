public class Main {

    public static void main(String[] args) {
        Firma baeckerei = new Firma("Bäckerei" , "Brötchen", "Brezeln");
        Firma koehlerei = new Firma("Köhlerei" , "Kohle", "Graphit");

        baeckerei.produzieren();
        koehlerei.produzieren();
    }
}
