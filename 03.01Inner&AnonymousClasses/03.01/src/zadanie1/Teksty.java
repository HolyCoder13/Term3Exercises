package zadanie1;

public class Teksty {
    private final String[] teksty;


    public Teksty(String[] teksty) {
        this.teksty = teksty;
    }

    public StringIterator getIterator(){
        return new WlasnyIterator();
    }

    private class WlasnyIterator implements StringIterator{
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i<teksty.length;
        }

        @Override
        public String next() {
            return teksty[i++];
        }
    }
}
