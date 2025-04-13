public class Zad_8_Przykład {
    private double saldo;
    private double oprocentowanie;

    public Zad_8_Przykład(double saldo, double oprocentowanie) {
        this.saldo = saldo;
        this.oprocentowanie = oprocentowanie;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getOprocentowanie() {
        return oprocentowanie;
    }

    public double getKwotaZOdsetkami() {
        return saldo * (1 + oprocentowanie / 100);
    }

    public void wyswietlInfo() {
        System.out.println("Saldo: " + saldo + " PLN, Oprocentowanie: " + oprocentowanie + "%, Kwota z odsetkami: " + getKwotaZOdsetkami() + " PLN");
    }

    public static void main(String[] args) {
        Zad_8_Przykład konto = new Zad_8_Przykład(1000, 5);
        konto.wyswietlInfo();
    }
}
