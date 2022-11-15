public class KontoZOplatami extends Konto {

    private static final int LICZBA_BEZPLATNYCH_TRANSAKCJI = 5;
    private static final double OPLATA_ZA_TRANSAKCJE = 0.5;
    private int liczbaTransakcji;

    public KontoZOplatami(String imie_nazwisko, double saldo) {
        super(imie_nazwisko, saldo);
        this.liczbaTransakcji = 0;
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

    public void naliczOPlateZaTransakcje(){
        if (liczbaTransakcji-LICZBA_BEZPLATNYCH_TRANSAKCJI> 0)
        saldo-=(liczbaTransakcji-LICZBA_BEZPLATNYCH_TRANSAKCJI)*OPLATA_ZA_TRANSAKCJE;
    }

//    public boolean transfer(double kwota, Konto konto) {
//        if(saldo+debet>=kwota) {
//            konto.wplata(kwota);
//            this.wyplata(kwota);
//            return true;
//        }
//        return false;
//    }
    

    //    wypłata, wpłata – nadpisujemy metodę z nadklasy dodając w każdej z nich inkrementację
//    licznika transakcji
//      naliczOPlateZaTransakcje – zmniejsza stan konta o kwotę opłat za płatne transakcje
//            (powyzej limitu transakcji)
//• wyswietlInfo – nadpisuje metodę z nadklasy, uwzględniając specyfikę konta
//• oraz konstruktorem zerujacym liczbaTransakcji

}
