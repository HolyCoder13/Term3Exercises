package zad3;

public abstract class Przesylka {

    private int idAdresata;

    public abstract double obliczCene();

    public Przesylka(int idAdresata) {
        this.idAdresata = idAdresata;
    }

    public int getIdAdresata() {
        return idAdresata;
    }

    public void setIdAdresata(int idAdresata) {
        this.idAdresata = idAdresata;
    }

    @Override
    public String toString() {
        return "Przesylka{" +
                "idAdresata=" + idAdresata +
                '}';
    }
}

