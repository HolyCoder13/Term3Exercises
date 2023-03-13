package zad_01;

public class PlusMinusZero {
    private int ilePlus;
    private int ileMinus;
    private int ileZero;

    public PlusMinusZero(int ilePlus,int ileMinus,int ileZero){
        this.ilePlus=ilePlus;
        this.ileMinus=ileMinus;
        this.ileZero=ileZero;
    }
    public String toString(){return "(dodatnich: "+ilePlus+",ujemnych: "+ileMinus+",zer: "+ileZero+")";}
}