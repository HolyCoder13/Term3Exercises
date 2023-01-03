package zadanie2;

public class Osoba {
    private int pesel;
    private String imie,nazwisko;



    public Osoba(String pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
