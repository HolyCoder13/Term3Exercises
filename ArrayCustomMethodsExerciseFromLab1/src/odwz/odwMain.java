package odwz;
import java.util.Scanner;

public class odwMain {
//dekl sc
    static Scanner sc = new Scanner(System.in);
//m
    public static void main(String[] args){
        int rozmiar;
        //zapora
        do{
            System.out.println("Podaj rozmiar tablicy ");
            rozmiar = sc.nextInt();
        }while(rozmiar<=0);
//dekl tab
        float tabl[] = new float[rozmiar];
//pod
        System.out.println("Podaj elementy tablicy:");
        for(int i=0;i<rozmiar;i++){
            System.out.println("Podaj "+(i+1)+" element:");
            tabl[i]=sc.nextFloat();
        }

        System.out.println("Elementy tablicy to: ");
        for(int j=0;j<rozmiar;j++){
            System.out.println(tabl[j]);
        }
    }
}
