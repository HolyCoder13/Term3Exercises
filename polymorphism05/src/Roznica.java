public class Roznica extends Wyrazenie{

    private Wyrazenie a,b;

    public Roznica(Wyrazenie a,Wyrazenie b){
        this.a=a;
        this.b=b;
    }
    @Override
    double oblicz() {
        return a.oblicz()-b.oblicz();
    }

    @Override
    public String toString() {
        return "Roznica{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}