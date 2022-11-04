public class Trojkat extends Figura {
private int wysokosc;

    Trojkat(){
        super(0,0);
        this.wysokosc=0;
    }


    Trojkat(int wysokosc){
         this.wysokosc=wysokosc;
     }



    public void rysuj(){
        for(int i=0;i<wysokosc;i++){
            for(int j =0;j<wysokosc-i;j++)
                System.out.print(' ');
            for(int j=0;j<i*2-1;j++)
                System.out.print('^');
            System.out.println();
        }
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }
}
