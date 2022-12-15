package zad2;

public class Osoba implements Comparable<Osoba> {
    private String pesel,imie,nazwisko;

    public Osoba(String pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
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

    @Override
    public String toString() {
        return "Osoba{" +
                "pesel='" + pesel + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }


    @Override
    public int compareTo(Osoba o) {

        int c=nazwisko.compareTo(o.nazwisko);
        if(c==0)     // if same last name compare first name
        c=imie.compareTo(o.imie);
        return c;
    }
}
