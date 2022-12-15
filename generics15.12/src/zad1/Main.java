package zad1;

public class Main {
    public static void main(String[] args) {
        Pair<Integer,String> p1 = new Pair<>(1,"apple");
        Pair<Integer,String> p2 = new Pair<>(2,"pear");
        Pair<Double,Double> p3 = new Pair<>(2.0,4.5); //autobox
        Pair<Double,Double> p4 = new Pair<>(2.5,10.0);

        Pair p5 = new Pair<>("ala",10.0);  //obj obj //Raw

        String s = (String)p5.getKey();  //cast to String from Raw type
        double d = p4.getValue(); //unboxing
        if(Utils.compare(p1,p2)){
            System.out.println("rowne");
        }else{
            System.out.println("rozne");
        }

    }
}
