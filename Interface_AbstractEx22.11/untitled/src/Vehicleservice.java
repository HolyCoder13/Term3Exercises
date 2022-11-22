public class Vehicleservice {

private Pojazd[] tabPojazdow;

    public Vehicleservice(Pojazd[] tabPojazdow) {
        this.tabPojazdow = tabPojazdow;
    }

    public Pojazd[] getTabPojazdow() {
        return tabPojazdow;
    }

    public void setTabPojazdow(Pojazd[] tabPojazdow) {
        this.tabPojazdow = tabPojazdow;
    }

    public void wyswietlaCzasyPrzejazdow(int dystans){
        for(Pojazd p:tabPojazdow)
            System.out.println(p.ileCzasuZajmie(dystans));
    }
}
