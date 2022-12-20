package zad1;


import java.time.LocalDate;
import java.util.Date;

public class Ksiazka {
    private String autor,tytul,wydawnictwo;
    private int rokWydania;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public Ksiazka(String autor, String tytul, String wydawnictwo, int rokWydania) {
        this.autor = autor;
        this.tytul = tytul;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "autor='" + autor + '\'' +
                ", tytul='" + tytul + '\'' +
                ", wydawnictwo='" + wydawnictwo + '\'' +
                ", rokWydania=" + rokWydania +
                '}';
    }

    public void printInfo(){
        System.out.println(toString());  //(this)
    }

    public int obliczIlelatTemuWydane(){
        Date d = new Date();
        int year = d.getYear();
        return year-this.rokWydania;
    }
}
