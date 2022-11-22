public abstract class Pojazd {
    private final String marka;
    private final String model;
    private String kolor;
    private final int vMax;
    private double srednieSpalanie;

    public Pojazd(String marka, String model, String kolor, int vMax) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.vMax = vMax;
    }

    public double ileCzasuZajmie(double dystans){
        double ileZajmie = dystans/this.vMax;
        return ileZajmie;
    };

    @Override
    public String toString() {
        return
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                ", vMax=" + vMax +
                ", srednieSpalanie=" + srednieSpalanie +
                '}';
    }
}
