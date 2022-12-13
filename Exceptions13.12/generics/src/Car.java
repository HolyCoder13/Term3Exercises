public class Car {
    private String marka,model;
    private double stanPaliwa;
    private final double spalanie;
    private final int pojemnoscBaku;
    private int przebieg;

    public Car(String marka, String model, double stanPaliwa, double spalanie, int pojemnoscBaku, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.stanPaliwa = stanPaliwa;
        this.spalanie = spalanie;
        this.pojemnoscBaku = pojemnoscBaku;
        this.przebieg = przebieg;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", stanPaliwa=" + stanPaliwa +
                ", spalanie=" + spalanie +
                ", pojemnoscBaku=" + pojemnoscBaku +
                ", przebieg=" + przebieg +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getStanPaliwa() {
        return stanPaliwa;
    }

    public void setStanPaliwa(double stanPaliwa) {
        this.stanPaliwa = stanPaliwa;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public int getPojemnoscBaku() {
        return pojemnoscBaku;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    //checked exc
    void zatankuj(int paliwo) throws Exception{   //konieczne throws
        if((stanPaliwa+paliwo)>pojemnoscBaku || paliwo<0)
            throw new Exception("Za duzo paliwa przerkacza poj lub bledne dane");
        stanPaliwa+=paliwo;
    }

    void zatankujB(int paliwo) throws Exception{
        if((stanPaliwa+paliwo)>pojemnoscBaku || paliwo<0) throw new ZaDuzoPaliwaException("Za duzo paliwa przerkacza poj lub bledne dane");
        stanPaliwa+=paliwo;
    }


    //unchecked
    void jedz(int km) throws Exception{  //nie konieczne throws
        double ilePaliwa =km*spalanie/100;

        if(ilePaliwa>stanPaliwa || km<0)
            throw new IllegalArgumentException("Za malo paliwa do przejechania dystansu lub bledne dane ");
        //illegalArg dziedziczy po runtime exc unchecked
        stanPaliwa-=ilePaliwa;
    }

}
