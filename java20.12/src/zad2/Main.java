package zad2;

public class Main {
    public static void main(String[] args) {
        Towar.setVAT(20);
    Towar t1= new Towar ("spozywczy","mleko",2.4);
    Towar t2=new Towar("agd","tv",2000);
    Platnosc[] platnosci={t1,t2,new Platnosc() {
        @Override
        public double cenaZVat() {
            return 100;
        }

        @Override
        public double podatek() {
            return 20;
        }
    }};
    PlatnoscService platnoscService=new PlatnoscService(platnosci);
        System.out.println("suma platnosci "+platnoscService.sumaPlatnosci());
        System.out.println("suma podatkow "+platnoscService.sumaPodatkow());
    }
}
