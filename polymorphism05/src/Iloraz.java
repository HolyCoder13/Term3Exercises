public class Iloraz extends Wyrazenie{

    private Wyrazenie a,b;

    public Iloraz(Wyrazenie a,Wyrazenie b){
        this.a=a;
        this.b=b;
    }
    @Override
    double oblicz() {
        return a.oblicz()/b.oblicz();
    }

    @Override
    public String toString() {
        return "Iloraz{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}