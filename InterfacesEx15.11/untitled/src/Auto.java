public class Auto extends Pojazd {
    private String marka;

    public Auto(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public void start() {
        super.start();
        System.out.println(this.marka+" pojazd rusza");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                '}';
    }
}
