public class Main {
    public static void wyscig(Moveable... moveables){
        System.out.println("Zazynamy wyscig");
        for(Moveable m:moveables) m.start();
    }

    public static void showDifferentGreatings(Language... languages){
        System.out.println("Powitania roznych jezykow");
        for(Language l:languages) l.sayGreeting();
    }

    public static void main(String[] args){
        wyscig();
        System.out.println("----------------------");
        wyscig(new Pies("Azorek"));
        System.out.println("------------------");
        wyscig(new Pies("As"),new Pojazd(),new Auto("BMW"));

    }
}
