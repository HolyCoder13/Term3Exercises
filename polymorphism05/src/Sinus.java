public class Sinus extends Wyrazenie{
    private Wyrazenie argument;
    public Sinus(Wyrazenie argument){this.argument=argument;}
    double oblicz(){return Math.sin(Math.toRadians(argument.oblicz()));}

    @Override
    public String toString() {
        return "Sinus{" +
                "argument=" + argument +
                '}';
    }
}
