public class Autobus extends Pojazd implements Combustion {

    private final int liczbaMiejsc;
    private double cenaBiletu30min;
    private double spalanie;

    public Autobus(String marka, String model, String kolor, int vMax, int liczbaMiejsc, double cenaBiletu30min,double spalanie) {
        super(marka, model, kolor, vMax);
        this.liczbaMiejsc = liczbaMiejsc;
        this.cenaBiletu30min = cenaBiletu30min;
        this.spalanie=spalanie;
    }


    public void setCenaBiletu30min(double cenaBiletu30min){
        this.cenaBiletu30min=cenaBiletu30min;
    }

    public double kosztBiletowPotrzebnychDoPokonaniaDystansu(double dystans){
        double czas = ileCzasuZajmie(dystans);
        int ileBiletow = (int) Math.ceil(czas*2.0);
        double koszt = ileBiletow*cenaBiletu30min;
        return koszt;
    }

    @Override
    public double ileCzasuZajmie(double dystans) {
        return super.ileCzasuZajmie(dystans);
    }

    @Override
    public String toString() {
        return super.toString() +
                "liczbaMiejsc=" + liczbaMiejsc +
                ", cenaBiletu30min=" + cenaBiletu30min +
                ", spalanie=" + spalanie +
                '}';
    }

    @Override
    public double ilePaliwaNaDystans(int dystans) {
        return dystans/200*spalanie;
    }
}
