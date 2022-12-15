package zad1;

public class Utils {
    public static <K,V> boolean compare(Pair<K,V> p,Pair<K,V> q){
        return p.getKey().equals(q.getKey())&&p.getValue().equals(q.getValue());
    }
}
