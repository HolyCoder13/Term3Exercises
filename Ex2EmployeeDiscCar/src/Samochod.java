import java.time.LocalDate;

public class Samochod {
    //dek 
    private static String marka;
    private static String model;
    private static int rocznik;
    private int przebieg;
    private double spalanie;
    private int predkoscMaksymalna;
    private int predkoscAktualna;
    private double pojemnoscZbiornika;
    private int stanPaliwa;
    private String numerRejestracyjny;
    // 

    //kon 
    public Samochod(String marka,String model,double spalanie,int predkoscMaksymalna,double pojemnoscZbiornika, String numerRejestracyjny){
        this.marka=marka;
        this.model=model;
        this.spalanie=spalanie;
        this.predkoscMaksymalna=predkoscMaksymalna;
        this.pojemnoscZbiornika=pojemnoscZbiornika;
        this.numerRejestracyjny=numerRejestracyjny;
        this.rocznik= LocalDate.now().getYear();
    }
    //get 

    public static String getMarka() {
        return marka;
    }

    public static String getModel() {
        return model;
    }

    public static int getRocznik() {
        return rocznik;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public int getPredkoscMaksymalna() {
        return predkoscMaksymalna;
    }

    public int getPredkoscAktualna() {
        return predkoscAktualna;
    }

    public double getPojemnoscZbiornika() {
        return pojemnoscZbiornika;
    }

    public int getStanPaliwa() {
        return stanPaliwa;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    // 

    //Set 
    public static void setMarka(String marka) {
        Samochod.marka = marka;
    }

    public static void setModel(String model) {
        Samochod.model = model;
    }

    public static void setRocznik(int rocznik) {
        Samochod.rocznik = rocznik;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public void setSpalanie(int spalanie) {
        this.spalanie = spalanie;
    }

    public void setPredkoscMaksymalna(int predkoscMaksymalna) {
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    public void setPredkoscAktualna(int predkoscAktualna) {
        this.predkoscAktualna = predkoscAktualna;
    }

    public void setPojemnoscZbiornika(int pojemnoscZbiornika) {
        this.pojemnoscZbiornika = pojemnoscZbiornika;
    }

    public void setStanPaliwa(int stanPaliwa) {
        this.stanPaliwa = stanPaliwa;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }
    // 
    //Met
    public int zwrocWiek(){
        return LocalDate.now().getYear()-this.rocznik;
    }

    public void przyspiesz(int przyspieszenie){
        if(this.predkoscAktualna+przyspieszenie>=this.predkoscMaksymalna)
            this.predkoscAktualna=predkoscMaksymalna;
        else this.predkoscAktualna+=przyspieszenie;
    }

    public void zwolnij(int zwolnij){
        if(this.predkoscAktualna-zwolnij<=0)
            this.predkoscAktualna=0;
        else this.predkoscAktualna-=zwolnij;
    }
} 
 