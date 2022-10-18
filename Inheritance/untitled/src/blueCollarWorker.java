public class blueCollarWorker extends Worker{
    private double stawka;
    private int liczba_godzin;

    public blueCollarWorker(){}

    public blueCollarWorker(String name, String last_name, int birth, int pesel, int employ_year, char gend, String company, String occupation, double stawka, int liczba_godzin) {
        super(name, last_name, birth, pesel, employ_year, gend, company, occupation); //superclass constructor invoked
        this.stawka = stawka;
        this.liczba_godzin = liczba_godzin;
    }

    public double getStawka() {
        return stawka;
    }

    public int getLiczba_godzin() {
        return liczba_godzin;
    }

    public void setStawka(double stawka) {
        this.stawka = stawka;
    }

    public void setLiczba_godzin(int liczba_godzin) {
        this.liczba_godzin = liczba_godzin;
    }
    public double calculatePayment(){
        return this.stawka*this.liczba_godzin;
    }

    @Override
    public String toString() {
        return "blueCollarWorker{" +
                "stawka=" + stawka +
                ", liczba_godzin=" + liczba_godzin +
                "} " + super.toString();
    }
    public void display(){
        System.out.println(toString());
    }

}
