public class Stala extends Wyrazenie {
    private double wartosc;

    public Stala(){};

    public Stala(double wartosc){this.wartosc=wartosc;};

    public void setWartosc(double wartosc){this.wartosc=wartosc;};
    public double oblicz(){
        return wartosc;
    }
}
