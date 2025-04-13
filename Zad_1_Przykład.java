public class Zad_1_Przykład {
    String nazwa;
    int rokPowstania;
    boolean obiektowy;

    public Zad_1_Przykład(String nazwa, int rokPowstania, boolean obiektowy) {
        this.nazwa = nazwa;
        this.rokPowstania = rokPowstania;
        this.obiektowy = obiektowy;
    }

    public void przedstawSie() {
        System.out.println("Język: " + nazwa);
        System.out.println("Rok powstania: " + rokPowstania);
        if (obiektowy) {
            System.out.println(nazwa + " jest językiem obiektowym.");
        } else {
            System.out.println(nazwa + " nie jest językiem obiektowym.");
        }
    }

    public static void main(String[] args) {
        Zad_1_Przykład java = new Zad_1_Przykład("Java", 1995, true);
        java.przedstawSie();
    }
}
