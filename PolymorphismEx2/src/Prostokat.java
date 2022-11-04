public class Prostokat extends Figura{
    private  int wysokosc;
    private int szerokosc;

    Prostokat(){
        super(0,0);
        this.szerokosc=0;
        this.wysokosc=0;
    }
    Prostokat(int wysokosc,int szerokosc){
        this.wysokosc=wysokosc;
        this.szerokosc=szerokosc;
    }


    public void rysuj(){
        System.out.println("Rysuje prostokat: ");
        for(int j=wysokosc;j>0;j--){
            for(int k = szerokosc;k>0;k--)
                System.out.print("*");
            System.out.println(" ");

        }
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }
}
