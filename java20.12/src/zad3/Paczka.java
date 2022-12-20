package zad3;

public class Paczka extends Przesylka{

    private int waga;
    private double wartoscUbezpieczenia;

    public Paczka(int idAdresata, int waga, double wartoscUbezpieczenia) {
        super(idAdresata);
        this.waga = waga;
        this.wartoscUbezpieczenia = wartoscUbezpieczenia;
    }

    @Override
    public double obliczCene() {
        return (waga+999)/1000.0*6.80+0.05*wartoscUbezpieczenia;
    }

    @Override
    public String toString() {
        return "Paczka{" +
                "waga=" + waga +
                ", wartoscUbezpieczenia=" + wartoscUbezpieczenia +
                "} " + super.toString();
    }
}
