public class Seans {

    private String nazwa;
    private String nazwisko;
    private int czas;
    private double cena;
    private int lmiejsc;
    private boolean[] tabMiejsc;

    public Seans(String nazwa, String nazwisko, int czas, double cena, int lmiejsc) {
        this.nazwa = nazwa;
        this.nazwisko = nazwisko;
        this.czas = czas;
        this.cena = cena;
        this.lmiejsc = lmiejsc;
        //tablica miejs na poczatku wszytskie wolneczyli wszytskie false
        tabMiejsc = new boolean[lmiejsc];
        //tablica po stworzeniu zawiera ZERA, dla boolean false
        //mmay tablica samych false
    }
    //alt +insert
    //metody dostepowe
    //gettery- zwracajace wartosci pol

    public double getCena() {
        return cena;
    }
    //alt+ins


    public String getNazwa() {
        return nazwa;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getCzas() {
        return czas;
    }

    public int getLmiejsc() {
        return lmiejsc;
    }

    //settery -ustalaja wartosc pola na podstawie parametru
    public void setCena(double cena) {
        this.cena = cena;
    }
    //alt+ins

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setCzas(int czas) {
        this.czas = czas;
    }
//wyswietlZarezerwowane() - wyświetlającą indeksy wszystkich zarezerwowanych
//miejsc (fotele są numerowane od 1)
    //tablica false- wolne, true zarezerwowane

    public void wyswietlZarezerwowane() {
        //przechodzimy po tablicy i wyswietlamy numery pol z wartoscia true
        for (int i = 0; i < tabMiejsc.length; i++) {
            if (tabMiejsc[i] == true) //if(tabMiejsc[i])
                System.out.println(i + 1);
        }
    }
//    zarezerwujMiejsce() - metoda rezerwująca pierwsze dostępne miejsce i
//    zwracająca jego numer (fotele są numerowane od 1). Jeżeli nie ma wolnych miejsc
//    metoda zwróci -1.

    public int zarezerwujMiejsce() {
        //przechodzimy po tab i szukamy 1-go false
        for (int i = 0; i < tabMiejsc.length; i++) {
            //jesli miejsce wolne zwracamy numer i ustawiamy na zajeta
            if (tabMiejsc[i] == false) {
                tabMiejsc[i] = true;
                return i + 1;
            }
        }
        //jesli bylo wolne miejsce to funkcja juz sie skoczyla
        // jezel niema wolnych to nie bylo zadnego false
        return -1;
    }
    // wyswietlInformacje() - metoda wyświetlająca nazwę filmu, nazwisko reżysera,
    //długość filmu oraz cenę biletu.

    public void wyswietlInformacje() {
        System.out.println("Tytuł " + nazwa);
        System.out.println("Nazwisko reżysera " + nazwisko);
        System.out.println("Długość " + czas);
        System.out.println("Cena " + cena);
    }
    //toString
    //alt+ins

    @Override
    public String toString() {
        return "Seans{" +
                "nazwa='" + nazwa + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", czas=" + czas +
                ", cena=" + cena +
                '}';
    }
}
