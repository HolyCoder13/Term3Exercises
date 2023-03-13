import java.util.Random;
import java.util.Scanner;
class IndeksyMax{
    int imax,jmax;
    public IndeksyMax(int i,int j){
        imax=i;
        jmax=j;
    }

}
public class Main {
    public static void printTab2D(int[][]t){
        for(int i=0;i<t.length;i++)
            for(int j=0;j<t[i].length;j++){
                System.out.println(t[i][j]);

            }

    }
    public static int sladmacierzy(int[][]t){
        int s=0;
        for(int i=0;i<t.length;i++){
            s+=t[i][i];

        }
        return s;
    }
    public static IndeksyMax wyznaczIndeksyElemMax(int[][]t){
        int iElMax=0,jElMax=0;
        int elMax=t[0][0];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(t[i][j]>elMax){
                    elMax=t[i][j];
                    iElMax=i;
                    jElMax=j;
                }
            }
        }
        return new IndeksyMax(iElMax,jElMax);
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Podaj rozmiar rablicy 2d ");
            n=sc.nextInt();
        }while(n<=0);

        int[][]t=new int [n][n];


        Random rand = new Random();
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                t[i][j]=rand.nextInt(11);
            }
        }
             printTab2D(t);
        System.out.println("slad maierz "+sladmacierzy(t));
       // System.out.println("slad maierz "+sladmacierzy(new int[][]{{1,1,1},{1,1,1}});
        IndeksyMax im = wyznaczIndeksyElemMax(t);
        System.out.println("pierwsze wysatpienie lementu max macierzy ");
        System.out.println("nr wiersza "+im.imax);
        System.out.println("nr kolumny "+im.jmax);
        System.out.println("el max  "+t[im.imax][im.jmax]);

        double[] srednie=obliczSrednieWierszami(t);
        for(double el:srednie)
            System.out.println(el);

        System.out.println("minima poszczegonych wierszy");
        for(int el:obliczMinimaWierszami(t)){
            System.out.println(el);
        }

    }
    public static int[] obliczMinimaWierszami(int[][] t){
        int[] tmin=new int[t.length]; //ablica na minima
        for(int i=0;i<t.length;i++){
            tmin[i]=t[i][0];
            for(int j=0;j<t[i].length;j++){
                if(t[i][j]<tmin[i]) tmin[i]=t[i][j];
            }
        }
        return tmin;
    }
    public static double[] obliczSrednieWierszami(int[][]t){
        double[] srw = new double[t.length];  //tablica na srednie  (dlugosc liczby wierszy)
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                srw[i]+=t[i][j];
            }
            srw[i]/=t[i].length;
        }
        return srw;
    }
}
