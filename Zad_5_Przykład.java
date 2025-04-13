public class Zad_5_Przykład {
    private String imie;
    private String numerIndeksu;
    private String kierunek;

    public Zad_5_Przykład(String imie, String numerIndeksu, String kierunek) {
        this.imie = imie;
        this.numerIndeksu = numerIndeksu;
        this.kierunek = kierunek;
    }

    public void wyswietlInfo() {
        System.out.println("Student: " + imie + ", Numer indeksu: " + numerIndeksu + ", Kierunek: " + kierunek);
    }

    public static void main(String[] args) {
        Zad_5_Przykład student1 = new Zad_5_Przykład("Bartłomiej Pisarek", "168289", "Informatyka");

        student1.wyswietlInfo();
    }
}
