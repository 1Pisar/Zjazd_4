import java.time.LocalDate;

public class Zad_7 {
    private int rokWydania;

    public Zad_7(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public int obliczWiek() {
        int bieżącyRok = LocalDate.now().getYear();
        return bieżącyRok - rokWydania;
    }

    public static void main(String[] args) {
        Zad_7 ksiazka = new Zad_7(2010);

        System.out.println("Wiek książki: " + ksiazka.obliczWiek() + " lat");
    }
}