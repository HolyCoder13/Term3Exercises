package zadanie2;

import java.util.Arrays;
import java.util.Comparator;


    public class Main {
        public static void main(String[] args) {
            Osoba[] osoby = new Osoba[]{new Osoba("12", "as", "df"), new Osoba("32", "ss", "aa"), new Osoba("32", "aa", "df"),};
            Arrays.sort(osoby, new Comparator<Osoba>() {
                public int compare(Osoba o1, Osoba o2) {
                    int comparingResult = o1.getNazwisko().compareTo(o2.getNazwisko());
                    if (comparingResult == 0) {
                        comparingResult = o1.getImie().compareTo(o2.getImie());
                    }
                    return comparingResult;
                }
            });
            System.out.println(osoby);
        }
    }

