public class Main {
    public static void main(String[] args) {
        KlasaZewnetrzna kz = new KlasaZewnetrzna(1);
        KlasaZewnetrzna.KlasaWewnetrzna kw = kz.new KlasaWewnetrzna(12);
        kw.printVariable();

        KlasaZewnetrzna.KlasaWewnetrznaStatyczna kws = new KlasaZewnetrzna.KlasaWewnetrznaStatyczna();
        KlasaZewnetrzna.KlasaWewnetrznaStatyczna.printVariableStatic();


    }
}
