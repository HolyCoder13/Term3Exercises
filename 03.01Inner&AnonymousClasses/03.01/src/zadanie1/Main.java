package zadanie1;

public class Main {
    public static void main(String[] args) {
        Teksty teksty = new Teksty(new String[]{"Ala","ma","konia"});
        StringIterator iterator = teksty.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
