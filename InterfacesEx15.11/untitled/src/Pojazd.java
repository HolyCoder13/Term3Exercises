public class Pojazd implements Moveable {

    public Pojazd() {
    }

    @Override
    public void start() {
        System.out.println("pojazd ruszyl");
    }

    @Override
    public void stop() {
        System.out.println("pojazd ZATRZYMAL SIE");
    }
}
