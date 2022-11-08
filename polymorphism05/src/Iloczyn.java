public class Iloczyn extends Wyrazenie{

    private Wyrazenie a,b;

    public Iloczyn(Wyrazenie a,Wyrazenie b){
        this.a=a;
        this.b=b;
    }
    @Override
    double oblicz() {
        return a.oblicz()*b.oblicz();
    }

    @Override
    public String toString() {
        return "Iloczyn{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}