public class Suma extends Wyrazenie{

    private Wyrazenie a,b;

    public Suma(Wyrazenie a,Wyrazenie b){
        this.a=a;
        this.b=b;
    }
    @Override
    double oblicz() {
        return a.oblicz()+b.oblicz();
    }

    @Override
    public String toString() {
        return "Suma{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
