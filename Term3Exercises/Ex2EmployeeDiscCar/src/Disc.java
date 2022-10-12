public class Disc {
    //dek
    static double vat;
    private final String model;
    private final int capacity;
    private double price;
    //

    //kons
    public Disc(String model,int capacity,double price){
        this.model=model;
        this.capacity=capacity;
        this.price=price;
    }
    //

    //set
    public void setPrice(double price) {
        this.price = price;
    }

    public static void setVat(double vat) {
        Disc.vat = vat;
    }

    //nie ma seta do zmiany final

    //

    //get
    public String getModel(){
        return this.model;
    }

    public static double getVat() {
        return vat;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }
    //

    //Metody
    public double getBruttoPrice(){
        return this.price*(1+vat/100);
    }
    //

    //displaye
    public String wyswietl(){
        return this.toString();
    }
    @Override
    public String toString() {
        return "Disc{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
    //
}