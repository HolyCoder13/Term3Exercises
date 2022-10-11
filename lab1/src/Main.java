import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zad 1
        Scanner sc = new Scanner(System.in);
        int n;
        //pobieramy dl >0- petla zoporowa
        do {
            System.out.println("podaj dl wiersza");
            n = sc.nextInt();
        } while (n <= 0);
        //gorny trojkat
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)//w i ty wierszu drukujemy i *
                System.out.print("*");
            System.out.println();
        }
        //dolny trojkat
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++)//w i ty wierszu drukujemy i *
                System.out.print("*");
            System.out.println();
        }
        //zadanie 2
        Seans s = new Seans("Kevin sam w Nowym Jorku", "Chris Columbus", 120, 30.5, 75 );
        s.wyswietlInformacje();
        s.zarezerwujMiejsce();//ctrl d
        s.zarezerwujMiejsce();//ctrl d
        s.zarezerwujMiejsce();//ctrl d
        s.wyswietlZarezerwowane();
    }
}

