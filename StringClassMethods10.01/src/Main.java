public class Main {
    public static boolean czyDluzsze(String imie,String nazwisko,String zawod, int dlugosc){
        return imie.length()>dlugosc || nazwisko.length()>dlugosc || zawod.length()>dlugosc;
    }
    public static int ilePrePostFix(String[] tabs, String prepostfix, boolean czyPrefix){
        int licznik = 0;
        for(String s: tabs){
            if(czyPrefix){
                if(s.startsWith(prepostfix)) licznik++;
            }else
                if(s.endsWith(prepostfix)) licznik++;
        }
        return licznik;
    }

    public static String wytnijTekst(String tekst,int p,int k){
        String subString = tekst.substring(p-1,k); //urzyotkownik liczy od 1
        return "Tekst oryginalny: "+tekst+" zakres wycinania: "+" poczatek "+p+" koniec "+k+"\n wynik wycinainia: "+subString+" dlugosc wycietego tekstu (ze spacjami) "+(k-p+1);
    }

    public static void zad6(String s){
        char[] tab = s.toCharArray();
        for(char ch:tab){
            System.out.println(ch+" - "+(int)ch);
        }
    }
    public static final String stala=" tekst";

    public static void main(String[] args) {
       //1
        System.out.println(czyDluzsze("ala","kon","cokolwiek",4));

        //2
        String[] tab={"ala","Aleksandra","ola"};
        System.out.println(ilePrePostFix(tab,"Al",true));
        System.out.println(ilePrePostFix(tab,"a",false));

        //3
        System.out.println(wytnijTekst("ala ma  konia",4,9));

        //4
        Person p1 = new Person();
        p1.readData();
        System.out.println(p1);

        //5
        zad6("Ale ma kota");


        //7
        //tekst na wyrazy
        //pozbywanie przecinkow i kropek
        String nowaStala = stala.replace(","," ").replace(".","");
        System.out.println(nowaStala);
        //separator
        String[] slowa=nowaStala.split(" ");
        for(String s:slowa)
            System.out.println(s);
    }
}
