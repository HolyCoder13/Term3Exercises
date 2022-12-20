package zad2;

import java.util.Arrays;

public class PlatnoscService {

    Platnosc[] tabPlatnosc;

    public PlatnoscService(Platnosc[] tabPlatnosc) {
        this.tabPlatnosc = tabPlatnosc;
    }

    public Platnosc[] getTabPlatnosc() {
        return tabPlatnosc;
    }

    public void setTabPlatnosc(Platnosc[] tabPlatnosc) {
        this.tabPlatnosc = tabPlatnosc;
    }

    @Override
    public String toString() {
        return "PlatnoscService{" +
                "tabPlatnosc=" + Arrays.toString(tabPlatnosc) +
                '}';
    }

    public double sumaPlatnosci(){
        double s=0.0;
        for(Platnosc p:tabPlatnosc)
            s+=p.cenaZVat();
        return s;
    }

    public double sumaPodatkow(){
        double s=0.0;
        for(Platnosc p:tabPlatnosc)
            s+=p.podatek();
        return s;
    }
}
