public class Main {
    public static void main(String[] args){

        Rower r1 = new Rower("rr","jakis-tam","bialy",30,7,2);
        Samochod s1 = new Samochod("bmw","e60","cz",300,200000,8);
        Pociag p1 = new Pociag("intercity","p","cze",300,100,30,40);

        Pojazd[] tabpoj = {r1,s1,p1};
        Vehicleservice vh1 = new Vehicleservice(tabpoj);
        vh1.wyswietlaCzasyPrzejazdow(100);
        System.out.println();
    }

}
