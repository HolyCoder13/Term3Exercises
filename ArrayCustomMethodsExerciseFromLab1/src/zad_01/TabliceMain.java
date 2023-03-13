package zad_01;

import java.util.Scanner;

public class TabliceMain {
//    public static void run(){
   public static void main(String[] args){
        int rozmiar;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Podaj rozmiar tablicy: ");
            rozmiar = scanner.nextInt();
        }while(rozmiar<=0);
        float tabl[]=new float[rozmiar];
        System.out.println("Wprowadz elementy tablicy: ");
        for(int i=0;i<rozmiar;i++){
            tabl[i]=scanner.nextFloat();
        }
        System.out.println("Elementy tablicy o rozmiarze "+rozmiar+" to: ");
        for(int i=0;i<rozmiar;i++){
            System.out.println(tabl[i]);
        }

        System.out.println("Sredia artymetyczna elementow tablicy to "+TabliceMetodyPomocnicze.obliczSrednia(tabl));

        System.out.println(TabliceMetodyPomocnicze.znajdzMinOrazIndex(tabl));

        System.out.println(TabliceMetodyPomocnicze.znajdzMaxOrazIndex(tabl));

        float x=5;
        System.out.println("Szukanym elementem w tablicy jest "+x);
        int ind = TabliceMetodyPomocnicze.znajdzIndeksElementu(tabl,x);
        if(ind==-1)
            System.out.println("Nie znaleziono elementu "+x+" zatem wartosc indeksu nie istenieje");
        else
            System.out.println("Znaleziony element  "+x+" w tablicy ma indeks równy "+ind);

        System.out.println("Sprawdzamy ile jest dodatnich ujemnych i zer pośród elementów tablicy");
        System.out.println("Jest "+TabliceMetodyPomocnicze.obliczIlePlusMinusZer(tabl)+". ");
    }
}