public class TestFigur {
    public static void main(String[] args){

//        Trojkat t1 = new Trojkat(5);
//        t1.rysuj();
//        t1.zmaz();

        Figura[] tabFigur = new Figura[3];
        tabFigur[0] = new Trojkat(4);
        tabFigur[1] = new Kwadrat(6);
        tabFigur[2] = new Prostokat(5,7);

        for(Figura x: tabFigur)
            x.rysuj();
    }
}
