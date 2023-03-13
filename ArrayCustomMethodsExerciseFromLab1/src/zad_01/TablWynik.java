package zad_01;

public class TablWynik {
    float wartosc;
    int index;

    public TablWynik(float wartosc,int ind){
        this.wartosc=wartosc;
        this.index=ind;
    }
    public String toString(){return "(wartosc= "+wartosc+", index="+index+")";}
}

