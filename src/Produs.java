abstract class Stoc {
    protected int nrProduse;

    abstract void GetStock();
}

interface Angajat {
    public void getJob();
    public void getNumber();
}

class Curier implements Angajat {
    public void getJob() {
        System.out.println("Livrez produse catre clienti.");
    }

    public void getNumber() {
        System.out.println("Sunt 30 de curieri angajati.");
    }
}

public class Produs extends Stoc {
    private String nume;
    private double pret;
    private String tip;
    private boolean reducere;

    public Produs(String nume, double pret, String tip) {
        this.nume = nume;
        this.pret = pret;
        this.tip = tip;
    }

    public void DescriereProdus(){
        System.out.println("Acesta este un produs\n " + "nume: " + nume + "\n " + "pret: " + pret + "\n " + "tip: " + tip);
    }

    public void DescriereProdus(boolean reducere){
        if (reducere == true){
            System.out.println("Acest produs este la reducere.");
        }
        else{
            System.out.println("Acest produs nu este la reducere.");
        }
    }

    public void GetStock(){
        System.out.println("Mai sunt " + nrProduse + " pe stoc.");
    }

    public void setPrice(double pret){
        this.pret = pret;
    }
}

class Laptop extends Produs {
    public Laptop(String nume, double pret, String tip) {
        super(nume, pret, "Electronice");
    }

    public void DescriereProdus() {
        System.out.println("Acesta este un laptop.");
    }

    public void DescriereProdus(boolean reducere) {
        System.out.println("Aceasta functie demonstreaza polimorfismul dinamic.");
    }
}
