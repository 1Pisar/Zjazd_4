public class Zad_6_2 {

    public void zapisz(String dane, String sciezka) {
        System.out.println("Zapisano do pliku: " + dane + " w ścieżce: " + sciezka);
    }

    public void zapisz(String dane, int id) {
        System.out.println("Zapisano do bazy danych: " + dane + " z ID: " + id);
    }

    public void zapisz(String dane) {
        System.out.println("Dane wyświetlone na ekranie: " + dane);
    }

    public static void main(String[] args) {
        Zad_6_2 zapis = new Zad_6_2();
        zapis.zapisz("Dane użytkownika", "plik.txt");
        zapis.zapisz("Dane użytkownika", 123);
        zapis.zapisz("Dane użytkownika");
    }
}
