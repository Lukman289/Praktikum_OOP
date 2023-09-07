package tugas;

public class DemoLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();

        l.setR(5);
        System.out.println("=============================================");
        System.out.println("Luas Lingkaran\t\t: " + l.hitungLuas());
        System.out.println("Keliling Lingkaran\t: " + l.hitungKeliling());
        System.out.println("=============================================");
    }
}
