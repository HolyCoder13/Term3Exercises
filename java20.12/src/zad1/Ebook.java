package zad1;

public class Ebook extends Ksiazka{

    private String Format;

    public Ebook(String autor, String tytul, String wydawnictwo, int rokWydania, String format) {
        super(autor, tytul, wydawnictwo, rokWydania);
        Format = format;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "Format='" + Format + '\'' +
                '}';
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    @Override
    public void printInfo(){
        super.printInfo(); //metoda z nadklasy
        System.out.println(String.format("format: " + this.Format));
    }

}
