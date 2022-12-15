package zad2;

public class ArrayUtils {

    public static <T> T getCentral(T[] a){
        if(a==null || a.length==0)
            return null;
        else
            return a[a.length/2];
    }

    public static <T> void printArray(T[] arr){
        for(T el:arr)
            System.out.println(el);
    }

    public static <T extends Comparable<T>> T max(T[] arr){
        T maxel = arr[0];
        for(int i=1;i< arr.length;i++)
            if(arr[i].compareTo(maxel)>0)maxel=arr[i];
        return maxel;
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] a, T g){
        int licznik=0;
        for(T el: a)
            if(el.compareTo(g)>0) licznik++;
        return licznik;
    }


}
