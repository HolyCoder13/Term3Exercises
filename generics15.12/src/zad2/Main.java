package zad2;

public class Main {
    public static void main(String[] args) {
        Integer[] ai = {1,2,5,0};
        ArrayUtils.printArray(ai);

        Double[] ad={1.5,2.0,3.8};
        ArrayUtils.printArray(ad);

        Character[] ach = {'a','b','c'};
        ArrayUtils.printArray(ach);
        char ch=ArrayUtils.getCentral(ach);

        System.out.println("element centralny to "+ch);
        System.out.println("element makx to "+ArrayUtils.max(ach));

        String [] as ={"ala","Ala","ola","Ola"};
        System.out.println("element max to "+ArrayUtils.max(as));

        System.out.println("ile wiekszych od 1.7: "+ArrayUtils.countGreaterThan(ad,1.7));
        System.out.println("ile wiekszych od O: "+ArrayUtils.countGreaterThan(as,"O"));

        Osoba[] oa = new Osoba[]{
                new Osoba("23628384429", "Jan", "Kowalski"),
                new Osoba("12345678901", "Maria", "Nowak"),
                new Osoba("87342784678", "Adam", "Kowalski"),
                new Osoba("12345678999", "Maria", "Polak"),
                new Osoba("87342784678", "Adam", "Pudełko")
        };

        Osoba omax = ArrayUtils.max(oa);
        System.out.println(omax);

        int ile = ArrayUtils.countGreaterThan(oa,new Osoba(null,null,"L"));
        System.out.println("osob z nazwiskami od l do z "+ile);
    }
}
