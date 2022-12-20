package zad3;

public class Main {
    public static void main(String[] args) {

        Paczka p1=new Paczka(454,456,12);
        Przesylka pp2 = new Przesylka(34556){

            @Override
            public double obliczCene() {
                return 50;
            }
        };

        Poczta poczta = new Poczta(new Przesylka[]{p1,pp2});
        System.out.println("laczna wartosc pzesylek : "+poczta.obliczLacznaWartosc());
    }
}
