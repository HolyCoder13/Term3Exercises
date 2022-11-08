public class Zmienna extends Wyrazenie {

    private String nazwa;
    private double wartosc;

    public Zmienna(){this.nazwa="x";}

    public Zmienna(String nazwa, double wartosc) {
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    @Override
    double oblicz() {
        return wartosc;
    }

    @Override
    public String toString() {
        return "Zmienna{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
