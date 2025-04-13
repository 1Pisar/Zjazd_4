import java.util.ArrayList;

public class Zad_10 {
    private String tytul;
    private String autor;
    private int rokWydania;

    public Zad_10(String tytul, String autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void wyswietlInfo() {
        System.out.println("Tytuł: " + tytul + ", Autor: " + autor + ", Rok wydania: " + rokWydania);
    }

    public static void main(String[] args) {
        ArrayList<Zad_10> ksiazki = new ArrayList<>();

        ksiazki.add(new Zad_10("Wiedźmin", "Andrzej Sapkowski", 1990));
        ksiazki.add(new Zad_10("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 1997));
        ksiazki.add(new Zad_10("Mroczne materie", "Philip Pullman", 2003));
        ksiazki.add(new Zad_10("Zbrodnia i kara", "Fiodor Dostojewski", 1866));
        ksiazki.add(new Zad_10("Kod Leonarda da Vinci", "Dan Brown", 2003));

        System.out.println("Książki wydane po 2000 roku:");
        for (Zad_10 ksiazka : ksiazki) {
            if (ksiazka.getRokWydania() > 2000) {
                ksiazka.wyswietlInfo();
            }
        }
    }
}