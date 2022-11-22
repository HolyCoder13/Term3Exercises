public class Samochod extends Pojazd implements Combustion {
    private int przebieg;
    private double spalanie;

    public Samochod(String marka, String model, String kolor, int vMax, int przebieg,int spalanie) {
        super(marka, model, kolor, vMax);
        this.przebieg = przebieg;
        this.spalanie=spalanie;
    }

    public void zwiekszPrebieg(int km){
        this.przebieg+=km;
    }

    public void UstawSpalanie(double spalanie ){
        this.spalanie=spalanie;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public double getSpalanie() {
        return spalanie;
    }


    @Override
    public double ileCzasuZajmie(double dystans) {
        return super.ileCzasuZajmie(dystans);
    }

    @Override
    public String toString() {
        return super.toString()+" srednie spalanie "+spalanie+" przebieg "+przebieg;
    }

    @Override
    public double ilePaliwaNaDystans(int dystans) {
        return dystans/100*spalanie;
    }
}


