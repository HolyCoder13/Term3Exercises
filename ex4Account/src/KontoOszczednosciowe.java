public class KontoOszczendnosciowe extends Konto{
    private double oprocentowanie;
    public KontoOszczendnosciowe(String imie_nazwisko,double saldo,double oprocentowanie){
        super(imie_nazwisko,saldo);
        this.oprocentowanie=oprocentowanie;
    }
    public double obliczOdsetki(){
        return saldo*oprocentowanie/100;
    }

    public void naliczOdsetki(){
        saldo+=obliczOdsetki();

    }

    public String wyswietlInfo(){
        return toString();
    }
    @Override
    public String toString() {
        return "KontoOszczendnosciowe{" +
                "oprocentowanie=" + oprocentowanie +
                ", imie_nazwisko='" + imie_nazwisko + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
