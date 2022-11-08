public class KontoZOplatami extends Konto{

    private static final int liczba_bezplatnych_transakcji = 5;
    private static final double oplata_za_transfer = 0.5;
    private int liczbaTransakcji =0;

    public KontoZOplatami(String imie_nazwisko, double saldo){
        super(imie_nazwisko,saldo);
        this.liczbaTransakcji=0;
    }

    public int getLiczbaTransakcji() {
        return liczbaTransakcji;
    }

    public void setLiczbaTransakcji(int liczbaTransakcji) {
        this.liczbaTransakcji = liczbaTransakcji;
    }

    @Override
    public void wplata(double wplata) {
        super.wplata(wplata);
        liczbaTransakcji++;
    }

    @Override
    public boolean wyplata(double wyplata) {
        liczbaTransakcji++;
        return super.wyplata(wyplata);

    }

    public void naliczOplateZaTransakcje(){
        if(liczbaTransakcji-liczba_bezplatnych_transakcji>0)
        saldo-=(liczbaTransakcji-liczba_bezplatnych_transakcji)*oplata_za_transfer;
    }


}
