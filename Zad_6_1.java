public class Zad_6_1 {

    public double powierzchnia(double promien) {
        return Math.PI * promien * promien;
    }

    public double powierzchnia(double szerokosc, double wysokosc) {
        return szerokosc * wysokosc;
    }

    public double powierzchnia(double podstawa, double wysokosc, boolean trojkat) {
        return 0.5 * podstawa * wysokosc;
    }

    public static void main(String[] args) {
        Zad_6_1 figura = new Zad_6_1();
        System.out.println("Powierzchnia koła: " + figura.powierzchnia(5));
        System.out.println("Powierzchnia prostokąta: " + figura.powierzchnia(5, 10));
        System.out.println("Powierzchnia trójkąta: " + figura.powierzchnia(5, 6, true));
    }
}
