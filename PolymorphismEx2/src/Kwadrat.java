public class Kwadrat extends Figura{
    private int szerokosc;

    Kwadrat(){
        super(0,0);
        this.szerokosc=0;
    }
    Kwadrat(int szerokosc){
        this.szerokosc=szerokosc;
    }


    public void rysuj(){
        System.out.println("Rysuje kwadrat: ");
        for(int j=szerokosc;j>0;j--){
            for(int k = szerokosc;k>0;k--)
                System.out.print("*");
            System.out.println(" ");

        }
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }
}
