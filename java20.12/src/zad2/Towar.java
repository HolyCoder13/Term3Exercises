package zad2;

public class Towar implements Platnosc {
    private String rodzaj,Nazwa;
    private double cenaNetto;
    private static double VAT;

    public Towar(String rodzaj, String nazwa, double cenaNetto) {
        this.rodzaj = rodzaj;
        Nazwa = nazwa;
        this.cenaNetto = cenaNetto;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public static double getVAT() {
        return VAT;
    }

    public static void setVAT(double VAT) {
        Towar.VAT = VAT;
    }

    @Override
    public String toString() {
        return "Towar{" +
                "rodzaj='" + rodzaj + '\'' +
                ", Nazwa='" + Nazwa + '\'' +
                ", cenaNetto=" + cenaNetto +
                '}';
    }


    @Override
    public double cenaZVat() {
        return cenaNetto+cenaNetto*VAT/100;
    }

    @Override
    public double podatek() {
        return cenaNetto*VAT/100;
    }
}
