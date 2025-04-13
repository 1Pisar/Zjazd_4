public class Zad_6_3 {

    public double konwertuj(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double konwertujCelsjusz(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double konwertujKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Zad_6_3 konwersja = new Zad_6_3();
        System.out.println("Celsjusz na Fahrenheit: " + konwersja.konwertuj(25));
        System.out.println("Fahrenheit na Celsjusz: " + konwersja.konwertujCelsjusz(77));
        System.out.println("Celsjusz na Kelvin: " + konwersja.konwertujKelvin(25));
    }
}
