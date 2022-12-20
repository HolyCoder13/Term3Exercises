package zad1;

public class Biblioteka {
    Ksiazka[] tabK;

    public Biblioteka(Ksiazka[] tabK) {
        this.tabK = tabK;
    }

    public Ksiazka[] getTabK() {
        return tabK;
    }

    public void setTabK(Ksiazka[] tabK) {
        this.tabK = tabK;
    }

    public void wyswietlInfo(){
        for(Ksiazka k:tabK)
            k.printInfo();
    }

    public int ileZtegoRoku(){
        int ile=0;
        for(Ksiazka k:tabK){
            if(k.getRokWydania()==2022)
                ile++;
        }
        return ile;

    }
}
