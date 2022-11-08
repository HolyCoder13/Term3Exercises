public class Main {
    public static void main(String[] args){
    Zmienna x =new Zmienna();
    Wyrazenie y = new Suma(new Iloczyn(new Stala(2),x),new Stala(5));

    x.setWartosc(2.0);
    System.out.println(y.oblicz());
    x.setWartosc(10.0);
    System.out.println(y.oblicz());
    System.out.println(y);

    Zmienna a = new Zmienna("a",1.0);
    Zmienna b = new Zmienna("b",3.0);
    Zmienna c = new Zmienna("c",2.0);
    Wyrazenie f = new Iloraz(new Suma(new Iloczyn(new Stala(5),a), new Iloraz(new Stala(2),b)),new Sinus(c));
    System.out.println(f +" = "+f.oblicz());
    }
}
