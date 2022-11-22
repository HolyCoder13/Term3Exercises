public class Pociag extends Pojazd implements Combustion {

    private final int liczbaMiejsc;
    private double cenaBiletu;

    private double spalanie;

    public Pociag(String marka, String model, String kolor, int vMax, int liczbaMiejsc, double cenaBiletu, double spalanie) {
        super(marka, model, kolor, vMax);
        this.liczbaMiejsc = liczbaMiejsc;
        this.cenaBiletu = cenaBiletu;
        this.spalanie = spalanie;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public double getCenaBiletu() {
        return cenaBiletu;
    }

    public void setCenaBiletu(double cenaBiletu) {
        this.cenaBiletu = cenaBiletu;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }

    @Override
    public String toString() {
        return super.toString() +
                " liczbaMiejsc=" + liczbaMiejsc +
                ", cenaBiletu=" + cenaBiletu +
                ", spalanie=" + spalanie +
                '}';
    }

    @Override
    public double ileCzasuZajmie(double dystans) {
        return super.ileCzasuZajmie(dystans);
    }

    @Override
    public double ilePaliwaNaDystans(int dystans) {
        return dystans/500*spalanie;
    }
}
