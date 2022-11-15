public abstract class Konto {
    /*
    Zdefiniuj klasę abstrakcyjną Konto reprezentującą rachunek bankowy.
Klasa posiada pola:
• imie_nazwisko // imię i nazwisko właściciela rachunku
• saldo // stan rachunku

Klasa oprócz konstruktora z parametrami oraz getterów i setterów posiada metody:
• wyswietlInfo – wyświetla w kolejnych liniach wszystkie informacje o rachunku
• zwrocStanKonta – zwracająca stan konta
• wpłata – zwiększa stan konta o przekazaną kwotę
• wyplata – jeżeli to możliwe, zmniejsza saldo o kwotę zadaną parametrem, jeśli nie zwraca
false

     */

    protected String imie_nazwisko;
    protected double saldo;

    public Konto(String imie_nazwisko, double saldo) {
        this.imie_nazwisko = imie_nazwisko;
        this.saldo = saldo;
    }

    public String getImie_nazwisko() {
        return imie_nazwisko;
    }

    public void setImie_nazwisko(String imie_nazwisko) {
        this.imie_nazwisko = imie_nazwisko;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String wyswietlInfo() {
        return "Imię i nazwisko właściciela: " + imie_nazwisko + "\n + saldo: " + saldo;
    }

    public double zwrocStanKonta() {
        return saldo;
    }

    public void wplata(double wplata) {
        saldo += wplata;
    }

    public boolean wyplata(double wyplata) {
        if(saldo-wyplata>=0) {
            saldo -= wyplata;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "imie_nazwisko='" + imie_nazwisko + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    /*W klasie Konto dodaj metodę logiczną transfer, która jako parametry dostaje kwotę
    i konto bankowe i dokonuje jeśli to możliwe transferu kwoty z konta na rzecz którego
    wykonywana jest metoda na konto przekazane parametrem.*/

    public boolean transfer(double kwota, Konto konto) {
        if(saldo-kwota >=0) {
            konto.wplata(kwota);
            this.wyplata(kwota);
            return true;
        }
        return false;
    }
}
//ta klasa jest abstrakcyjna nie mozna stworzyc instancji tej klasy
//uzytkownik moze miec konto bedace  jedna z 3 podklas - ma 1 z 3 typow konta
