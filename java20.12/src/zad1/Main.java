package zad1;

public class Main {
    public static void main(String[] args) {

        Ksiazka ks1 = new Ksiazka("mickiewicz","pan tadek","pvn",2000);
        Ebook e1 = new Ebook("mickiewicz","dziady","pvn",2010,"pdf");
        ks1.printInfo();
        e1.printInfo();
        Biblioteka b=new Biblioteka(new Ksiazka[]{ks1,e1});
    }
}
