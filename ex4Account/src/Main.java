public class Main {
    public static void main(String[] args) {
    Konto k1 = new KontoDebetowe("ala b",1234,2344);
    System.out.println(k1.wyswietlInfo());
    Konto k2 = new KontoOszczendnosciowe("a c",234,2);
    k1.transfer(1000,k2);
    System.out.println(k2.wyswietlInfo());
    
    }
}
