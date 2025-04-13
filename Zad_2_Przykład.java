public class Zad_2_Przykład {
    private String nazwa;
    private int rokPowstania;
    private String typ;

    public Zad_2_Przykład(String nazwa, int rokPowstania, String typ) {
        this.nazwa = nazwa;
        this.rokPowstania = rokPowstania;
        this.typ = typ;
    }

    public void wyswietlInfo() {
        System.out.println("Język: " + nazwa + ", Rok powstania: " + rokPowstania + ", Typ: " + typ);
    }

    public void zmienTyp(String nowyTyp) {
        this.typ = nowyTyp;
        System.out.println("Język " + nazwa + " zmienił typ na: " + typ);
    }

    public static void main(String[] args) {
        Zad_2_Przykład java = new Zad_2_Przykład("Java", 1995, "Kompilowany");

        java.wyswietlInfo();
        java.zmienTyp("Obiektowy");
        java.wyswietlInfo();
    }
}
