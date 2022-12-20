package zad3;

import java.util.Arrays;

public class Poczta {

    Przesylka[] tabPrzesylek;

    public Poczta(Przesylka[] tabPrzesylek) {
        this.tabPrzesylek = tabPrzesylek;
    }

    public Przesylka[] getTabPrzesylek() {
        return tabPrzesylek;
    }

    public void setTabPrzesylek(Przesylka[] tabPrzesylek) {
        this.tabPrzesylek = tabPrzesylek;
    }

    public double obliczLacznaWartosc() {
        double s = 0;
        for (Przesylka p : tabPrzesylek)
            s += p.obliczCene();
        return s;
    }

    ;
    @Override
    public String toString() {
        return "Poczta{" +
                "tabPrzesylek=" + Arrays.toString(tabPrzesylek) +
                '}';
    }
}


