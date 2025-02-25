//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produs p = new Produs("bicicleta", 800, "transport");
        p.DescriereProdus();
        Produs a = new Produs("minge", 78.99, "Sport");
        a.DescriereProdus();
        p.nrProduse = 100;
        p.GetStock();
        p.setPrice(700);
        p.DescriereProdus();
        Produs b = new Laptop("Lenovo", 4000, "Electronic");
        b.DescriereProdus(true);
        b.DescriereProdus();
    }
}