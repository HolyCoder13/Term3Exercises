public class Rower extends Pojazd{
    private final int iloscPrzerzutek;
    private int aktualnaPrzerzutka;

    public Rower(String marka, String model, String kolor, int vMax, int iloscPrzerzutek, int aktualnaPrzerzutka) {
        super(marka, model, kolor, vMax);
        this.iloscPrzerzutek = iloscPrzerzutek;
        this.aktualnaPrzerzutka = aktualnaPrzerzutka;
    }

    public int getAktualnaPrzerzutka() {
        return aktualnaPrzerzutka;
    }

    public void setAktualnaPrzerzutka(int aktualnaPrzerzutka) {
        this.aktualnaPrzerzutka = aktualnaPrzerzutka;
    }

    public int getIloscPrzerzutek() {
        return iloscPrzerzutek;
    }

    public void zmienPrzerzutke(int przerzutka){
        if ((przerzutka<=iloscPrzerzutek)&&(przerzutka>0)){
            aktualnaPrzerzutka=przerzutka;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" ilosc przrzutek "+iloscPrzerzutek+
                "aktualna: "+aktualnaPrzerzutka;
    }

    @Override
    public double ileCzasuZajmie(double dystans) {
        return super.ileCzasuZajmie(dystans);
    }
}
