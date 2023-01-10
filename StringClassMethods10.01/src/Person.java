import java.time.LocalDate;
import java.util.Scanner;
//import java.time.LocalDate;
public class Person {
    private String imie,nazwisko,pesel,data_urodzenia;
    private int wiek;
    private char plec;

    public void readData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie");
        imie= sc.nextLine();
        System.out.println("Podaj nazwisko");
        nazwisko= sc.nextLine();
        System.out.println("Podaj pesel");
        pesel= sc.nextLine();

        ustalDateUrodzenia();
        ustalPlecZPesela();
        ustalWiekZPesela();

    }
    //methody pomocnicze wyciagaje dane z pesela

    //wiek

    private void ustalWiekZPesela(){
        String srok=pesel.substring(0,2);
        //string na liczbe
        int rok = 1900 + Integer.parseInt(srok);
        wiek = LocalDate.now().getYear()-rok;
    }
//<2000 ru
    private void ustalDateUrodzenia(){
        data_urodzenia=pesel.substring(4,6)+"."+pesel.substring(2,4)+"."+pesel.substring(0,2);
    }

    private void ustalPlecZPesela(){
//        String stringKM = pesel.substring(9,10);
//        int liczba = Integer.parseInt(stringKM);
        char znak = pesel.charAt(9);
        int znakP = Character.getNumericValue(znak);
        if(znakP%2==0)
            plec='K';
        else
            plec='M';
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", data_urodzenia='" + data_urodzenia + '\'' +
                ", wiek=" + wiek +
                ", plec=" + plec +
                '}';
    }
}
