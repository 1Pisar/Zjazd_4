public class Zad_9 {
    private String tytul;
    private String autor;
    private int rokWydania;

    public Zad_9(String tytul, String autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public boolean porownaj(Zad_9 innaksiazka) {
        return this.tytul.equals(innaksiazka.tytul) &&
                this.autor.equals(innaksiazka.autor) &&
                this.rokWydania == innaksiazka.rokWydania;
    }

    public void wyswietlInfo() {
        System.out.println("Tytuł: " + tytul + ", Autor: " + autor + ", Rok wydania: " + rokWydania);
    }

    public static void main(String[] args) {
        Zad_9 ksiazka1 = new Zad_9("Wiedźmin", "Andrzej Sapkowski", 1990);
        Zad_9 ksiazka2 = new Zad_9("Wiedźmin", "Andrzej Sapkowski", 1990);
        Zad_9 ksiazka3 = new Zad_9("Hobbit", "J.R.R. Tolkien", 1937);

        System.out.println(ksiazka1.porownaj(ksiazka2));
        System.out.println(ksiazka1.porownaj(ksiazka3));
    }
}
