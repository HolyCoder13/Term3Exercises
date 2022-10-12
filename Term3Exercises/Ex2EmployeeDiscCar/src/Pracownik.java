public class Pracownik {
    //dek
    private String imie;
    private String nazwisko;
    private double stawka;
    private double godz;
    private double premia;
    //

    //kons
    public Pracownik(String imie, String nazwisko, double stawka, double godz, double premia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawka = stawka;
        this.godz = godz;
        this.premia = premia;
    }

    public Pracownik(String imie, String nazwisko, double stawka, double godz) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawka = stawka;
        this.godz = godz;
    }
    //

    //Set
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setStawka(double stawka) {
        this.stawka = stawka;
    }

    public void setGodz(double godz) {
        this.godz = godz;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }
    //

    //get
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getStawka() {
        return stawka;
    }

    public double getGodz() {
        return godz;
    }

    public double getPremia() {
        return premia;
    }
    //

    //Metody
    public double obliczPodstawoweWynagrodzenie(){
        return this.stawka*this.godz;
    }

    public double obliczPelneWynagrodzenie(){
        return obliczPodstawoweWynagrodzenie()+this.premia;
    }

    public void zmienPremie(double premia){
        this.premia=premia;
        System.out.println("zmieniam premie w postaci double");
    }

    public void zmienPremie(){
        this.premia=1000;
        System.out.println("zmieniam premie w bez param");
    }

    public void zmienPremie(int premia){
        this.premia=premia;
        System.out.println("zmieniam premie w postaci int");
    }

    public void dajPodwyzke(double podwyzka){
        this.stawka+=podwyzka;
    }

    public void dajPodwyzke(){
        this.stawka+=100;
    }

    public boolean czyJestPremia(){
//        if(this.premia>0)return true;
//        else return false;
        return this.premia>0;
    }
    //

    //displaye
    public void wyswietl(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stawka=" + stawka +
                ", godz=" + godz +
                ", premia=" + premia + " wynagrodzenie " + obliczPelneWynagrodzenie();
    }
    //
}