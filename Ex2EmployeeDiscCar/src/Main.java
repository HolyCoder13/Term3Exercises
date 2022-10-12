public class Main {
    public static void main(String[] args){
        //1
//        Pracownik p1 = new Pracownik("jan","kowalski",50,100,100);
//        p1.wyswietl();
//        Pracownik p2 = new Pracownik("anna","nowak",50,100);
//        p2.wyswietl();
//        p2.zmienPremie();
//        p2.wyswietl();
//        p1.zmienPremie(200);
//        p1.wyswietl();
//        p2.zmienPremie(550.50);
//        p2.wyswietl();
//        p2.zmienPremie();
//        //p2.wyswietl();
//        p2.czyJestPremia();

        //2
        Disc.setVat(23.0);
        Disc d1 = new Disc("IBM",2048,330);
        System.out.println(d1.wyswietl());
        System.out.println(d1.getBruttoPrice());

        //3

    }
}