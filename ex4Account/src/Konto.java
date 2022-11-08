public abstract class Konto {

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

    public double zwrocSaldoKonta(){
        return this.saldo;
    }

    public void wplata(double wplata){
        saldo+=wplata;
    }

    public boolean wyplata(double wyplata){
        if(saldo-wyplata>=0){
            saldo-=wyplata;
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

    public boolean transfer(double kwota, Konto konto){
        if(saldo-kwota>=0){
            konto.wplata(kwota);
            this.wyplata(kwota);
            return true;
        }
        return false;
    }


}
