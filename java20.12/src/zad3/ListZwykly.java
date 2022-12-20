package zad3;

public class ListZwykly extends Przesylka{

    private int waga;

    public ListZwykly(int idAdresata, int waga) {
        super(idAdresata);
        this.waga = waga;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    @Override
    public double obliczCene() {
        if(waga<=350)
            return 0.75;
        else return 5.90;
    }

    @Override
    public String toString() {
        return "ListZwykly{} " + super.toString();
    }
}
