package tugas;

public class DemoBarang {
    public static void main(String[] args) {
        Barang b = new Barang();

        b.setBarang("001", "Lemari", 2000000, 10);
        b.tampilData();
        b.setBarang("002", "Kursi", 150000, 5);
        b.tampilData();
    }
}
