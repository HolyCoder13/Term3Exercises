public class KontoDebetowe extends Konto {

    private double debet;
    public KontoDebetowe(String imie_nazwisko, double saldo,double debet) {
        super(imie_nazwisko, saldo);
        this.debet = debet;
    }
    public boolean czyDebet(){
        return saldo<0;
    }

    @Override
    public boolean wyplata(double wyplata) {
        if(saldo-debet>=wyplata){
            saldo -= wyplata;
            return true;
        }
        return false;
    }

    public String wyswietlInfo(){
        return super.wyswietlInfo()+"mozliwy debet: "+ debet;
    }

    public boolean transfer(double kwota, Konto konto) {
        if(saldo+debet>=kwota) {
            konto.wplata(kwota);
            this.wyplata(kwota);
            return true;
        }
        return false;
    }
}
